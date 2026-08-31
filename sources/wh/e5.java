package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class e5 implements x9 {
    public final Layout f49729a;
    public final int f49730b;
    public final int f49731c;
    public final int d;
    public final TL_iv.pageTableCell f49732e;

    public e5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f49729a = layout;
        this.f49730b = i10;
        this.f49731c = i11;
        this.d = i12;
        this.f49732e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f49729a;
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
        return z5.h(this.f49732e);
    }

    @Override
    public final int getX() {
        return this.f49730b;
    }

    @Override
    public final int getY() {
        return this.f49731c;
    }
}
