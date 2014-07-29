package com.hascode.tutorial.service;

import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hascode.tutorial.entity.Book;

@Stateless
public class BookBean {
	@PersistenceContext
	private EntityManager em;

	public List<Book> findAll() {
		return em.createNamedQuery(Book.Query.FIND_ALL, Book.class).getResultList();
	}

	public void create(final Book book) {
		book.setId(UUID.randomUUID().toString().toUpperCase());
		em.persist(book);
	}
}
