package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class g0 implements x9 {
    public final Layout f49786a;
    public final int f49787b;
    public final int f49788c;
    public final i0 d;

    public g0(i0 i0Var, Layout layout, int i10, int i11) {
        this.d = i0Var;
        this.f49786a = layout;
        this.f49787b = i10;
        this.f49788c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f49786a;
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
        a G = this.d.f49816c.G();
        if (G != null && (pageBlock = G.f49653b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return x5.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f49787b;
    }

    @Override
    public final int getY() {
        return this.f49788c;
    }
}
