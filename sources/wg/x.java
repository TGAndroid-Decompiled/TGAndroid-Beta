package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.q6;
import w7.z5;
public final class x extends l4 {
    public final q6 f49460r;

    public x(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        q6 q6Var = new q6(context, true, true, true);
        this.f49460r = q6Var;
        q6Var.b(0.45f, 240L, bs.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        q6Var.setGravity(i10);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        r6.a0(q6Var, k6.L6, g6Var);
        addView(q6Var, z5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        r6.i(k6.f21254h5, this, g6Var);
    }
}
