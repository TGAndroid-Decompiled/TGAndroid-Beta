package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
public final class b2 extends w31 {
    public static final int f60122b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        f6 f6Var;
        w70 w70Var = (w70) view;
        w70Var.setGravity(x31Var.f40172z);
        Object obj = x31Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = x31Var.G;
            if (obj2 instanceof f6) {
                f6Var = (f6) obj2;
            } else {
                f6Var = null;
            }
            r6.V(w70Var, intValue, f6Var);
        } else {
            q6 q6Var = r6.f28475a;
            w70Var.setTag(2131296709, null);
            w70Var.setTextColor((int) x31Var.B);
        }
        w70Var.setTextSize(1, x31Var.A);
        if (x31Var.f40164q) {
            typeface = org.telegram.messenger.g0.o();
        }
        w70Var.setTypeface(typeface);
        int i7 = x31Var.f40156i;
        w70Var.setPadding(i7, 0, i7, x31Var.f40158k);
        w70Var.setText(x31Var.f40159l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new jb(7, context, null);
    }
}
