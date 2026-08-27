package rh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.u9;

public final class o0 implements u9 {

    public final Layout f47303a;

    public final int f47304b;

    public final int f47305c;
    public final q0 d;

    public o0(q0 q0Var, Layout layout, int i10, int i11) {
        this.d = q0Var;
        this.f47303a = layout;
        this.f47304b = i10;
        this.f47305c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f47303a;
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
        a aVar = this.d.f47388f;
        if (aVar == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = aVar.f47028b;
        return pageBlock instanceof TL_iv.pageBlockDetails ? v5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : "";
    }

    @Override
    public final int getX() {
        return this.f47304b;
    }

    @Override
    public final int getY() {
        return this.f47305c;
    }
}
