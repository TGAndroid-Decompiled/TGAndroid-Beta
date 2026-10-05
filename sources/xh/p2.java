package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.zl0;
public final class p2 extends g61 {
    public static final int f50186a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        Typeface typeface;
        q90 q90Var = (q90) view;
        q90Var.setGravity(h61Var.f27106z);
        q90Var.setTextColor((int) h61Var.B);
        q90Var.setTextSize(1, h61Var.A);
        if (h61Var.f27098q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        q90Var.setTypeface(typeface);
        int i10 = h61Var.f27090i;
        q90Var.setPadding(i10, 0, i10, h61Var.f27092k);
        q90Var.setText(h61Var.f27093l);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new yb(context, 5, null);
    }
}
