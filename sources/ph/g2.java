package ph;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class g2 extends a51 {
    public static final int f45077b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        p6 p6Var;
        p80 p80Var = (p80) view;
        p80Var.setGravity(b51Var.f24656z);
        Object obj = b51Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = b51Var.G;
            if (obj2 instanceof p6) {
                p6Var = (p6) obj2;
            } else {
                p6Var = null;
            }
            a7.V(p80Var, intValue, p6Var);
        } else {
            z6 z6Var = a7.f20158a;
            p80Var.setTag(2131296709, null);
            p80Var.setTextColor((int) b51Var.B);
        }
        p80Var.setTextSize(1, b51Var.A);
        if (b51Var.f24648q) {
            typeface = org.telegram.messenger.i0.o();
        }
        p80Var.setTypeface(typeface);
        int i10 = b51Var.f24640i;
        p80Var.setPadding(i10, 0, i10, b51Var.f24642k);
        p80Var.setText(b51Var.f24643l);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new kg.t1(7, context, null);
    }
}
