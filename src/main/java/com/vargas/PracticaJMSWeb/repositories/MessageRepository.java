package com.vargas.PracticaJMSWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vargas.PracticaJMSWeb.models.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
