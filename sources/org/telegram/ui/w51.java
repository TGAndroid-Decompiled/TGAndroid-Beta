package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class w51 extends d71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final x51 S;

    public w51(x51 x51Var, Context context, Runnable runnable, View view, q61 q61Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(x51Var.e, context, runnable, view, q61Var, e6Var);
        this.S = x51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
