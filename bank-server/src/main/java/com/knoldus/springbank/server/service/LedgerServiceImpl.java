package com.knoldus.springbank.server.service;

import com.knoldus.springbank.common.dto.LedgerRecord;
import com.knoldus.springbank.common.dto.ServiceException;
import com.knoldus.springbank.server.repository.LedgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LedgerServiceImpl implements LedgerService {

    private final LedgerRepository ledgerRepository;

    @Autowired
    public LedgerServiceImpl(LedgerRepository ledgerRepository) {
        this.ledgerRepository = ledgerRepository;
    }

    @Override
    public void saveRecord(LedgerRecord ledgerRecord) throws ServiceException {

    }

    @Override
    public Collection<LedgerRecord> getLedger() {
        return null;
    }

}
