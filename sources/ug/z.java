package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
public final class z extends q0 {
    public final j0 S;

    public z(j0 j0Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.S = j0Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.f58131b2) {
            return;
        }
        super.invalidate();
    }
}
