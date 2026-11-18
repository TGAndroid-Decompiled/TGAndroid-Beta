package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;
public final class b0 extends s0 {
    public final l0 S;

    public b0(l0 l0Var, Context context, i6 i6Var) {
        super(context, i6Var, true);
        this.S = l0Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.f58729b2) {
            return;
        }
        super.invalidate();
    }
}
