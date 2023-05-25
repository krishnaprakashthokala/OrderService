package org.ecommerce.orderservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.orderservice.dto.*;
import org.ecommerce.web.frontend.flows.actions.SaveOrderAction;

@RestController
@RequestMapping("/saveOrderAction")
public class SaveOrderActionController {
    @Autowired
    private SaveOrderAction saveOrderAction;

    @PostMapping(value = "/doExecute", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SaveOrderActionDoExecuteOutDTO> doExecute(@RequestBody SaveOrderActionDoExecuteInDTO in) {
        SaveOrderActionDoExecuteOutDTO ret = new SaveOrderActionDoExecuteOutDTO();
        ret.setRetVal(saveOrderAction.doExecute(in.getContext()));
        return ResponseEntity.ok(ret);
    }

}