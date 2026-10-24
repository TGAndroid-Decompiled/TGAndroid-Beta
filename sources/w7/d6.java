package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w90;
public abstract class d6 {
    public static w90 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11 = org.telegram.ui.ActionBar.k6.f21243gc;
        w90 w90Var = new w90(context, null);
        w90Var.setTextSize(1, f7);
        org.telegram.ui.ActionBar.r6.W(w90Var, i10, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var, i11, g6Var);
        if (z10) {
            w90Var.setTypeface(AndroidUtilities.bold());
        }
        return w90Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f7);
        org.telegram.ui.ActionBar.r6.W(textView, i10, g6Var);
        if (z10) {
            textView.setTypeface(AndroidUtilities.bold());
        }
        return textView;
    }
}
