package xh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.q5;
public final class f1 extends q5 {
    public final g1 M;

    public f1(g1 g1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = g1Var;
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
