package com.gmail.break350.laf;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTableUI;

public class MyTableUI extends BasicTableUI {
	@Override
	public void installUI(JComponent c) {
		super.installUI(c);
		JTable table = (JTable) c;
		table.setOpaque(false);
		table.setFocusable(true);
		table.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		table.setGridColor(new Color(0xe6e6e6));
	}

	public static ComponentUI createUI(JComponent c) {
		return new MyTableUI();
	}
}
