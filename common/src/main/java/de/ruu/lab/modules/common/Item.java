package de.ruu.lab.modules.common;

import java.math.BigDecimal;

import de.ruu.lab.modules.common.internal.ItemDefaultImpl;

public interface Item
{
	String name();
	BigDecimal price();

	public static Item newInstance(String name, BigDecimal price) { return new ItemDefaultImpl(name, price); }
}