package com.example.auth.client.request;

import java.util.UUID;

public record OwnerRequest(
        UUID id,
        String name,
        String number
){

}
