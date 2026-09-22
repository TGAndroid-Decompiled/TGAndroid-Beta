package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
public final class z extends p0 {
    public final j0 P;

    public z(j0 j0Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.P = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.P.f42311f0) {
            return;
        }
        super.invalidate();
    }
}
