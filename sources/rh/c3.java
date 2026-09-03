package rh;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.f90;
public final class c3 extends l4 {
    public final f90 f43545r;

    public c3(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        f90 f90Var = new f90(context, f6Var);
        this.f43545r = f90Var;
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTextColor(j6.v0(j6.f20273z6, f6Var));
        f90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        f90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        addView(f90Var, b6.d(-2, -2.0f, i10 | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
