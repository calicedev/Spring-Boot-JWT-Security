package com.tutorial.jwtsecurity.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@Table(name = "access_token")
@Entity
public class AccessToken {

    @Id
    @Column(name = "at_key")
    private String key;

    @Column(name = "at_value")
    private String value;

    @Column(name = "at_lasttime")
    private String atlasttime;

    @Builder
    public AccessToken(String key, String value,String atlasttime) {
        this.key = key;
        this.value = value;
        this.atlasttime = atlasttime;
    }

    public AccessToken updateValue(String token) {
        this.value = token;
        return this;
    }
}
