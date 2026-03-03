package com.example.exe1.customer.dto;

// ... other jakarta.validation imports

import org.jetbrains.annotations.NotNull;

        import java.util.List;

public record CustomerOut(@NotNull String name,
                          List<String>phones ) {
}
