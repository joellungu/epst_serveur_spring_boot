package com.epst.epst.controllers;

import com.epst.epst.beans.MessageBean;
import com.epst.epst.beans.MessageBeanRepositoryImplementation;
import com.epst.epst.models.ModelMessage;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Path("archive")
public class ArchiveController {

    @Autowired
    MessageBeanRepositoryImplementation messageBeanRepository;
    ModelMessage modelMessage = new ModelMessage();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get1llo() {

        // create a JSON string
        return "Allo";
    }

    @Path("/a1/{matricule}/{date}")
    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageBean> getArchive1(@PathParam("matricule") String matricule, @PathParam("date") String date) {
        List<MessageBean> l = modelMessage.getArchiveConversation(matricule);
        List<MessageBean> listWithoutDuplicates = new ArrayList<>();
        //System.out.println("matricule: "+matricule);
        Set<String> f = new HashSet<>();
        //System.out.println("taille: "+listWithoutDuplicates.size());

        l.forEach((e)->{
            if(f.add(e.getHostIdt())){
                listWithoutDuplicates.add(e);
            };
            //System.out.println("matricule: "+e.getMatriculet());
        });

        Predicate<MessageBean> t = value -> value.getMatriculet().equals(matricule) && value.getDatet().equals(date);
        return listWithoutDuplicates.stream().filter(t).collect(Collectors.toList());
    }

    @Path("/conv/{matricule}")
    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageBean> getConversation(@PathParam("matricule") String matricule) {
        List<MessageBean> l = modelMessage.getArchiveConversation2(matricule);
        //List<MessageBean> listWithoutDuplicates = new ArrayList<>();
        Predicate<MessageBean> t = value -> value.getHostIdt().equals(matricule);// && value.getDatet().contains(date);
        return l.stream().filter(t).collect(Collectors.toList());
    }

    @Path("/a2/{matricule}/{date}/{heure}")
    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageBean> getArchive2(@PathParam("matricule") String matricule, @PathParam("date") String date,
                                   @PathParam("heure") String heure) {
        List<MessageBean> l = modelMessage.getArchiveConversation(matricule);
        Collections.reverse(l);
        Predicate<MessageBean> t = value -> value.getMatriculet().equals(matricule) && value.getDatet().contains(date)
                && value.getHeuret().contains(heure);
        //
        return l.stream().filter(t).collect(Collectors.toList());
    }
  
}
