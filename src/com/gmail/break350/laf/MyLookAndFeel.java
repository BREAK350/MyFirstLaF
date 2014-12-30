package com.gmail.break350.laf;

import javax.swing.UIDefaults;
import javax.swing.plaf.basic.BasicLookAndFeel;

public class MyLookAndFeel extends BasicLookAndFeel {
	private static final long serialVersionUID = 1L;

	@Override
	public String getDescription() {
		return "Cross-platform Java Look and Feel";
	}

	@Override
	public String getID() {
		return getName();
	}

	@Override
	public String getName() {
		return "MyLookAndFeel";
	}

	@Override
	public boolean isNativeLookAndFeel() {
		return false;
	}

	@Override
	public boolean isSupportedLookAndFeel() {
		return true;
	}

	@Override
	protected void initClassDefaults(UIDefaults table) {
		super.initClassDefaults(table);
		table.put("ButtonUI", MyButtonUI.class.getCanonicalName());
	}
}
