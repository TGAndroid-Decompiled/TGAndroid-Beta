package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.w9;
public final class p0 implements w9 {
    public final Layout f46129a;
    public final int f46130b;
    public final int f46131c;
    public final r0 d;

    public p0(r0 r0Var, Layout layout, int i10, int i11) {
        this.d = r0Var;
        this.f46129a = layout;
        this.f46130b = i10;
        this.f46131c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f46129a;
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
        a aVar = this.d.f46178f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45853b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return y5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f46130b;
    }

    @Override
    public final int getY() {
        return this.f46131c;
    }
}
