package com.javamaster.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cities")
@Schema(description = "Города")
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Идентификатор", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Column
    @Setter
    @Getter
    @Schema(description = "Имя города", accessMode = Schema.AccessMode.READ_WRITE)
    private String name_city;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name_city + '\'' +
                '}';
    }
}

