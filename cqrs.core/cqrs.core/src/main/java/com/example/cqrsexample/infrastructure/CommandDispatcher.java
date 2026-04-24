package com.example.cqrsexample.infrastructure;

import com.example.cqrsexample.commands.BaseCommand;
import com.example.cqrsexample.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
