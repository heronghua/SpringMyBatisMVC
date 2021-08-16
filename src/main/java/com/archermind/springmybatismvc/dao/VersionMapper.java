package com.archermind.springmybatismvc.dao;

import com.archermind.springmybatismvc.vo.Version;

public interface VersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Integer id);

    Version selectByType(String id);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}