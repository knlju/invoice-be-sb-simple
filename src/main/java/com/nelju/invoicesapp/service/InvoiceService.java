package com.nelju.invoicesapp.service;

import com.nelju.invoicesapp.entity.Invoice;
import com.nelju.invoicesapp.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository repository;

    public Invoice saveInvoice(Invoice invoice) {
        return repository.save(invoice);
    }

    public List<Invoice> saveInvoices(List<Invoice> invoices) {
        return repository.saveAll(invoices);
    }

    public List<Invoice> getInvoices() {
        return repository.findAll();
    }

    public Invoice getInvoiceById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteInvoice(int id) {
        repository.deleteById(id);
        return "invoice removed !! " + id;
    }

    public Invoice updateInvoice(Invoice invoice) {
//        Invoice existingInvoice = repository.findById(invoice.getId()).orElse(null);
////        existingInvoice.setName(invoice.getName());
////        existingInvoice.setQuantity(invoice.getQuantity());
////        existingInvoice.setPrice(invoice.getPrice());
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
////        existingInvoice.set
//        existingInvoice.setCreatedAt();
//        existingInvoice.setPaymentDue();
//        existingInvoice.setDescription();
//        existingInvoice.setPaymentTerms(invoice);
//        existingInvoice.setClientAddress();
//        existingInvoice.setClientName();
//        existingInvoice.setItems();
//        existingInvoice.setTotal();
//
//        existingInvoice.setClientEmail();
//        existingInvoice.setSenderAddress();
//        existingInvoice.setClientName();
//        existingInvoice.setClientName();
        return repository.save(invoice);
    }


}