package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.v9;
public final class o0 implements v9 {
    public final Layout f48597a;
    public final int f48598b;
    public final int f48599c;
    public final q0 d;

    public o0(q0 q0Var, Layout layout, int i10, int i11) {
        this.d = q0Var;
        this.f48597a = layout;
        this.f48598b = i10;
        this.f48599c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f48597a;
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
        a aVar = this.d.f48686f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return v5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f48598b;
    }

    @Override
    public final int getY() {
        return this.f48599c;
    }
}
