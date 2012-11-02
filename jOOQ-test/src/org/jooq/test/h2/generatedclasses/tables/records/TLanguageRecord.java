/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings("all")
public class TLanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TLanguageRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer>, org.jooq.test.h2.generatedclasses.tables.interfaces.ITLanguage {

	private static final long serialVersionUID = -1815815629;

	/**
	 * The language ISO code
	 */
	@Override
	public void setCd(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.CD, value);
	}

	/**
	 * The language ISO code
	 */
	@Override
	public java.lang.String getCd() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.CD);
	}

	/**
	 * The language description
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION, value);
	}

	/**
	 * The language description
	 */
	@Override
	public java.lang.String getDescription() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	@Override
	public void setDescriptionEnglish(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH, value);
	}

	/**
	 * The table column <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>
	 */
	@Override
	public java.lang.String getDescriptionEnglish() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH);
	}

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.ID, value);
	}

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.ID);
	}

	/**
	 * The language ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord> fetchTBookList() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.h2.generatedclasses.tables.TBook.LANGUAGE_ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.TLanguage.ID)))
			.fetch();
	}

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.h2.generatedclasses.tables.TLanguage.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.h2.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.h2.generatedclasses.tables.TLanguage.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescriptionEnglish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getId();
	}
}