package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q6;
import w7.x5;
public final class x extends l4 {
    public final q6 f48599r;

    public x(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        q6 q6Var = new q6(context, true, true, true);
        this.f48599r = q6Var;
        q6Var.b(0.45f, 240L, pr.h);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        q6Var.setGravity(i10);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setTextColor(j6.v0(j6.L6, f6Var));
        addView(q6Var, x5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.f20761h5, f6Var));
    }
}
