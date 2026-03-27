package org.example;

import java.time.LocalDateTime;

public class FakeTimeProvider implements TimeProvider{

    private LocalDateTime fixedNow;

    public FakeTimeProvider(LocalDateTime fixedNow) {
        this.fixedNow = fixedNow ;
    }

    @Override
    public LocalDateTime now() {
        return fixedNow;
    }
}
