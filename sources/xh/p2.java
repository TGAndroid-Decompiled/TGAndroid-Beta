package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xb;
public final class p2 extends w51 {
    public static final int f46320a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        Typeface typeface;
        l90 l90Var = (l90) view;
        l90Var.setGravity(x51Var.f30261z);
        l90Var.setTextColor((int) x51Var.B);
        l90Var.setTextSize(1, x51Var.A);
        if (x51Var.f30253q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        l90Var.setTypeface(typeface);
        int i10 = x51Var.f30245i;
        l90Var.setPadding(i10, 0, i10, x51Var.f30247k);
        l90Var.setText(x51Var.f30248l);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        return new xb(context, 5, null);
    }
}
