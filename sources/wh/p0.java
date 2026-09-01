package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class p0 implements x9 {
    public final Layout f49920a;
    public final int f49921b;
    public final int f49922c;
    public final r0 d;

    public p0(r0 r0Var, Layout layout, int i10, int i11) {
        this.d = r0Var;
        this.f49920a = layout;
        this.f49921b = i10;
        this.f49922c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f49920a;
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
        a aVar = this.d.f49965f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49617b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return x5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f49921b;
    }

    @Override
    public final int getY() {
        return this.f49922c;
    }
}
