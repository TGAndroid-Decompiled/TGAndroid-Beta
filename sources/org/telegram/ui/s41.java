package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class s41 extends z51 {
    public final View M;
    public final TL_stars.TL_starGiftUnique N;
    public final t41 O;

    public s41(t41 t41Var, Context context, Runnable runnable, View view, m51 m51Var, org.telegram.ui.ActionBar.c6 c6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(t41Var.f42550e, context, runnable, view, m51Var, c6Var);
        this.O = t41Var;
        this.M = view2;
        this.N = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.O.f42550e.T0 = null;
    }
}
