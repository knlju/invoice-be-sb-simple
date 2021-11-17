package com.nelju.invoicesapp.service;

import com.nelju.invoicesapp.entity.ClientAddress;
import com.nelju.invoicesapp.entity.Invoice;
import com.nelju.invoicesapp.entity.Item;
import com.nelju.invoicesapp.entity.SenderAddress;
import com.nelju.invoicesapp.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;
import java.util.Set;

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
        Invoice existingInvoice = repository.findById(invoice.getId()).orElse(null);
        if(existingInvoice == null) return null;
        existingInvoice.setCreatedAt(invoice.getCreatedAt());
        existingInvoice.setPaymentDue(invoice.getPaymentDue());
        existingInvoice.setDescription(invoice.getDescription());
        existingInvoice.setPaymentTerms(invoice.getPaymentTerms());
        existingInvoice.setClientAddress(invoice.getClientAddress());
        existingInvoice.setClientEmail(invoice.getClientEmail());
        existingInvoice.setClientName(invoice.getClientName());
        existingInvoice.setItems(invoice.getItems());
        existingInvoice.setTotal(invoice.getTotal());
        existingInvoice.setStatus(invoice.getStatus());
        existingInvoice.setSenderAddress(invoice.getSenderAddress());
        return repository.save(existingInvoice);
    }


}