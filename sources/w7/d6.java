package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q90;
public abstract class d6 {
    public static q90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.gc;
        q90 q90Var = new q90(context, null);
        q90Var.setTextSize(1, f7);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        if (z10) {
            q90Var.setTypeface(AndroidUtilities.bold());
        }
        return q90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        TextView f10 = org.telegram.messenger.q.f(context, 1, f7);
        f10.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        if (z10) {
            f10.setTypeface(AndroidUtilities.bold());
        }
        return f10;
    }
}
