package com.jrules.ruleengine.service;

import javax.annotation.PostConstruct;

import com.jrules.ruleengine.mapper.AuthorMapper;
import com.jrules.ruleengine.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

	@Autowired
	AuthorMapper authorMapper;
	
	@PostConstruct
	public void test(){
		String authorId = System.currentTimeMillis()+"";
		Author author = new Author();
		author.setAuthorId(authorId);
		author.setBizId(1);
		author.setAuthorName("test:"+authorId);
		author.setActive(1);
		author.setAuthorLevel("1");
		author.setAuthorType("1");
		author.setIntroduction("test");
		this.saveAuthor(author);
		
		Author author1 = this.getAuthorById(authorId, 1);
		
		System.out.println(author1.getAuthorName());
		
	}
	
	public Author getAuthorById(String authorId, Integer bizId){
		return authorMapper.get(authorId, bizId);
	}
	
	public int saveAuthor(Author author){
		return authorMapper.save(author);
	}
}
