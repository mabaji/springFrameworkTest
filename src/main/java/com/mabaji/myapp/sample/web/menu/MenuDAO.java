package com.mabaji.myapp.sample.web.menu;

import com.mabaji.myapp.standard.common.exception.CommonException;
import com.google.gson.JsonObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuDAO {
    List<MenuVO> getMenuVOList(final JsonObject param) throws CommonException;
}
