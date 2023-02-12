package com.knoldus.springbank.server.service;

import com.knoldus.springbank.common.dto.LedgerRecord;
import com.knoldus.springbank.common.dto.ServiceException;

import java.util.Collection;

public interface LedgerService {

    void saveRecord(LedgerRecord ledgerRecord) throws ServiceException;

    Collection<LedgerRecord> getLedger();

}
