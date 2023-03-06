package org.example.n2exercici1.callback;

import java.util.Optional;

public abstract class Task {

    public final void executeWith(Callback callback) {
        Optional.ofNullable(callback).ifPresent(Callback::call);
        execute();
    }

    public abstract void execute();

}
