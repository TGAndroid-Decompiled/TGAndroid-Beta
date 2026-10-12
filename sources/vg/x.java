package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.r6;
import w7.w5;
public final class x extends m4 {
    public final r6 f49874r;

    public x(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        r6 r6Var = new r6(context, true, true, true);
        this.f49874r = r6Var;
        r6Var.b(0.45f, 240L, js.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        r6Var.setGravity(i10);
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        r6Var.setTextColor(h6.w0(h6.L6, c6Var));
        addView(r6Var, w5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        setBackgroundColor(h6.w0(h6.f20631h5, c6Var));
    }
}
