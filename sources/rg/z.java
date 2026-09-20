package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
public final class z extends p0 {
    public final j0 P;

    public z(j0 j0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.P = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.P.f42613f0) {
            return;
        }
        super.invalidate();
    }
}
