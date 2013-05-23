/**
 * 
 */
package com.bank.utils.queries;

/**
 * @author Sudarsan
 * 
 */
public interface CustomerQueries {

	public static final String INSERT = "INSERT INTO TBL_CUTOMER(GUID, ACCOUNTNUMBER, FIRSTNAME, LASTNAME, GENDER, DATEOFBIRTH, EMAIL, MOBILE, USERPIC, SIGNATURE, CREATEDON, CREATEDBY, MODIFIEDON, MODIFIEDBY, ACTIVE) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String GET_ALL = "SELECT * FROM TBL_CUTOMER";
	public static final String FIND_BY_ACCOUNTNUMBER = "SELECT * FROM TBL_CUTOMER WHERE ACCOUNTNUMBER =?";
}
