package com.epst.epst.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain=true)
//@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor // <--- THIS is it
@AllArgsConstructor
@Entity

public class MessageBean {

    @Id
	private long id;

    private String fromt;
    private String tot;
    private String contentt;
    private String hostIdt;
    private String clientIdt;
    private Boolean closet;
    private Boolean allst;
    private String visiblet;
    private Boolean conversationt;
    private String matriculet;
    private String datet;
    private String heuret;

}
