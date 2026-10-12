package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
public final class z extends q0 {
    public final j0 P;

    public z(j0 j0Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.P = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.P.f47501f0) {
            return;
        }
        super.invalidate();
    }
}
