package ph;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.d5;
public final class y0 extends d5 {
    public final z0 M;

    public y0(z0 z0Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.M = z0Var;
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
