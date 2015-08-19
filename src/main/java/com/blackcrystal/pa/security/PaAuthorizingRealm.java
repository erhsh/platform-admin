package com.blackcrystal.pa.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaAuthorizingRealm extends AuthorizingRealm {

	private Logger logger = LoggerFactory.getLogger(PaAuthorizingRealm.class);

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {

		UsernamePasswordToken upt = (UsernamePasswordToken) token;

		String username = upt.getUsername();
		logger.info("auth username = {}", username);

		AuthenticationInfo authInfo = new SimpleAuthenticationInfo("admin",
				"admin", "admin haha");
		return authInfo;

	}

}
