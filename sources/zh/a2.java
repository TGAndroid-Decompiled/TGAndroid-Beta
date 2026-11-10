package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
public final class a2 extends w31 {
    public static final int f60211b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        h6 h6Var;
        w70 w70Var = (w70) view;
        w70Var.setGravity(x31Var.f40169z);
        Object obj = x31Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = x31Var.G;
            if (obj2 instanceof h6) {
                h6Var = (h6) obj2;
            } else {
                h6Var = null;
            }
            t6.U(w70Var, intValue, h6Var);
        } else {
            s6 s6Var = t6.f28530a;
            w70Var.setTag(2131296709, null);
            w70Var.setTextColor((int) x31Var.B);
        }
        w70Var.setTextSize(1, x31Var.A);
        if (x31Var.f40161q) {
            typeface = org.telegram.messenger.g0.o();
        }
        w70Var.setTypeface(typeface);
        int i7 = x31Var.f40153i;
        w70Var.setPadding(i7, 0, i7, x31Var.f40155k);
        w70Var.setText(x31Var.f40156l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new ib(7, context, null);
    }
}
