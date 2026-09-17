package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.x51;
public final class o2 extends i51 {
    public static final int f46076a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        Typeface typeface;
        c90 c90Var = (c90) view;
        c90Var.setGravity(j51Var.f25137z);
        c90Var.setTextColor((int) j51Var.B);
        c90Var.setTextSize(1, j51Var.A);
        if (j51Var.f25129q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        c90Var.setTypeface(typeface);
        int i10 = j51Var.f25121i;
        c90Var.setPadding(i10, 0, i10, j51Var.f25123k);
        c90Var.setText(j51Var.f25124l);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new vb(context, 5, null);
    }
}
