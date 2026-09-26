package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xb;
public final class p2 extends u51 {
    public static final int f46347a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        Typeface typeface;
        n90 n90Var = (n90) view;
        n90Var.setGravity(v51Var.f29061z);
        n90Var.setTextColor((int) v51Var.B);
        n90Var.setTextSize(1, v51Var.A);
        if (v51Var.f29053q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        n90Var.setTypeface(typeface);
        int i10 = v51Var.f29045i;
        n90Var.setPadding(i10, 0, i10, v51Var.f29047k);
        n90Var.setText(v51Var.f29048l);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
