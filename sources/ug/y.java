package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
public final class y extends p0 {
    public final i0 R;

    public y(i0 i0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.R = i0Var;
    }

    @Override
    public final void invalidate() {
        if (this.R.X1) {
            return;
        }
        super.invalidate();
    }
}
