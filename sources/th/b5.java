package th;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.v9;
public final class b5 implements v9 {
    public final Layout f48371a;
    public final int f48372b;
    public final int f48373c;
    public final g5 d;

    public b5(g5 g5Var, Layout layout, int i10, int i11) {
        this.d = g5Var;
        this.f48371a = layout;
        this.f48372b = i10;
        this.f48373c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f48371a;
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
        a aVar = this.d.f48892a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return v5.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f48372b;
    }

    @Override
    public final int getY() {
        return this.f48373c;
    }
}
