package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.v9;
public final class c5 implements v9 {
    public final Layout f48392a;
    public final int f48393b;
    public final int f48394c;
    public final int d;
    public final TL_iv.pageTableCell f48395e;

    public c5(Layout layout, int i10, int i11, int i12, TL_iv.pageTableCell pagetablecell) {
        this.f48392a = layout;
        this.f48393b = i10;
        this.f48394c = i11;
        this.d = i12;
        this.f48395e = pagetablecell;
    }

    @Override
    public final Layout getLayout() {
        return this.f48392a;
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
        return x5.h(this.f48395e);
    }

    @Override
    public final int getX() {
        return this.f48393b;
    }

    @Override
    public final int getY() {
        return this.f48394c;
    }
}
