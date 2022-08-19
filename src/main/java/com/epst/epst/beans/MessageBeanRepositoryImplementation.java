package com.epst.epst.beans;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class MessageBeanRepositoryImplementation implements MessageBeanRepository{

    @Override
    public <S extends MessageBean> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends MessageBean> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<MessageBean> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<MessageBean> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<MessageBean> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(MessageBean entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends MessageBean> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public MessageBean findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
