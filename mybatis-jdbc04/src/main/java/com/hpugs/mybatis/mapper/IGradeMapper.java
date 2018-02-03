package com.hpugs.mybatis.mapper;

import com.hpugs.mybatis.pojo.Grade;

/**
 * @Description 类描述
 * @author 高尚
 * @version 1.0
 * @date 创建时间：2018年1月15日 下午2:25:34
 */
public interface IGradeMapper {
	
	Grade getGradeById(final Integer id);

}
