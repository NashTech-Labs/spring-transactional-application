package com.knoldus.springbank.common.service;

import com.knoldus.springbank.common.dto.Client;
import com.knoldus.springbank.common.dto.CreateClientRequest;
import com.knoldus.springbank.common.dto.ClientId;
import com.knoldus.springbank.common.dto.ServiceException;

import java.util.Collection;

public interface AdminService {

    ClientId createClient(CreateClientRequest createClientRequest) throws ServiceException;

    Collection<Client> getClients() throws ServiceException;

    void deleteClient(ClientId id) throws ServiceException;

}
