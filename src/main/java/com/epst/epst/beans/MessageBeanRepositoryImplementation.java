package com.epst.epst.beans;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.ws.rs.PathParam;

import org.springframework.stereotype.Repository;

import com.epst.epst.chat.Message;
import com.epst.epst.models.ModelMessage;

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
    //
    ModelMessage modelMessage = new ModelMessage();

    //@NonBlocking
    public void saveData(Message message){
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");

                MessageBean ms = new MessageBean();
                ms.setAllst(message.getAll());
                ms.setCloset(message.getClose());
                ms.setClientIdt(message.getClientId());
                ms.setConversationt(message.getConversation());
                ms.setDatet(message.getDate());
                ms.setContentt(message.getContent());
                ms.setMatriculet(message.getMatricule());
                ms.setFromt(message.getFrom());
                ms.setHostIdt(message.getHostId());
                ms.setTot(message.getTo());
                ms.setVisiblet(message.getVisible());
                ms.setHeuret(message.getHeure());
                //ms.persist();
                modelMessage.save(ms);
                //

                try{
                    //persist(ms);
                }catch (Exception ex){
                    System.out.println("Erreur: "+ex.getMessage());
                }

                System.out.println("Cool c'est bon!");
            }
        };

        thread.start();

    }

    public List<MessageBean> getArchive1(@PathParam("matricule") String matricule, @PathParam("date") String date) {
        List<MessageBean> l = modelMessage.getArchiveConversation(matricule);

        System.out.println("matricule: " + matricule);
        System.out.println("taille: " + l.size());
        l.forEach((e) -> {
            System.out.println("matricule: " + e.getMatriculet());
        });
        Predicate<MessageBean> t = value -> value.getMatriculet().equals(matricule) && value.getDatet().contains(date);
        return l.stream().filter(t).collect(Collectors.toList());
    }

    
}
