package org.ecommerce.orderservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.orderservice.dto.*;
import org.ecommerce.web.frontend.flows.actions.SetBillAddressToOrder;

@RestController
@RequestMapping("/setBillAddressToOrder")
public class SetBillAddressToOrderController {
    @Autowired
    private SetBillAddressToOrder setBillAddressToOrder;

    @PostMapping(value = "/doExecute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SetBillAddressToOrderDoExecuteOutDTO> doExecute(@RequestBody SetBillAddressToOrderDoExecuteInDTO in) {
        SetBillAddressToOrderDoExecuteOutDTO ret = new SetBillAddressToOrderDoExecuteOutDTO();
        ret.setRetVal(setBillAddressToOrder.doExecute(in.getContext()));
        return ResponseEntity.ok(ret);
    }

}