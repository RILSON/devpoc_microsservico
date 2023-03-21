package poc.microsservico.relatorio.endpoint.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import poc.microsservico.core.endpoint.service.VendaService;
import poc.microsservico.core.model.Venda;
import java.util.Date;

@RestController
@RequestMapping("v1/admin/relatorio")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RelatorioController {

    private final VendaService vendaService;

    @GetMapping(path = "/lista", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Venda>> list(Pageable pageable) {
        return new ResponseEntity<>(vendaService.list(pageable), HttpStatus.OK);
    }

    @GetMapping(path = "/periodo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Iterable<Venda>> listByPeriodo(@RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date dataIni,
                                                         @RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date dataFim) {
        Iterable<Venda> vendas = vendaService.listByPeriodo(dataIni, dataFim);
        return new ResponseEntity<>(vendas, HttpStatus.OK);
    }
}
