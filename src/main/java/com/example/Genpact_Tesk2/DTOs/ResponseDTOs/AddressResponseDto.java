package com.example.Genpact_Tesk2.DTOs.ResponseDTOs;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AddressResponseDto {
    String State,City,Country;
}
