package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.tr;
import w7.z5;
public final class x extends m4 {
    public final p6 f48356r;

    public x(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        p6 p6Var = new p6(context, true, true, true);
        this.f48356r = p6Var;
        p6Var.b(0.45f, 240L, tr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        p6Var.setGravity(i10);
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(i6.v0(i6.L6, d6Var));
        addView(p6Var, z5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(i6.v0(i6.f20899h5, d6Var));
    }
}
