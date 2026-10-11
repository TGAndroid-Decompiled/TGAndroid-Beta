package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.r6;
import w7.x5;
public final class x extends m4 {
    public final r6 f49759r;

    public x(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        r6 r6Var = new r6(context, true, true, true);
        this.f49759r = r6Var;
        r6Var.b(0.45f, 240L, is.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        r6Var.setGravity(i10);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setTextColor(h6.w0(h6.L6, d6Var));
        addView(r6Var, x5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        setBackgroundColor(h6.w0(h6.f20893h5, d6Var));
    }
}
