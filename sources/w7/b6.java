package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fa0;
public abstract class b6 {
    public static fa0 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        fa0 fa0Var = new fa0(context, null);
        fa0Var.setTextSize(1, f7);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        if (z10) {
            fa0Var.setTypeface(AndroidUtilities.bold());
        }
        return fa0Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        TextView f10 = org.telegram.messenger.q.f(context, 1, f7);
        f10.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        if (z10) {
            f10.setTypeface(AndroidUtilities.bold());
        }
        return f10;
    }
}
