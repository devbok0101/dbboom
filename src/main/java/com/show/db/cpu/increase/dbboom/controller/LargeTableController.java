package com.show.db.cpu.increase.dbboom.controller;

import com.show.db.cpu.increase.dbboom.service.LargeTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class LargeTableController {
    private final LargeTableService largeTableService;
    @GetMapping("/slow-query")
    public List<?> runSlowQuery() {
        return largeTableService.executeSlowQuery();
    }
}
