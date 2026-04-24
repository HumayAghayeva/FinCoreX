package com.example.cqrsexample.commands;


import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.cqrsexample.messages.Message;

@Data
@NoArgsConstructor
public abstract class BaseCommand extends Message {

    public BaseCommand(String id) {
        super(id);
    }
}

