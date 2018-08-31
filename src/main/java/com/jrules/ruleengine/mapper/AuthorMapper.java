package com.jrules.ruleengine.mapper;

import com.jrules.ruleengine.model.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthorMapper {

	public int insert(Author author);
	public int update(Author author);
	public Author get(@Param("authorId") String authorId,@Param("bizId") Integer bizId);
	public Author getBaseInfo(@Param("authorId") String authorId,@Param("bizId") Integer bizId);
    public int save(Author author);
}
