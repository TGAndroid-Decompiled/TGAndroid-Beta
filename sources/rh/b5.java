package rh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

public final class b5 implements u9 {

    public final Layout f47071a;

    public final int f47072b;

    public final int f47073c;
    public final g5 d;

    public b5(g5 g5Var, Layout layout, int i10, int i11) {
        this.d = g5Var;
        this.f47071a = layout;
        this.f47072b = i10;
        this.f47073c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f47071a;
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
        a aVar = this.d.f47594a;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        return (!(pageBlock instanceof TL_iv.pageBlockTable) || (richText = ((TL_iv.pageBlockTable) pageBlock).title) == null) ? "" : v5.r(richText, null, true);
    }

    @Override
    public final int getX() {
        return this.f47072b;
    }

    @Override
    public final int getY() {
        return this.f47073c;
    }
}
