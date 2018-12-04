package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {


		public boolean save(Supplier supplier);
		
		public boolean delete(Supplier supplier);
		public boolean update(Supplier supplier);
		public List<Supplier> listSuppliers();
		public Supplier getSupplier(int supplierId);

}