package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class b5 implements y9 {
    public final Layout f46317a;
    public final int f46318b;
    public final int f46319c;
    public final int d;
    public final TL_iv.pageTableCell f46320e;

    public b5(Layout layout, int i9, int i10, int i11, TL_iv.pageTableCell pagetablecell) {
        this.f46317a = layout;
        this.f46318b = i9;
        this.f46319c = i10;
        this.d = i11;
        this.f46320e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f46317a;
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
        return w5.h(this.f46320e);
    }

    @Override
    public final int getX() {
        return this.f46318b;
    }

    @Override
    public final int getY() {
        return this.f46319c;
    }
}
