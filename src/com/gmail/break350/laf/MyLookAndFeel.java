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
		// // Label
		// table.put ( "LabelUI", ... );
		// table.put ( "ToolTipUI", ... );
		//
		// // Button
		table.put("ButtonUI", MyButtonUI.class.getCanonicalName());
		// table.put ( "ToggleButtonUI", ... );
		// table.put ( "CheckBoxUI", ... );
		// table.put ( "RadioButtonUI", ... );
		//
		// // Menu
		// table.put ( "MenuBarUI", ... );
		// table.put ( "MenuUI", ... );
		// table.put ( "PopupMenuUI", ... );
		// table.put ( "MenuItemUI", ... );
		// table.put ( "CheckBoxMenuItemUI", ... );
		// table.put ( "RadioButtonMenuItemUI", ... );
		// table.put ( "PopupMenuSeparatorUI", ... );
		//
		// // Separator
		// table.put ( "SeparatorUI", ... );
		//
		// // Scroll
		// table.put ( "ScrollBarUI", ... );
		// table.put ( "ScrollPaneUI", ... );
		//
		// // Text
		// table.put ( "TextFieldUI", ... );
		// table.put ( "PasswordFieldUI", ... );
		// table.put ( "FormattedTextFieldUI", ... );
		// table.put ( "TextAreaUI", ... );
		// table.put ( "EditorPaneUI", ... );
		// table.put ( "TextPaneUI", ... );
		//
		// // Toolbar
		// table.put ( "ToolBarUI", ... );
		// table.put ( "ToolBarSeparatorUI", ... );
		//
		// // Table
		table.put("TableUI", MyTableUI.class.getCanonicalName());
		// table.put ( "TableHeaderUI", ... );
		//
		// // Chooser
		// table.put ( "ColorChooserUI", ... );
		// table.put ( "FileChooserUI", ... );
		//
		// // Container
		// table.put ( "PanelUI", ... );
		// table.put ( "ViewportUI", ... );
		// table.put ( "RootPaneUI", ... );
		// table.put ( "TabbedPaneUI", ... );
		// table.put ( "SplitPaneUI", ... );
		//
		// // Complex components
		// table.put ( "ProgressBarUI", ... );
		// table.put ( "SliderUI", ... );
		// table.put ( "SpinnerUI", ... );
		// table.put ( "TreeUI", ... );
		// table.put ( "ListUI", ... );
		// table.put ( "ComboBoxUI", ... );
		//
		// // Desktop pane
		// table.put ( "DesktopPaneUI", ... );
		// table.put ( "DesktopIconUI", ... );
		// table.put ( "InternalFrameUI", ... );
		//
		// // Option pane
		// table.put ( "OptionPaneUI", ... );
	}
}
