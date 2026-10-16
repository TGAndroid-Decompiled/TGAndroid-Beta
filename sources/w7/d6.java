package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.da0;
public abstract class d6 {
    public static da0 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.g6.f19660gc;
        da0 da0Var = new da0(context, null);
        da0Var.setTextSize(1, f7);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        if (z10) {
            da0Var.setTypeface(AndroidUtilities.bold());
        }
        return da0Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        TextView f10 = org.telegram.messenger.g0.f(context, 1, f7);
        f10.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        if (z10) {
            f10.setTypeface(AndroidUtilities.bold());
        }
        return f10;
    }
}
