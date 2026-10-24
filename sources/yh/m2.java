package yh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.w90;
public final class m2 extends k61 {
    public static final int f50862a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        g6 g6Var;
        w90 w90Var = (w90) view;
        w90Var.setGravity(l61Var.f28240z);
        Object obj = l61Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = l61Var.G;
            if (obj2 instanceof g6) {
                g6Var = (g6) obj2;
            } else {
                g6Var = null;
            }
            r6.W(w90Var, intValue, g6Var);
        } else {
            r6.r(w90Var);
            w90Var.setTextColor((int) l61Var.B);
        }
        w90Var.setTextSize(1, l61Var.A);
        if (l61Var.f28232q) {
            typeface = AndroidUtilities.bold();
        }
        w90Var.setTypeface(typeface);
        int i10 = l61Var.f28224i;
        w90Var.setPadding(i10, 0, i10, l61Var.f28226k);
        w90Var.setText(l61Var.f28227l);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new vb(context, 5, null);
    }
}
