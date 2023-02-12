package com.knoldus.springbank.common.service;

import com.knoldus.springbank.common.dto.ServiceException;
import com.knoldus.springbank.common.dto.SystemInfo;

public interface SystemInfoService {

    SystemInfo getSystemInfo() throws ServiceException;

}
