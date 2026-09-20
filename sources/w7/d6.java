package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k90;
public abstract class d6 {
    public static k90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        k90 k90Var = new k90(context, null);
        k90Var.setTextSize(1, f7);
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (z10) {
            k90Var.setTypeface(AndroidUtilities.bold());
        }
        return k90Var;
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
