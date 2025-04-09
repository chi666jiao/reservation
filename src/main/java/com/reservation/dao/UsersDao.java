
package com.reservation.dao;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reservation.entity.UsersEntity;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户
 */
public interface UsersDao extends BaseMapper<UsersEntity> {
	
	List<UsersEntity> selectListView(@Param("ew") Wrapper<UsersEntity> wrapper);

	List<UsersEntity> selectListView(Pagination page, @Param("ew") Wrapper<UsersEntity> wrapper);
	
}
