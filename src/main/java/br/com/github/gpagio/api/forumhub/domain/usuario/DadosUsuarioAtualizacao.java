package br.com.github.gpagio.api.forumhub.domain.usuario;

import jakarta.validation.constraints.Email;

public record DadosUsuarioAtualizacao(String nome,

                                      @Email(message = "Email deve seguir o formato email@email.com")
                                      String email,

                                      String senha) {
}
