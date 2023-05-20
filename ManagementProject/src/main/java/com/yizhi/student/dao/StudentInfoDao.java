package com.yizhi.student.dao;

import com.yizhi.student.domain.StudentInfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 生基础信息表
 * @author dunhf
 * @email 499345515@qq.com
 * @date 2019-08-01 09:45:46
 */
@Mapper
public interface StudentInfoDao {

	StudentInfoDO get(Integer id);

	//分页查询
	List<StudentInfoDO> list(Map<String,Object> map);

	//查询学生总数
	int count(Map<String,Object> map);

	//保存信息
	int save(StudentInfoDO studentInfo);

	//更新信息
	int update(StudentInfoDO studentInfo);

	//删除信息
	int remove(Integer id);

	//批量删除信息
	int batchRemove(Integer[] ids);
}
