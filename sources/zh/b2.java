package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.w70;
public final class b2 extends q31 {
    public static final int f60098b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        f6 f6Var;
        w70 w70Var = (w70) view;
        w70Var.setGravity(r31Var.f37611z);
        Object obj = r31Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = r31Var.G;
            if (obj2 instanceof f6) {
                f6Var = (f6) obj2;
            } else {
                f6Var = null;
            }
            r6.V(w70Var, intValue, f6Var);
        } else {
            q6 q6Var = r6.f28474a;
            w70Var.setTag(2131296709, null);
            w70Var.setTextColor((int) r31Var.B);
        }
        w70Var.setTextSize(1, r31Var.A);
        if (r31Var.f37603q) {
            typeface = org.telegram.messenger.g0.o();
        }
        w70Var.setTypeface(typeface);
        int i7 = r31Var.f37595i;
        w70Var.setPadding(i7, 0, i7, r31Var.f37597k);
        w70Var.setText(r31Var.f37598l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new jb(7, context, null);
    }
}
