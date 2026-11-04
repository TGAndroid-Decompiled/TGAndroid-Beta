package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class wz0 extends c11 {
    public final View R;
    public final TL_stars.TL_starGiftUnique S;
    public final xz0 T;

    public wz0(xz0 xz0Var, Context context, Runnable runnable, View view, q01 q01Var, org.telegram.ui.ActionBar.e6 e6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(xz0Var.f52134e, context, runnable, view, q01Var, e6Var);
        this.T = xz0Var;
        this.R = view2;
        this.S = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.T.f52134e.Y0 = null;
    }
}
