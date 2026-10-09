package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.r6;
import w7.x5;
public final class x extends m4 {
    public final r6 f49638r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        r6 r6Var = new r6(context, true, true, true);
        this.f49638r = r6Var;
        r6Var.b(0.45f, 240L, hs.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        r6Var.setGravity(i10);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setTextColor(i6.w0(i6.L6, e6Var));
        addView(r6Var, x5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        setBackgroundColor(i6.w0(i6.f20868h5, e6Var));
    }
}
