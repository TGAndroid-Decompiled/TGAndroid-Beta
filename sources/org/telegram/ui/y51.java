package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class y51 extends f71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final z51 S;

    public y51(z51 z51Var, Context context, Runnable runnable, View view, s61 s61Var, org.telegram.ui.ActionBar.d6 d6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(z51Var.f44622e, context, runnable, view, s61Var, d6Var);
        this.S = z51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.f44622e.X0 = null;
    }
}
