package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xb;
public final class n2 extends t61 {
    public static final int f53220a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        u6 u6Var;
        aa0 aa0Var = (aa0) view;
        aa0Var.setGravity(u61Var.f33262z);
        Object obj = u61Var.H;
        Typeface typeface = null;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            Object obj2 = u61Var.G;
            if (obj2 instanceof u6) {
                u6Var = (u6) obj2;
            } else {
                u6Var = null;
            }
            f7.V(aa0Var, intValue, u6Var);
        } else {
            f7.r(aa0Var);
            aa0Var.setTextColor((int) u61Var.B);
        }
        aa0Var.setTextSize(1, u61Var.A);
        if (u61Var.f33254q) {
            typeface = AndroidUtilities.bold();
        }
        aa0Var.setTypeface(typeface);
        int i10 = u61Var.f33246i;
        aa0Var.setPadding(i10, 0, i10, u61Var.f33248k);
        aa0Var.setText(u61Var.f33249l);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new xb(context, 5, null);
    }
}
