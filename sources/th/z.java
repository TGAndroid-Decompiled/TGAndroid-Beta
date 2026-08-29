package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.v9;
public final class z implements v9 {
    public final Layout f48910a;
    public final Rect f48911b;

    public z(Layout layout, Rect rect) {
        this.f48910a = layout;
        this.f48911b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f48910a;
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
        return this.f48911b;
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
