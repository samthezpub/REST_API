package com.example.rest_api.Entity;

import com.example.rest_api.Enum.Level;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "log_data")
public class LogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "level")
    private Level level;

    @Column(name = "src")
    private String src;

    @Column(name = "message")
    private String message;

    public LogEntity() {

    }
}
