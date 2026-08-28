package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.y9;
public final class a5 implements y9 {
    public final Layout f46294a;
    public final int f46295b;
    public final int f46296c;
    public final f5 d;

    public a5(f5 f5Var, Layout layout, int i9, int i10) {
        this.d = f5Var;
        this.f46294a = layout;
        this.f46295b = i9;
        this.f46296c = i10;
    }

    @Override
    public final Layout getLayout() {
        return this.f46294a;
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
        a aVar = this.d.f46834a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return u5.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f46295b;
    }

    @Override
    public final int getY() {
        return this.f46296c;
    }
}
