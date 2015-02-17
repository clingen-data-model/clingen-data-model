package org.clingen.dm.allele.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ReferenceSequenceType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReferenceSequenceType-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="genomic"/>
 *     &lt;enumeration value="transcript"/>
 *     &lt;enumeration value="amino acid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType (name = "ReferenceSequenceType-list")
@XmlEnum
public enum ReferenceSequenceTypeList
{

	/**
	 * A genomic reference sequence.
	 * 
	 */
	@XmlEnumValue ("genomic")
	GENOMIC("genomic"),

	/**
	 * A transcript reference sequence.
	 * 
	 */
	@XmlEnumValue ("transcript")
	TRANSCRIPT("transcript"),

	/**
	 * An amino acid reference sequence.
	 * 
	 */
	@XmlEnumValue ("amino acid")
	AMINO_ACID("amino acid");
	private final java.lang.String value;

	ReferenceSequenceTypeList(java.lang.String v)
	{
		value = v;
	}

	public java.lang.String value()
	{
		return value;
	}

	public static ReferenceSequenceTypeList fromValue(java.lang.String v)
	{
		for (ReferenceSequenceTypeList c : ReferenceSequenceTypeList.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
