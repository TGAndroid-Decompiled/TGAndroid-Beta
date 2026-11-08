package zh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.g5;
public final class u0 extends g5 {
    public final v0 M;

    public u0(v0 v0Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.M = v0Var;
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
