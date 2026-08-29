package ru.noties.jlatexmath.swing;

import ru.noties.jlatexmath.awt.Component;
import ru.noties.jlatexmath.awt.Graphics;
public interface Icon {
    int getIconHeight();

    int getIconWidth();

    void paintIcon(Component component, Graphics graphics, int i10, int i11);
}
