package com.example.springdatajparelationships.modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "photo")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long id;
    private String smallUrl;
    private String mediumUrl;
    private String largeUrl;

    @OneToOne(mappedBy = "photo")
    private Book book;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Photo photo = (Photo) o;
        return getId() != null && Objects.equals(getId(), photo.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
