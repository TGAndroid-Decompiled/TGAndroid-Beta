package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.wr;
import w7.a6;
public final class x extends m4 {
    public final o6 f42733r;

    public x(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        o6 o6Var = new o6(context, true, true, true);
        this.f42733r = o6Var;
        o6Var.b(0.45f, 240L, wr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        o6Var.setGravity(i10);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(j6.v0(j6.L6, f6Var));
        addView(o6Var, a6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
    }
}
