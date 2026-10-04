package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yb;
import org.telegram.ui.Components.zl0;
public final class p2 extends f61 {
    public static final int f50170a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        Typeface typeface;
        q90 q90Var = (q90) view;
        q90Var.setGravity(g61Var.f26681z);
        q90Var.setTextColor((int) g61Var.B);
        q90Var.setTextSize(1, g61Var.A);
        if (g61Var.f26673q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        q90Var.setTypeface(typeface);
        int i10 = g61Var.f26665i;
        q90Var.setPadding(i10, 0, i10, g61Var.f26667k);
        q90Var.setText(g61Var.f26668l);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new yb(context, 5, null);
    }
}
