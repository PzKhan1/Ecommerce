package dev.Pz.productservicettsevening.clients.authenticationclient.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidatetokenResponseDto {
    private UserDto userDto;
    private SessionStatus sessionStatus;
}
