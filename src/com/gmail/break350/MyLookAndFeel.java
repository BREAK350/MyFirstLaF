package com.gmail.break350;

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
		return false;
	}

}
