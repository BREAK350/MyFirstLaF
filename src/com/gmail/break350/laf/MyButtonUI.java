package com.gmail.break350.laf;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.RenderingHints;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class MyButtonUI extends BasicButtonUI {
	public void installUI(JComponent c) {
		// Обязательно оставляем установку UI, реализованную в Basic UI классе
		super.installUI(c);

		// Устанавливаем желаемые настройки JButton'а
		// Для абстракции используем AbstractButton, так как в нём есть всё
		// необходимое нам
		AbstractButton button = (AbstractButton) c;
		button.setOpaque(false);
		button.setFocusable(true);
		button.setMargin(new Insets(0, 0, 0, 0));
		button.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		button.setRolloverEnabled(true);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
	}

	public void paint(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		AbstractButton button = (AbstractButton) c;
		ButtonModel buttonModel = button.getModel();

		Paint backGround = null;
		Paint border = null;

		Color from = Color.WHITE;
		Color to = new Color(0xe6e6e6);

		// якщо курсор знаходиться над компонентом
		if (buttonModel.isPressed()) {
			backGround = new GradientPaint(0, 0, to, 0, c.getHeight(), from);
			border = Color.BLUE;
		} else if (buttonModel.isRollover()) {
			backGround = to;
			border = Color.GRAY;
		} else {
			backGround = new GradientPaint(0, 0, from, 0, c.getHeight(), to);
			border = Color.GRAY;
		}

		g2d.setPaint(backGround);
		g2d.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 8, 8);

		g2d.setPaint(border);
		// Важно помнить, что форму необходимо делать на 1px меньше, чем
		// ширина/высота компонента,
		// иначе правый и нижний края фигуры вылезут за границу компонента и не
		// будут видны
		// К заливке это не относится, так как последняя колонка/строка пикселей
		// игнорируется при заполнении
		g2d.drawRoundRect(0, 0, c.getWidth() - 1, c.getHeight() - 1, 6, 6);

		// Отрисовка текста и иконки изображения
		super.paint(g, c);
	}

	public static ComponentUI createUI(JComponent c) {
		return new MyButtonUI();
	}
}
