package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.x9;
public final class a0 implements x9 {
    public final Layout f49670a;
    public final Rect f49671b;

    public a0(Layout layout, Rect rect) {
        this.f49670a = layout;
        this.f49671b = rect;
    }

    @Override
    public final Layout getLayout() {
        return this.f49670a;
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
        return this.f49671b;
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
