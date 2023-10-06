package com.example.rest_api.Controller;

import com.example.rest_api.Entity.LogEntity;
import com.example.rest_api.Service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LogController {
    private final LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }
    @RequestMapping(value = "/api/logs/", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<LogEntity> addLog(@RequestBody LogEntity log){

        LogEntity savedLog = logService.add(log);


        return new ResponseEntity<>(savedLog, HttpStatus.CREATED);
    }


    @GetMapping("/api/logs")
    public ResponseEntity<List<LogEntity>> getLog(@RequestParam(value = "limit",required = false) Integer limit){
        List<LogEntity> logEntities;

        if (limit != null) {
            logEntities = logService.findLogsWithLimit(limit);
        } else {
            logEntities = logService.findAll();
        }

        return new ResponseEntity<>(logEntities, HttpStatus.OK);
    }
}
