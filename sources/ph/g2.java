package ph;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class g2 extends z41 {
    public static final int f45066b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        p6 p6Var;
        p80 p80Var = (p80) view;
        p80Var.setGravity(a51Var.f24305z);
        Object obj = a51Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = a51Var.G;
            if (obj2 instanceof p6) {
                p6Var = (p6) obj2;
            } else {
                p6Var = null;
            }
            a7.V(p80Var, intValue, p6Var);
        } else {
            z6 z6Var = a7.f20157a;
            p80Var.setTag(2131296709, null);
            p80Var.setTextColor((int) a51Var.B);
        }
        p80Var.setTextSize(1, a51Var.A);
        if (a51Var.f24297q) {
            typeface = org.telegram.messenger.i0.o();
        }
        p80Var.setTypeface(typeface);
        int i10 = a51Var.f24289i;
        p80Var.setPadding(i10, 0, i10, a51Var.f24291k);
        p80Var.setText(a51Var.f24292l);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new kg.t1(7, context, null);
    }
}
