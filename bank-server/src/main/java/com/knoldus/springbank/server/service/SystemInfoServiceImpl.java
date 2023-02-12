package com.knoldus.springbank.server.service;

import com.knoldus.springbank.common.dto.ServiceException;
import com.knoldus.springbank.common.dto.SystemInfo;
import com.knoldus.springbank.common.service.SystemInfoService;
import org.springframework.stereotype.Service;

@Service
public class SystemInfoServiceImpl implements SystemInfoService {

    @Override
    public SystemInfo getSystemInfo() throws ServiceException {
        return new SystemInfo("1.0.0");
    }

}
