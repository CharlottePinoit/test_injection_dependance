package org.example;

import java.time.LocalDateTime;

public class RealTimeProvider implements TimeProvider {
    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
