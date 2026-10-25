package zh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.r5;
public final class c1 extends r5 {
    public final d1 M;

    public c1(d1 d1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = d1Var;
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
