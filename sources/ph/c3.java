package ph;

import android.content.Context;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.y80;
public final class c3 extends k4 {
    public final y80 f45754r;

    public c3(Context context, c6 c6Var) {
        super(context, c6Var);
        int i10;
        y80 y80Var = new y80(context, c6Var);
        this.f45754r = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(g6.v0(g6.f23450z6, c6Var));
        y80Var.setLinkTextColor(g6.v0(g6.L6, c6Var));
        y80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(y80Var, f6.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
