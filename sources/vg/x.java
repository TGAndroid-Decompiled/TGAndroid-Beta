package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import w7.x5;
public final class x extends l4 {
    public final n6 f44365r;

    public x(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        n6 n6Var = new n6(context, true, true, true);
        this.f44365r = n6Var;
        n6Var.b(0.45f, 240L, qr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        n6Var.setGravity(i10);
        n6Var.setTextSize(AndroidUtilities.dp(15.0f));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setTextColor(i6.v0(i6.L6, e6Var));
        addView(n6Var, x5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(i6.v0(i6.f18907h5, e6Var));
    }
}
