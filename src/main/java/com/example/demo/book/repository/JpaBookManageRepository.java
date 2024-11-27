package com.example.demo.book.repository;

import com.example.demo.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBookManageRepository extends JpaRepository<Book, Long> {
}
