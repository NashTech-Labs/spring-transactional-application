package com.knoldus.springbank.server.controller;

import com.knoldus.springbank.common.dto.ServiceException;
import com.knoldus.springbank.common.dto.SystemInfo;
import com.knoldus.springbank.common.service.SystemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/system")
public class SystemController {

    private final SystemInfoService systemInfoService;

    public SystemController(@Autowired SystemInfoService systemInfoService) {
        this.systemInfoService = systemInfoService;
    }

    @GetMapping("/version")
    public SystemInfo getSystemInfo() throws ServiceException {
        return systemInfoService.getSystemInfo();
    }

}
