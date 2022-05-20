package com.todo3.todo33.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo3.todo33.entity.Todo;

@Mapper
public interface TodoMapper {

    public List<Todo> selectAll();

    public void add(Todo todo); //add
    
}