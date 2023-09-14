package com.insurence.healthinsurence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InsurencePackagesRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		InsurencePackages ip = new InsurencePackages();
		ip.setInsp_id(rs.getInt(1));
		ip.setInsp_title(rs.getString(2));
		ip.setInsp_des(rs.getString(3));
		ip.setInsp_status(rs.getString(4));
		ip.setInsp_range_start(rs.getDouble(5));
		ip.setInsp_range_end(rs.getDouble(6));
		ip.setInsp_agelimit_start(rs.getInt(7));
		ip.setInsp_agelimit_end(rs.getInt(8));
		return ip;
	}

}
