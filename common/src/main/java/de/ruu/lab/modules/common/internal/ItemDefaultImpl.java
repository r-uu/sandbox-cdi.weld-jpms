package de.ruu.lab.modules.common.internal;

import java.math.BigDecimal;

import de.ruu.lab.modules.common.Item;

public record ItemDefaultImpl(String name, BigDecimal price) implements Item { }