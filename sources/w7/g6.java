package w7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.ui.Components.p80;
public abstract class g6 {
    public static p80 a(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        int i11 = org.telegram.ui.ActionBar.t6.Uc;
        p80 p80Var = new p80(context, null);
        p80Var.setTextSize(1, f7);
        org.telegram.ui.ActionBar.a7.V(p80Var, i10, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, i11, p6Var);
        if (z10) {
            p80Var.setTypeface(org.telegram.messenger.i0.o());
        }
        return p80Var;
    }

    public static TextView b(Context context, float f7, int i10, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f7);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        if (z10) {
            textView.setTypeface(org.telegram.messenger.i0.o());
        }
        return textView;
    }
}
