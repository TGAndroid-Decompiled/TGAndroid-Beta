package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class v51 extends c71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final w51 S;

    public v51(w51 w51Var, Context context, Runnable runnable, View view, p61 p61Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(w51Var.e, context, runnable, view, p61Var, e6Var);
        this.S = w51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
