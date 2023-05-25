package org.ecommerce.orderservice.dto;

import org.springframework.webflow.execution.Event;

public class SaveOrderActionDoExecuteOutDTO {
    private Event retVal;
    
    
    public Event getRetVal() {
        return retVal;
    }

    public void setRetVal(Event retVal) {
        this.retVal = retVal;
    }
    
}