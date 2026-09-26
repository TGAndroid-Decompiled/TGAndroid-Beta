package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o90;
public abstract class c6 {
    public static o90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        o90 o90Var = new o90(context, null);
        o90Var.setTextSize(1, f7);
        o90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (z10) {
            o90Var.setTypeface(AndroidUtilities.bold());
        }
        return o90Var;
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
