package rh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

public final class f0 implements u9 {

    public final Layout f47132a;

    public final int f47133b;

    public final int f47134c;
    public final h0 d;

    public f0(h0 h0Var, Layout layout, int i10, int i11) {
        this.d = h0Var;
        this.f47132a = layout;
        this.f47133b = i10;
        this.f47134c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f47132a;
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
        return null;
    }

    @Override
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        a aVarU0 = this.d.f47173c.u0();
        return (aVarU0 == null || (pageBlock = aVarU0.f47028b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : v5.r(richText, null, true);
    }

    @Override
    public final int getX() {
        return this.f47133b;
    }

    @Override
    public final int getY() {
        return this.f47134c;
    }
}
