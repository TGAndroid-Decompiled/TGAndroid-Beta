package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class w11 extends c31 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final x11 S;

    public w11(x11 x11Var, Context context, Runnable runnable, View view, q21 q21Var, org.telegram.ui.ActionBar.p6 p6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(x11Var.e, context, runnable, view, q21Var, p6Var);
        this.S = x11Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
