/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servebyte.weserve.dto;

/**
 *
 * @author Hp
 */
public class VerifypaymentOutputDTO {
    private boolean status;
    private String message;
    private ObjClass data;

    public VerifypaymentOutputDTO() {
    }

    public VerifypaymentOutputDTO(boolean status, String message, ObjClass data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(ObjClass data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "VerifypaymentOutputDTO{" + "status=" + status + ", message=" + message + ", data=" + data + '}';
    }
    
    public class ObjClass {
        String id;
        String domain;

        public ObjClass() {
        }

        public ObjClass(String id, String domain) {
            this.id = id;
            this.domain = domain;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }
        
    }
    
    
}
