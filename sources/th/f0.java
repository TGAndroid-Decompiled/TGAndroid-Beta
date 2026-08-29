package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.v9;
public final class f0 implements v9 {
    public final Layout f48432a;
    public final int f48433b;
    public final int f48434c;
    public final h0 d;

    public f0(h0 h0Var, Layout layout, int i10, int i11) {
        this.d = h0Var;
        this.f48432a = layout;
        this.f48433b = i10;
        this.f48434c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f48432a;
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
        a G = this.d.f48473c.G();
        if (G != null && (pageBlock = G.f48328b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return v5.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f48433b;
    }

    @Override
    public final int getY() {
        return this.f48434c;
    }
}
