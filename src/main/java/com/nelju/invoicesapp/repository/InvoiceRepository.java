package com.nelju.invoicesapp.repository;
import com.nelju.invoicesapp.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}