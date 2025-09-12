package br.com.daniel.fernandes.gestao_vagas.modules.candidate.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileCandidateDTO {
    
    @Schema(example = "Desenvolvedor java")
    private String description;
    @Schema(example = "Daniel")
    private String username;
    @Schema(example = "daniel@gmail.com")
    private String email;
    private UUID id;
    @Schema(example = "Daniel Fernandes")
    private String name;
}
