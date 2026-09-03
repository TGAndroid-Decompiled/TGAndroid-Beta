package sh;

import android.content.Context;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.g90;
public final class c3 extends m4 {
    public final g90 f47413r;

    public c3(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        g90 g90Var = new g90(context, g6Var);
        this.f47413r = g90Var;
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(k6.f22055z6, g6Var));
        g90Var.setLinkTextColor(k6.v0(k6.L6, g6Var));
        g90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(g90Var, c6.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
