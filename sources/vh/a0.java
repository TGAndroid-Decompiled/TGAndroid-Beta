package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.w9;
public final class a0 implements w9 {
    public final Layout f45869a;
    public final Rect f45870b;

    public a0(Layout layout, Rect rect) {
        this.f45869a = layout;
        this.f45870b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f45869a;
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
        return this.f45870b;
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
