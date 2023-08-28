package com.example.Genpact_Tesk2.DTOs.ResponseDTOs;

import com.example.Genpact_Tesk2.Entitys.Address;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class OrgDetailsResponseDto {
    String Name;
    List<AddressResponseDto> addressResponseDtoList;
}
