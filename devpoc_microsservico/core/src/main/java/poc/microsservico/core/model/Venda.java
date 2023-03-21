package poc.microsservico.core.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Venda implements AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotNull(message = "O campo 'valor' é obrigatório")
    @Column(nullable = false)
    private Long valor;

    @NotNull(message = "O campo 'valor' é obrigatório")
    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private Date data;
}
