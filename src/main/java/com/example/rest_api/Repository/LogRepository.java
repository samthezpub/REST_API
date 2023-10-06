package com.example.rest_api.Repository;

import com.example.rest_api.Entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Repository
public interface LogRepository extends JpaRepository<LogEntity, Integer> {
    @Query("SELECT l FROM LogEntity l ORDER BY l.id  LIMIT :limit")
    List<LogEntity> findLogsWithLimit(@Param("limit")int limit);

}
