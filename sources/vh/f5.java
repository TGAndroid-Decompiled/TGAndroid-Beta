package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.w9;
public final class f5 implements w9 {
    public final Layout f45978a;
    public final int f45979b;
    public final int f45980c;
    public final int d;
    public final TL_iv.pageTableCell e;

    public f5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f45978a = layout;
        this.f45979b = i10;
        this.f45980c = i11;
        this.d = i12;
        this.e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f45978a;
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
        return a6.h(this.e);
    }

    @Override
    public final int getX() {
        return this.f45979b;
    }

    @Override
    public final int getY() {
        return this.f45980c;
    }
}
