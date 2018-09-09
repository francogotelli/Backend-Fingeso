package goperavi.backend.mongo.services;

import com.fasterxml.jackson.annotation.JsonFormat;
import goperavi.backend.mongo.repositories.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/ideas")
public class IdeaService {
    @Autowired
    private IdeaRepository ideaRepository;
}