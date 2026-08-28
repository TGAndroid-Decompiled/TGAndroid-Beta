package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.y9;
public final class z implements y9 {
    public final Layout f46857a;
    public final Rect f46858b;

    public z(Layout layout, Rect rect) {
        this.f46857a = layout;
        this.f46858b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f46857a;
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
        return this.f46858b;
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
