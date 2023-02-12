package com.knoldus.springbank.server.utils;

import com.knoldus.springbank.common.dto.Account;
import com.knoldus.springbank.common.dto.AccountId;
import com.knoldus.springbank.common.dto.Client;
import com.knoldus.springbank.common.dto.ClientId;
import com.knoldus.springbank.server.repository.model.AccountEntity;
import com.knoldus.springbank.server.repository.model.ClientEntity;

public final class DTS {

    private DTS() {
        throw new UnsupportedOperationException("Please do not instantiate utility class.");
    }

    public static Client transform(ClientEntity clientEntity) {
        AccountEntity accountEntity = clientEntity.getAccount();
        AccountId accountId = new AccountId(accountEntity.getId().toString());
        Account account = new Account(accountId, accountEntity.getCredit());
        ClientId id = new ClientId(clientEntity.getId().toString());
        Client client = new Client(id, clientEntity.getFirstName(), clientEntity.getLastName(), account);
        return client;
    }

}
