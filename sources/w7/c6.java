package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n90;
public abstract class c6 {
    public static n90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        n90 n90Var = new n90(context, null);
        n90Var.setTextSize(1, f7);
        n90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (z10) {
            n90Var.setTypeface(AndroidUtilities.bold());
        }
        return n90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        TextView f10 = org.telegram.messenger.l0.f(context, 1, f7);
        f10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (z10) {
            f10.setTypeface(AndroidUtilities.bold());
        }
        return f10;
    }
}
