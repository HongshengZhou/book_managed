package com.book.dao;

import com.book.pojo.Borrowbook;

public interface BorrowbookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Borrowbook record);

    int insertSelective(Borrowbook record);

    Borrowbook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Borrowbook record);

    int updateByPrimaryKey(Borrowbook record);
}