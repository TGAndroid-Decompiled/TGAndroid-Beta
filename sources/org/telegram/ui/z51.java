package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class z51 extends g71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final a61 S;

    public z51(a61 a61Var, Context context, Runnable runnable, View view, t61 t61Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(a61Var.f35855e, context, runnable, view, t61Var, e6Var);
        this.S = a61Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.f35855e.X0 = null;
    }
}
