package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
public final class z extends p0 {
    public final j0 P;

    public z(j0 j0Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.P = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.P.f42585f0) {
            return;
        }
        super.invalidate();
    }
}
