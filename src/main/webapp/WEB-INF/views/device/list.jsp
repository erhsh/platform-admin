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
			</div>
			<!-- /.main-content -->

		</div>
		<!-- /.main-container-inner -->
	</div>
	<!-- /.main-container -->

	<%@include file="/static/footer/footerjs.jsp"%>
</body>
</html>