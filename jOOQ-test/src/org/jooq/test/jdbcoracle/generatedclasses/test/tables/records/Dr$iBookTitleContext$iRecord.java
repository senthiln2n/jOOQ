/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dr$iBookTitleContext$iRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$iRecord> implements org.jooq.Record6<java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, byte[]>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i {

	private static final long serialVersionUID = 1812400616;

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TEXT</code>. 
	 */
	@Override
	public void setTokenText(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TEXT</code>. 
	 */
	@Override
	public java.lang.String getTokenText() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TYPE</code>. 
	 */
	@Override
	public void setTokenType(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TYPE</code>. 
	 */
	@Override
	public java.lang.Long getTokenType() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_FIRST</code>. 
	 */
	@Override
	public void setTokenFirst(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_FIRST</code>. 
	 */
	@Override
	public java.lang.Long getTokenFirst() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_LAST</code>. 
	 */
	@Override
	public void setTokenLast(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_LAST</code>. 
	 */
	@Override
	public java.lang.Long getTokenLast() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_COUNT</code>. 
	 */
	@Override
	public void setTokenCount(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_COUNT</code>. 
	 */
	@Override
	public java.lang.Long getTokenCount() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_INFO</code>. 
	 */
	@Override
	public void setTokenInfo(byte[] value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_INFO</code>. 
	 */
	@Override
	public byte[] getTokenInfo() {
		return (byte[]) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, byte[]> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, byte[]> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$i.TOKEN_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$i.TOKEN_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$i.TOKEN_FIRST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$i.TOKEN_LAST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$i.TOKEN_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field6() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$i.TOKEN_INFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getTokenText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value2() {
		return getTokenType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getTokenFirst();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getTokenLast();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getTokenCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value6() {
		return getTokenInfo();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i from) {
		setTokenText(from.getTokenText());
		setTokenType(from.getTokenType());
		setTokenFirst(from.getTokenFirst());
		setTokenLast(from.getTokenLast());
		setTokenCount(from.getTokenCount());
		setTokenInfo(from.getTokenInfo());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Dr$iBookTitleContext$iRecord
	 */
	public Dr$iBookTitleContext$iRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$i.DR$I_BOOK_TITLE_CONTEXT$I);
	}
}