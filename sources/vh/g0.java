package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.w9;
public final class g0 implements w9 {
    public final Layout f45984a;
    public final int f45985b;
    public final int f45986c;
    public final i0 d;

    public g0(i0 i0Var, Layout layout, int i10, int i11) {
        this.d = i0Var;
        this.f45984a = layout;
        this.f45985b = i10;
        this.f45986c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f45984a;
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
        a T0 = this.d.f46008c.T0();
        if (T0 != null && (pageBlock = T0.f45853b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return y5.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f45985b;
    }

    @Override
    public final int getY() {
        return this.f45986c;
    }
}
