package de.ruu.lab.modules.item.internal;

import java.math.BigDecimal;

import de.ruu.lab.modules.item.Item;

public record ItemDefaultImpl(String name, BigDecimal price) implements Item { }