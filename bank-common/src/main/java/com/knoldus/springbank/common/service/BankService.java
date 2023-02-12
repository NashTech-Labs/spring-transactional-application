package com.knoldus.springbank.common.service;

import com.knoldus.springbank.common.dto.Client;
import com.knoldus.springbank.common.dto.ClientId;
import com.knoldus.springbank.common.dto.DepositRequest;
import com.knoldus.springbank.common.dto.TransactionRequest;
import com.knoldus.springbank.common.dto.WithdrawRequest;
import com.knoldus.springbank.common.dto.ServiceException;

public interface BankService {

    void transferFunds(TransactionRequest transactionRequest) throws ServiceException;

    void deposit(DepositRequest depositRequest) throws ServiceException;

    void withDraw(WithdrawRequest withdrawRequest) throws ServiceException;

    Client getClientInfo(ClientId clientId) throws ServiceException;

}
