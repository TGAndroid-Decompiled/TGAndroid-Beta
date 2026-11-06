package zh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.ui.Components.g5;
public final class v0 extends g5 {
    public final w0 M;

    public v0(w0 w0Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.M = w0Var;
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
