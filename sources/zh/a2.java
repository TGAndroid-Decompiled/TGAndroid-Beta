package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;
public final class a2 extends x31 {
    public static final int f60213b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        g6 g6Var;
        x70 x70Var = (x70) view;
        x70Var.setGravity(y31Var.f40581z);
        Object obj = y31Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = y31Var.G;
            if (obj2 instanceof g6) {
                g6Var = (g6) obj2;
            } else {
                g6Var = null;
            }
            s6.U(x70Var, intValue, g6Var);
        } else {
            r6 r6Var = s6.f28500a;
            x70Var.setTag(2131296709, null);
            x70Var.setTextColor((int) y31Var.B);
        }
        x70Var.setTextSize(1, y31Var.A);
        if (y31Var.f40573q) {
            typeface = org.telegram.messenger.g0.o();
        }
        x70Var.setTypeface(typeface);
        int i7 = y31Var.f40565i;
        x70Var.setPadding(i7, 0, i7, y31Var.f40567k);
        x70Var.setText(y31Var.f40568l);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new jb(7, context, null);
    }
}
