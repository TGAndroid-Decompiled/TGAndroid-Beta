package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.zr;
import w7.z5;
public final class x extends l4 {
    public final o6 f49459r;

    public x(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        o6 o6Var = new o6(context, true, true, true);
        this.f49459r = o6Var;
        o6Var.b(0.45f, 240L, zr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        o6Var.setGravity(i10);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        r6.a0(o6Var, k6.L6, g6Var);
        addView(o6Var, z5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        r6.i(k6.f21255h5, this, g6Var);
    }
}
