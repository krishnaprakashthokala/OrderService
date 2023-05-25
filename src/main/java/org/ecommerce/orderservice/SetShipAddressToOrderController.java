package org.ecommerce.orderservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.orderservice.dto.*;
import org.ecommerce.web.frontend.flows.actions.SetShipAddressToOrder;

@RestController
@RequestMapping("/setShipAddressToOrder")
public class SetShipAddressToOrderController {
    @Autowired
    private SetShipAddressToOrder setShipAddressToOrder;

    @PostMapping(value = "/doExecute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SetShipAddressToOrderDoExecuteOutDTO> doExecute(@RequestBody SetShipAddressToOrderDoExecuteInDTO in) {
        SetShipAddressToOrderDoExecuteOutDTO ret = new SetShipAddressToOrderDoExecuteOutDTO();
        ret.setRetVal(setShipAddressToOrder.doExecute(in.getContext()));
        return ResponseEntity.ok(ret);
    }

}