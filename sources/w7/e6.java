package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m90;
public abstract class e6 {
    public static m90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        m90 m90Var = new m90(context, null);
        m90Var.setTextSize(1, f7);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (z10) {
            m90Var.setTypeface(AndroidUtilities.bold());
        }
        return m90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        TextView g10 = org.telegram.messenger.a2.g(context, 1, f7);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (z10) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
