package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yl0;
public final class q2 extends w51 {
    public static final int f46428a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        Typeface typeface;
        p90 p90Var = (p90) view;
        p90Var.setGravity(x51Var.f30315z);
        p90Var.setTextColor((int) x51Var.B);
        p90Var.setTextSize(1, x51Var.A);
        if (x51Var.f30307q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        p90Var.setTypeface(typeface);
        int i10 = x51Var.f30299i;
        p90Var.setPadding(i10, 0, i10, x51Var.f30301k);
        p90Var.setText(x51Var.f30302l);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, e6 e6Var) {
        return new xb(context, 5, null);
    }
}
