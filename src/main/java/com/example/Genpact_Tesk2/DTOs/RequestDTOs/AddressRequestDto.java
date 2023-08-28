package com.example.Genpact_Tesk2.DTOs.RequestDTOs;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class AddressRequestDto {
    String state,city,country;
    int org_id;
}
