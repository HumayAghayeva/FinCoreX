package com.example.api.commands;

import com.example.commonexample.common.dto.AccountType;
import com.example.cqrsexample.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
