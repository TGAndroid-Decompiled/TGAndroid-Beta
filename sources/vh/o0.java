package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class o0 implements x9 {
    public final Layout f46032a;
    public final int f46033b;
    public final int f46034c;
    public final q0 d;

    public o0(q0 q0Var, Layout layout, int i10, int i11) {
        this.d = q0Var;
        this.f46032a = layout;
        this.f46033b = i10;
        this.f46034c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f46032a;
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
        a aVar = this.d.f46081f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45775b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                return x5.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f46033b;
    }

    @Override
    public final int getY() {
        return this.f46034c;
    }
}
