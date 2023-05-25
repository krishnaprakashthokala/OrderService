package org.ecommerce.orderservice;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import org.ecommerce.orderservice.dto.*;
import org.ecommerce.web.admin.controllers.OrderController;

@RestController
@RequestMapping("/orderController")
public class OrderControllerController {
    @Autowired
    private OrderController orderController;

    @PostMapping(value = "/all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderControllerAllOutDTO> all(@RequestBody OrderControllerAllInDTO in) {
        OrderControllerAllOutDTO ret = new OrderControllerAllOutDTO();
        ret.setRetVal(orderController.all(in.getModel()));
        return ResponseEntity.ok(ret);
    }

    @PostMapping(value = "/show", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderControllerShowOutDTO> show(@RequestBody OrderControllerShowInDTO in) {
        OrderControllerShowOutDTO ret = new OrderControllerShowOutDTO();
        ret.setRetVal(orderController.show(in.getId(), in.getModel()));
        return ResponseEntity.ok(ret);
    }

}