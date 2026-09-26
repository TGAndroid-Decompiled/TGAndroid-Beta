package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rr;
import w7.y5;
public final class x extends m4 {
    public final p6 f44646r;

    public x(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        p6 p6Var = new p6(context, true, true, true);
        this.f44646r = p6Var;
        p6Var.b(0.45f, 240L, rr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        p6Var.setGravity(i10);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(h6.v0(h6.L6, d6Var));
        addView(p6Var, y5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(h6.v0(h6.f19129h5, d6Var));
    }
}
