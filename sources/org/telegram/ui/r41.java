package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class r41 extends y51 {
    public final View Q;
    public final TL_stars.TL_starGiftUnique R;
    public final s41 S;

    public r41(s41 s41Var, Context context, Runnable runnable, View view, l51 l51Var, org.telegram.ui.ActionBar.u6 u6Var, View view2, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(s41Var.e, context, runnable, view, l51Var, u6Var);
        this.S = s41Var;
        this.Q = view2;
        this.R = tL_starGiftUnique;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S.e.X0 = null;
    }
}
