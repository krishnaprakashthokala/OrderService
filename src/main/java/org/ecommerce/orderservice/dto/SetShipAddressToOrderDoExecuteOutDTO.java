package org.ecommerce.orderservice.dto;

import org.springframework.webflow.execution.Event;

public class SetShipAddressToOrderDoExecuteOutDTO {
    private Event retVal;
    
    
    public Event getRetVal() {
        return retVal;
    }

    public void setRetVal(Event retVal) {
        this.retVal = retVal;
    }
    
}