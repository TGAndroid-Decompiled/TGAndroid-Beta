package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class e5 implements x9 {
    public final Layout f49730a;
    public final int f49731b;
    public final int f49732c;
    public final int d;
    public final TL_iv.pageTableCell f49733e;

    public e5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f49730a = layout;
        this.f49731b = i10;
        this.f49732c = i11;
        this.d = i12;
        this.f49733e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f49730a;
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
        return z5.h(this.f49733e);
    }

    @Override
    public final int getX() {
        return this.f49731b;
    }

    @Override
    public final int getY() {
        return this.f49732c;
    }
}
