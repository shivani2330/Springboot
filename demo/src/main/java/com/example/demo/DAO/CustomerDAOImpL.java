package com.example.demo.DAO;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.example.demo.DAO.CustomerDAO;
import com.example.demo.model.*;
import com.example.demo.Service.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;


public class CustomerDAOImpL extends JdbcDaoSupport implements CustomerDAO {

    @Autowired
	
	DataSource datasource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(datasource);
	}
	
	@Override
	public void insertCustomer(Customers customer) {
		String sql = "INSERT INTO Customers " +
				"(cid, cfname,clname) VALUES (?, ?,?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				customer.getCid(),customer.getCfname(),customer.getClname() 
		});
	}
	
	@Override
	
	public void insertCustomers(final List<Customers> customer) {
		String sql = "INSERT INTO Customers " + "(cid,cfname,clname) VALUES (?, ?,?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Customers customers = customer.get(i);
				ps.setInt(1, customers.getCid());
				ps.setString(2, customers.getCfname());
				ps.setString(3, customers.getClname());
				
			}
			
			public int getBatchSize() {
				return customer.size();
			}
		});

	}

	
	@Override
	public List<Customers> getAllCustomers(){
		String sql = "SELECT * FROM Customers";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Customers> result = new ArrayList<Customers>();
		for(Map<String, Object> row:rows){
			Customers cust = new Customers();
			
			cust.setCid((int)row.get("cid"));
			cust.setCfname((String)row.get("cfname"));
			cust.setClname((String)row.get("clname"));
			
			result.add(cust);
		}
		
		return result;
	}

	@Override
	public Customers getCustomerById(int cid) {
		String sql = "SELECT * FROM Customers WHERE cid = ?";
		return (Customers)getJdbcTemplate().queryForObject(sql, new Object[]{cid}, new RowMapper<Customers>(){
			@Override
			public Customers mapRow(ResultSet rs, int rwNumber) throws SQLException {
				Customers cust = new Customers();
				
				cust.setCid(rs.getInt("cid"));
				cust.setCfname(rs.getNString("cfname"));
				cust.setClname(rs.getString("clname"));
				
				return cust;
			}
		});
	}
}
	





	