package com.gmail.break350.laf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.table.TableColumnModel;

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

	@Override
	public void paint(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		JTable table = (JTable) c;
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(0).setCellRenderer(new MyTableCellRender());
		g2d.setPaint(Color.RED);
		g2d.drawRect(2, 2, 30, 30);
		super.paint(g, c);
	}

	public static ComponentUI createUI(JComponent c) {
		return new MyTableUI();
	}
}
