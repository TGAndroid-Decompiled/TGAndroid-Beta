package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class g0 implements x9 {
    public final Layout f49749a;
    public final int f49750b;
    public final int f49751c;
    public final i0 d;

    public g0(i0 i0Var, Layout layout, int i10, int i11) {
        this.d = i0Var;
        this.f49749a = layout;
        this.f49750b = i10;
        this.f49751c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f49749a;
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
        a G = this.d.f49779c.G();
        if (G != null && (pageBlock = G.f49616b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return x5.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f49750b;
    }

    @Override
    public final int getY() {
        return this.f49751c;
    }
}
