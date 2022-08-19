package com.epst.epst.beans;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MessageBeanRepository extends CrudRepository<MessageBean, Long> {

    //List<MessageBean> findByLastName(String lastName);
  
    MessageBean findById(long id);
}
