package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class o0 implements y9 {
    public final Layout f46551a;
    public final int f46552b;
    public final int f46553c;
    public final q0 d;

    public o0(q0 q0Var, Layout layout, int i9, int i10) {
        this.d = q0Var;
        this.f46551a = layout;
        this.f46552b = i9;
        this.f46553c = i10;
    }

    @Override
    public final Layout getLayout() {
        return this.f46551a;
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
        a aVar = this.d.f46625f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return u5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f46552b;
    }

    @Override
    public final int getY() {
        return this.f46553c;
    }
}
