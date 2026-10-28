package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class u41 extends b61 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final v41 S;

    public u41(v41 v41Var, Context context, Runnable runnable, View view, o51 o51Var, org.telegram.ui.ActionBar.u6 u6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(v41Var.e, context, runnable, view, o51Var, u6Var);
        this.S = v41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
