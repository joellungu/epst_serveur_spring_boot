package com.epst.epst.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.epst.epst.TestController;
import com.epst.epst.controllers.AgentControlleur;
import com.epst.epst.controllers.ArchiveController;
import com.epst.epst.controllers.MagasinControlleur;
import com.epst.epst.controllers.NoteControlleur;
import com.epst.epst.controllers.PiecejointeControlleur;
import com.epst.epst.controllers.PlainteControlleur;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(AgentControlleur.class);
        register(MagasinControlleur.class);
        register(PlainteControlleur.class);
        register(PiecejointeControlleur.class);
        register(NoteControlleur.class);
        register(ArchiveController.class);
        register(TestController.class);
    }
}