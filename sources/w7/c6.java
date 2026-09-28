package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p90;
public abstract class c6 {
    public static p90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        p90 p90Var = new p90(context, null);
        p90Var.setTextSize(1, f7);
        p90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (z10) {
            p90Var.setTypeface(AndroidUtilities.bold());
        }
        return p90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        TextView f10 = org.telegram.messenger.f0.f(context, 1, f7);
        f10.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        if (z10) {
            f10.setTypeface(AndroidUtilities.bold());
        }
        return f10;
    }
}
