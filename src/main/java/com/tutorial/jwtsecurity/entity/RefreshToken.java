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
@Table(name = "refresh_token")
@Entity
public class RefreshToken {

    @Id
    @Column(name = "rt_key")
    private String key;

    @Column(name = "rt_value")
    private String value;

    @Column(name = "rt_lasttime")
    private String rtlasttime;

    @Builder
    public RefreshToken(String key, String value, String rtlasttime) {
        this.key = key;
        this.value = value;
        this.rtlasttime = rtlasttime;
    }

    public RefreshToken updateValue(String token) {
        this.value = token;
        return this;
    }
}
