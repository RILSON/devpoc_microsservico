package poc.microsservico.core.endpoint.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import poc.microsservico.core.model.Venda;
import poc.microsservico.core.repository.VendaRepository;
import java.util.Date;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class VendaService {

    private final VendaRepository vendaRepository;

    public Iterable<Venda> list (Pageable pageable) {
        log.info("Lista de vendas");
        return vendaRepository.findAll(pageable);
    }

    public Venda addVenda (Venda venda) {
        log.info("Adicionar venda");
        return vendaRepository.addVenda(venda);
    }

    public Iterable<Venda> listByPeriodo(Date dataIni, Date dataFim) {
        log.info("Buscar vendas por período");
        return vendaRepository.listByPeriodo(dataIni, dataFim);
    }

}
