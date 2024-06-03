package br.com.payrollapi.resources;

import br.com.payrollapi.domain.Payroll;
import br.com.payrollapi.domain.User;
import br.com.payrollapi.feignClients.UserFeign;
import br.com.payrollapi.services.PayrollServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollServices payrollService;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(payrollService.getPayment(workerId, payment));
    }
}
