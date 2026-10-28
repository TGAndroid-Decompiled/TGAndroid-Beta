package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
public final class z extends p0 {
    public final j0 R;

    public z(j0 j0Var, Context context, u6 u6Var) {
        super(context, u6Var, true);
        this.R = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.R.f48924f0) {
            return;
        }
        super.invalidate();
    }
}
