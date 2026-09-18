package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l90;
public abstract class c6 {
    public static l90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        l90 l90Var = new l90(context, null);
        l90Var.setTextSize(1, f7);
        l90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        l90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        if (z10) {
            l90Var.setTypeface(AndroidUtilities.bold());
        }
        return l90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        TextView g10 = org.telegram.messenger.q.g(context, 1, f7);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        if (z10) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
