package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.w9;
public final class e5 implements w9 {
    public final Layout f45956a;
    public final int f45957b;
    public final int f45958c;
    public final j5 d;

    public e5(j5 j5Var, Layout layout, int i10, int i11) {
        this.d = j5Var;
        this.f45956a = layout;
        this.f45957b = i10;
        this.f45958c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f45956a;
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
        TL_iv.RichText richText;
        a aVar = this.d.f46414a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45853b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return y5.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f45957b;
    }

    @Override
    public final int getY() {
        return this.f45958c;
    }
}
