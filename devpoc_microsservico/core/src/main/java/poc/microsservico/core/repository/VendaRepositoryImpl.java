package poc.microsservico.core.repository;

import org.springframework.stereotype.Repository;
import poc.microsservico.core.model.Venda;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;

@Repository
public abstract class VendaRepositoryImpl implements VendaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Venda addVenda(Venda venda) {
        entityManager.persist(venda);
        return venda;
    }

    @Override
    public Iterable<Venda> listByPeriodo(Date dataIni, Date dataFim) {
        TypedQuery<Venda> query = entityManager.createQuery("SELECT v FROM Venda v WHERE v.data BETWEEN :dataIni AND :dataFim", Venda.class);
        query.setParameter("dataIni", dataIni);
        query.setParameter("dataFim", dataFim);
        return null;
    }
}
