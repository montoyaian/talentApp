package com.perth.project.Parameterization.Area.AreaTools;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EditAreaRequest {
    @NotNull(message = "El nombre del area es obligatorio")
    String name;
}