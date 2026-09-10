package wh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.n5;
public final class d1 extends n5 {
    public final e1 M;

    public d1(e1 e1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = e1Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.M;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
