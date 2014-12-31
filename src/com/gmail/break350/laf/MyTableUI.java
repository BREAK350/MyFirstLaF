package com.gmail.break350.laf;

import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTableUI;

public class MyTableUI extends BasicTableUI {
	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
	}

	public static ComponentUI createUI(JComponent c) {
		return new MyTableUI();
	}
}
