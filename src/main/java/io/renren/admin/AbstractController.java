package io.renren.admin;

import io.renren.entity.SysUserEntity;
import io.renren.utils.ShiroUtils;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller公共组件
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年11月9日 下午9:42:26
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		logger.error("1111=="+SecurityUtils.getSubject().getPrincipal().toString());
		logger.error("aaaa=="+SecurityUtils.getSubject().getPrincipal().getClass().getClassLoader());
		logger.error("bbbb=="+SysUserEntity.class.getClassLoader());
		
		
		
		
		return (SysUserEntity)SecurityUtils.getSubject().getPrincipal();
		//return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
//		return getUser().getUserId();
		return (Long)SecurityUtils.getSubject().getPrincipal();
	}
}
