package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class p0 implements x9 {
    public final Layout f49956a;
    public final int f49957b;
    public final int f49958c;
    public final r0 d;

    public p0(r0 r0Var, Layout layout, int i10, int i11) {
        this.d = r0Var;
        this.f49956a = layout;
        this.f49957b = i10;
        this.f49958c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f49956a;
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
        a aVar = this.d.f50001f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49653b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return x5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f49957b;
    }

    @Override
    public final int getY() {
        return this.f49958c;
    }
}
