package br.com.nomedogrupo.nomeDoProjeto.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


/** 
 * O model tem como objetivo criar a tabela de banco de dados e definir as principais variáveis de cada item dentro do software.
 * */

// @Data gera os metodos getters e setters automaticamente
// @Entity gera uma tabela com o nome de tb_users
@Data
@Entity(name = "tb_users")
public class UserModel {
    // Parametros de @Id e @GeneratedValue indicam que a variável que está abaixo é uma coluna chave primária e será gerada automaticamente usando UUID
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    // @Column indica que a variável abaixo é uma coluna unica, não poderá ter duas iguais no banco de dados.
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    // @CreationTimestamp indica que a variável abaixo será criada automaticamente
    @CreationTimestamp
    private LocalDateTime createdAt;
} 
