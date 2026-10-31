package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class y11 extends e31 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final z11 S;

    public y11(z11 z11Var, Context context, Runnable runnable, View view, s21 s21Var, org.telegram.ui.ActionBar.p6 p6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(z11Var.e, context, runnable, view, s21Var, p6Var);
        this.S = z11Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
