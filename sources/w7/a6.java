package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ia0;
public abstract class a6 {
    public static ia0 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.h6.gc;
        ia0 ia0Var = new ia0(context, null);
        ia0Var.setTextSize(1, f7);
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        if (z10) {
            ia0Var.setTypeface(AndroidUtilities.bold());
        }
        return ia0Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        TextView g10 = org.telegram.messenger.v0.g(context, 1, f7);
        g10.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        if (z10) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
