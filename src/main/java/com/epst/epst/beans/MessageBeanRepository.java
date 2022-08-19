package com.epst.epst.beans;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageBeanRepository extends CrudRepository<MessageBean, Long> {

    //List<MessageBean> findByLastName(String lastName);
  
    MessageBean findById(long id);
    
}
