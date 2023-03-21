package poc.microsservico.venda.endpoint.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poc.microsservico.core.model.Venda;
import poc.microsservico.core.endpoint.service.VendaService;
import java.util.Date;

@RestController
@RequestMapping("v1/admin/venda")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class VendaController {

    private final VendaService vendaService;

    @GetMapping(path = "/lista", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Venda>> list(Pageable pageable) {
        return new ResponseEntity<>(vendaService.list(pageable), HttpStatus.OK);
    }

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Venda> add(@RequestBody Venda venda) {
        Venda novaVenda = new Venda();
        novaVenda.setValor(venda.getValor());
        novaVenda.setTipo(venda.getTipo());
        novaVenda.setData(new Date());

        vendaService.addVenda(novaVenda);

        return new ResponseEntity<>(novaVenda, HttpStatus.CREATED);
    }
}
