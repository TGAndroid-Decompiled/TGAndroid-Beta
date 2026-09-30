package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.zl0;
public final class p2 extends x51 {
    public static final int f46455a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        Typeface typeface;
        q90 q90Var = (q90) view;
        q90Var.setGravity(y51Var.f30650z);
        q90Var.setTextColor((int) y51Var.B);
        q90Var.setTextSize(1, y51Var.A);
        if (y51Var.f30642q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        q90Var.setTypeface(typeface);
        int i10 = y51Var.f30634i;
        q90Var.setPadding(i10, 0, i10, y51Var.f30636k);
        q90Var.setText(y51Var.f30637l);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new yb(context, 5, null);
    }
}
