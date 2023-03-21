package poc.microsservico.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import poc.microsservico.core.model.Venda;

import java.util.Date;

public interface VendaRepository extends PagingAndSortingRepository<Venda, Long> {

    Venda addVenda(Venda venda);

    Iterable<Venda> listByPeriodo(Date dataIni, Date dataFim);
}

