package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;
public final class a0 extends r0 {
    public final k0 S;

    public a0(k0 k0Var, Context context, h6 h6Var) {
        super(context, h6Var, true);
        this.S = k0Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.f58769b2) {
            return;
        }
        super.invalidate();
    }
}
