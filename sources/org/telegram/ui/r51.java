package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class r51 extends y61 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final s51 S;

    public r51(s51 s51Var, Context context, Runnable runnable, View view, l61 l61Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(s51Var.e, context, runnable, view, l61Var, e6Var);
        this.S = s51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
