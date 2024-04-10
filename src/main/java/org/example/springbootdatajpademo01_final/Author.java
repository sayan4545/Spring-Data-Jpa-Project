package org.example.springbootdatajpademo01_final;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "AUTHOR_TBL"
)
@Data
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(
            nullable = false,
            length = 50
    )
    private String first_Name;
    private String last_Name;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private Integer age;
    @Column(
            updatable = false
    )
    private LocalDateTime createdAt;
    @Column(
            insertable = false
    )
    private LocalDateTime lastupdatedAt;
}
