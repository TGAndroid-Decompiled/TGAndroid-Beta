package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.w70;
public final class b2 extends v31 {
    public static final int f60123b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        f6 f6Var;
        w70 w70Var = (w70) view;
        w70Var.setGravity(w31Var.f39843z);
        Object obj = w31Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = w31Var.G;
            if (obj2 instanceof f6) {
                f6Var = (f6) obj2;
            } else {
                f6Var = null;
            }
            r6.V(w70Var, intValue, f6Var);
        } else {
            q6 q6Var = r6.f28474a;
            w70Var.setTag(2131296709, null);
            w70Var.setTextColor((int) w31Var.B);
        }
        w70Var.setTextSize(1, w31Var.A);
        if (w31Var.f39835q) {
            typeface = org.telegram.messenger.g0.o();
        }
        w70Var.setTypeface(typeface);
        int i7 = w31Var.f39827i;
        w70Var.setPadding(i7, 0, i7, w31Var.f39829k);
        w70Var.setText(w31Var.f39830l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new jb(7, context, null);
    }
}
