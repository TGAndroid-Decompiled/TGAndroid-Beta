package xh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.n5;
public final class e1 extends n5 {
    public final f1 M;

    public e1(f1 f1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = f1Var;
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
