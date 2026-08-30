package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class f0 implements x9 {
    public final Layout f45887a;
    public final int f45888b;
    public final int f45889c;
    public final h0 d;

    public f0(h0 h0Var, Layout layout, int i10, int i11) {
        this.d = h0Var;
        this.f45887a = layout;
        this.f45888b = i10;
        this.f45889c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f45887a;
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
        a E = this.d.f45911c.E();
        if (E != null && (pageBlock = E.f45775b) != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            return x5.r(richText, null, true);
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f45888b;
    }

    @Override
    public final int getY() {
        return this.f45889c;
    }
}
