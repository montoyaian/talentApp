package com.perth.project.Parameterization.User.UserTools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String username;
    private String identification;
    private String profile;
    private String area;
    private String email;
}
