package rh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

public final class c5 implements u9 {

    public final Layout f47092a;

    public final int f47093b;

    public final int f47094c;
    public final int d;

    public final TL_iv.pageTableCell f47095e;

    public c5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f47092a = layout;
        this.f47093b = i10;
        this.f47094c = i11;
        this.d = i12;
        this.f47095e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f47092a;
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
        return x5.h(this.f47095e);
    }

    @Override
    public final int getX() {
        return this.f47093b;
    }

    @Override
    public final int getY() {
        return this.f47094c;
    }
}
