package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;
public final class a0 extends r0 {
    public final k0 S;

    public a0(k0 k0Var, Context context, i6 i6Var) {
        super(context, i6Var, true);
        this.S = k0Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.f58849b2) {
            return;
        }
        super.invalidate();
    }
}
