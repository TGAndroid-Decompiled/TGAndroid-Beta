package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.s6;
import w7.z5;
public final class x extends m4 {
    public final s6 f47621r;

    public x(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        s6 s6Var = new s6(context, true, true, true);
        this.f47621r = s6Var;
        s6Var.b(0.45f, 240L, es.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        s6Var.setGravity(i10);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setTextColor(g6.w0(g6.L6, c6Var));
        addView(s6Var, z5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        setBackgroundColor(g6.w0(g6.f19672h5, c6Var));
    }
}
