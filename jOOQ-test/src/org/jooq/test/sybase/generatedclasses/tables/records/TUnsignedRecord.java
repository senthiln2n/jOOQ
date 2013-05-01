/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsignedRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.TUnsignedRecord> implements org.jooq.Record4<java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long> {

	private static final long serialVersionUID = -1800239158;

	/**
	 * Setter for <code>DBA.t_unsigned.u_byte</code>. 
	 */
	public void setUByte(java.lang.Byte value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>DBA.t_unsigned.u_byte</code>. 
	 */
	public java.lang.Byte getUByte() {
		return (java.lang.Byte) getValue(0);
	}

	/**
	 * Setter for <code>DBA.t_unsigned.u_short</code>. 
	 */
	public void setUShort(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>DBA.t_unsigned.u_short</code>. 
	 */
	public java.lang.Short getUShort() {
		return (java.lang.Short) getValue(1);
	}

	/**
	 * Setter for <code>DBA.t_unsigned.u_int</code>. 
	 */
	public void setUInt(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>DBA.t_unsigned.u_int</code>. 
	 */
	public java.lang.Integer getUInt() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>DBA.t_unsigned.u_long</code>. 
	 */
	public void setULong(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>DBA.t_unsigned.u_long</code>. 
	 */
	public java.lang.Long getULong() {
		return (java.lang.Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field1() {
		return org.jooq.test.sybase.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_BYTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.sybase.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_SHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.sybase.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.jooq.test.sybase.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_LONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value1() {
		return getUByte();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getUShort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getUInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getULong();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TUnsignedRecord
	 */
	public TUnsignedRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.TUnsigned.T_UNSIGNED);
	}
}