package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.x9;
public final class d5 implements x9 {
    public final Layout f49740a;
    public final int f49741b;
    public final int f49742c;
    public final i5 d;

    public d5(i5 i5Var, Layout layout, int i10, int i11) {
        this.d = i5Var;
        this.f49740a = layout;
        this.f49741b = i10;
        this.f49742c = i11;
    }

    @Override
    public final Layout getLayout() {
        return this.f49740a;
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
        a aVar = this.d.f50211a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49653b;
            if ((pageBlock instanceof TL_iv.pageBlockTable) && (richText = ((TL_iv.pageBlockTable) pageBlock).title) != null) {
                return x5.r(richText, null, true);
            }
            return "";
        }
        return "";
    }

    @Override
    public final int getX() {
        return this.f49741b;
    }

    @Override
    public final int getY() {
        return this.f49742c;
    }
}
