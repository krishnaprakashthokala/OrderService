package org.ecommerce.orderservice.dto;

import org.springframework.webflow.execution.RequestContext;

public class SetBillAddressToOrderDoExecuteInDTO {
    private RequestContext context;
    
    
    public RequestContext getContext() {
        return context;
    }

    public void setContext(RequestContext context) {
        this.context = context;
    }
    
}