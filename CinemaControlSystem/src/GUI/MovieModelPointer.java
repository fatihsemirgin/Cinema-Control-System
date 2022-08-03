package GUI;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;

import CCS.Movie;

@SuppressWarnings("rawtypes")
public class MovieModelPointer extends JLabel implements ListCellRenderer {

	public MovieModelPointer() {
		setOpaque(true);
	}

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		Movie item = (Movie) value;
		this.setText(item.getMovie_name());
		this.setIcon(item.getPoster());

		if (isSelected) {
			setBackground(Color.BLACK);
			setForeground(Color.LIGHT_GRAY);
		}
		if (!isSelected) {
			setBackground(Color.LIGHT_GRAY);
			setForeground(Color.BLACK);
		}

		if (cellHasFocus) {
			setBorder(BorderFactory.createLineBorder(Color.RED));
		} else {
			setBorder(BorderFactory.createEmptyBorder());
		}

		setEnabled(true);
		setFont(list.getFont());
		return this;
	}

}
