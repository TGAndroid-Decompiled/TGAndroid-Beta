package rh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.u9;

public final class z implements u9 {

    public final Layout f47612a;

    public final Rect f47613b;

    public z(Layout layout, Rect rect) {
        this.f47612a = layout;
        this.f47613b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f47612a;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return 0;
    }

    @Override
    public final Rect getSelectionBounds() {
        return this.f47613b;
    }

    @Override
    public final CharSequence getText() {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        return layout.getText();
    }

    @Override
    public final int getX() {
        return 0;
    }

    @Override
    public final int getY() {
        return 0;
    }
}
