<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/static/header/metas.jsp"%>
<%@include file="/static/header/links.jsp"%>
<%@include file="/static/header/scripts.jsp"%>
<title>黑色水晶-后台管理-设备列表</title>
</head>
<body>
	<%@include file="/static/navbar.jsp"%>

	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed');
			} catch (e) {
			}
		</script>
		<div class="main-container-inner">

			<%@include file="/static/sidebar.jsp"%>

			<div class="main-content">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try {
							ace.settings.check('breadcrumbs', 'fixed')
						} catch (e) {
						}
					</script>
					<ul class="breadcrumb">
						<li>
							<i class="icon-home home-icon"></i>
							<a href="#">设备</a>
						</li>
						<li class="active">设备列表</li>
					</ul>
					<!-- .breadcrumb -->
				</div>
				<!-- /.breadcrumbs -->
				<div class="page-content">
					<div class="page-header">
						<h1>设备列表</h1>
					</div>
					<!-- /.page-header -->

					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->

							<div class="row">
								<div class="col-xs-12">
									<div class="table-header">Results for "Latest Registered Domains"</div>
									<div class="table-responsive">
										<table id="sample-table-2" class="table table-striped table-bordered table-hover">
											<thead>
												<tr>
													<th>ID</th>
													<th>Name</th>
													<th>Mac</th>
													<th>SN</th>
													<th><i class="icon-time bigger-110 hidden-480"></i> Regist Time</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="device" items="${devices }">
													<tr>
														<td><a href="#">${device.id }</a></td>
														<td>${device.name }</td>
														<td>${device.mac }</td>
														<td>${device.sn }</td>
														<td></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>

							<div class="hr hr-18 dotted hr-double"></div>

						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->

				</div>
				<!-- /.page-content -->
			</div>
			<!-- /.main-content -->

		</div>
		<!-- /.main-container-inner -->
	</div>
	<!-- /.main-container -->

	<%@include file="/static/footer/footerjs.jsp"%>

	<!-- inline scripts related to this page -->

	<script type="text/javascript">
		jQuery(function($) {
			var oTable1 = $('#sample-table-2').dataTable({
				"aoColumns" : [ {
					"bSortable" : false
				}, null, null, null, null, null, {
					"bSortable" : false
				} ]
			});

			$('table th input:checkbox').on(
					'click',
					function() {
						var that = this;
						$(this).closest('table').find(
								'tr > td:first-child input:checkbox').each(
								function() {
									this.checked = that.checked;
									$(this).closest('tr').toggleClass(
											'selected');
								});

					});

			$('[data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}
		})
	</script>
</body>
</html>