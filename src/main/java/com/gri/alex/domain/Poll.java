package com.gri.alex.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import java.util.Set;

@Getter
@Setter
@Entity
public class Poll {

    @Id
    @GeneratedValue
    @Column(name="POLL_ID")
    private Long id;

    @Column(name="QUESTION")
    private String question;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="POLL_ID")
    @OrderBy
    private Set<Option> options;
}
