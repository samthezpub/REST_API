package com.example.rest_api.Service.Impl;

import com.example.rest_api.Entity.LogEntity;
import com.example.rest_api.Repository.LogRepository;
import com.example.rest_api.Service.LogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogServiceImpl implements LogService {
    private final LogRepository logRepository;

    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public LogEntity add(LogEntity log) {
        return logRepository.save(log);
    }

    @Override
    public Optional<LogEntity> findById(Integer id) {
        return logRepository.findById(id);
    }

    @Override
    public List<LogEntity> findAll() {
        return logRepository.findAll();
    }

    @Override
    public List<LogEntity> findLogsWithLimit(int limit) {
        return logRepository.findLogsWithLimit(limit);
    }

    @Override
    public LogEntity update(LogEntity log) {
        return logRepository.save(log);
    }

    @Override
    public void deleteById(Integer id) {
        logRepository.deleteById(id);
    }
}
