package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class e5 implements x9 {
    public final Layout f45881a;
    public final int f45882b;
    public final int f45883c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public e5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f45881a = layout;
        this.f45882b = i10;
        this.f45883c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f45881a;
    }

    @Override
    public final CharSequence getPrefix() {
        return null;
    }

    @Override
    public final int getRow() {
        return this.d;
    }

    @Override
    public final Rect getSelectionBounds() {
        return null;
    }

    @Override
    public final CharSequence getText() {
        return z5.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f45882b;
    }

    @Override
    public final int getY() {
        return this.f45883c;
    }
}
