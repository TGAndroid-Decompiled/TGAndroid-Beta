package vg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
public final class y extends o0 {
    public final i0 S;

    public y(i0 i0Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.S = i0Var;
    }

    @Override
    public final void invalidate() {
        if (this.S.Y1) {
            return;
        }
        super.invalidate();
    }
}
