package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class x51 extends e71 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final y51 S;

    public x51(y51 y51Var, Context context, Runnable runnable, View view, r61 r61Var, org.telegram.ui.ActionBar.f6 f6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(y51Var.e, context, runnable, view, r61Var, f6Var);
        this.S = y51Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
