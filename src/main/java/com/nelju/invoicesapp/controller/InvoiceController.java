package com.nelju.invoicesapp.controller;

import com.nelju.invoicesapp.entity.Invoice;
import com.nelju.invoicesapp.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping("/add")
    public Invoice addInvoice(@RequestBody Invoice invoice) {
        return service.saveInvoice(invoice);
    }

//    @PostMapping("/addInvoices")
//    public List<Invoice> addInvoices(@RequestBody List<Invoice> invoices) {
//        return service.saveInvoices(invoices);
//    }

    @GetMapping("/invoices")
    public List<Invoice> findAllInvoices() {
        return service.getInvoices();
    }

    @GetMapping("/invoice/{id}")
    public Invoice findInvoiceById(@PathVariable int id) {
        return service.getInvoiceById(id);
    }

    @PutMapping("/update")
    public Invoice updateInvoice(@RequestBody Invoice invoice) {
        return service.updateInvoice(invoice);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteInvoice(@PathVariable int id) {
        return service.deleteInvoice(id);
    }
}