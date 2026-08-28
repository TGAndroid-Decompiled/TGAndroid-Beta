package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class f0 implements y9 {
    public final Layout f46373a;
    public final int f46374b;
    public final int f46375c;
    public final h0 d;

    public f0(h0 h0Var, Layout layout, int i9, int i10) {
        this.d = h0Var;
        this.f46373a = layout;
        this.f46374b = i9;
        this.f46375c = i10;
    }

    @Override
    public final Layout getLayout() {
        return this.f46373a;
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
        a I = this.d.f46411c.I();
        if (I != null && (pageBlock = I.f46269b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return u5.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f46374b;
    }

    @Override
    public final int getY() {
        return this.f46375c;
    }
}
