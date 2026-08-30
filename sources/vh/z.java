package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.x9;
public final class z implements x9 {
    public final Layout f46328a;
    public final Rect f46329b;

    public z(Layout layout, Rect rect) {
        this.f46328a = layout;
        this.f46329b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f46328a;
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
        return this.f46329b;
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
