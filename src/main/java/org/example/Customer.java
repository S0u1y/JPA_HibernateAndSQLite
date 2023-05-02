package org.example;

import lombok.*;

import jakarta.persistence.*;

import java.io.Serializable;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer implements Serializable{

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customer_id;

    @NonNull
    @Column(name = "fName")
    private String fName;

    @NonNull
    @Column(name = "lName")
    private String lName;
}
