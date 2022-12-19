package de.ruu.lab.modules.item;

import java.math.BigDecimal;

public class CDIGreeter
{
	public String greet() { return "hello, item: " + Item.newInstance("test", BigDecimal.ONE); }
}