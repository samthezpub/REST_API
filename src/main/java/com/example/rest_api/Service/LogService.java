package com.example.rest_api.Service;

import com.example.rest_api.Entity.LogEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LogService {
    LogEntity add(LogEntity log);
    Optional<LogEntity> findById(Integer id);
    List<LogEntity> findAll();
    List<LogEntity> findLogsWithLimit(int limit);
    LogEntity update(LogEntity log);
    void deleteById(Integer id);


}
