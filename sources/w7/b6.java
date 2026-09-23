package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d90;
public abstract class b6 {
    public static d90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        d90 d90Var = new d90(context, null);
        d90Var.setTextSize(1, f7);
        d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (z10) {
            d90Var.setTypeface(AndroidUtilities.bold());
        }
        return d90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        TextView g10 = org.telegram.messenger.z0.g(context, 1, f7);
        g10.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        if (z10) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
