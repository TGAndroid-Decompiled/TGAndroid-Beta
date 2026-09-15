package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
public abstract class b6 {
    public static c90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.gc;
        c90 c90Var = new c90(context, null);
        c90Var.setTextSize(1, f7);
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        if (z10) {
            c90Var.setTypeface(AndroidUtilities.bold());
        }
        return c90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView g10 = org.telegram.messenger.w1.g(context, 1, f7);
        g10.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var));
        if (z10) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
