package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.w51;
public final class o2 extends h51 {
    public static final int f46053a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        Typeface typeface;
        c90 c90Var = (c90) view;
        c90Var.setGravity(i51Var.f24907z);
        c90Var.setTextColor((int) i51Var.B);
        c90Var.setTextSize(1, i51Var.A);
        if (i51Var.f24899q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        c90Var.setTypeface(typeface);
        int i10 = i51Var.f24891i;
        c90Var.setPadding(i10, 0, i10, i51Var.f24893k);
        c90Var.setText(i51Var.f24894l);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new vb(context, 5, null);
    }
}
