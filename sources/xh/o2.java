package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zb;
public final class o2 extends t61 {
    public static final int f51673a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        Typeface typeface;
        ia0 ia0Var = (ia0) view;
        ia0Var.setGravity(u61Var.f31084z);
        ia0Var.setTextColor((int) u61Var.B);
        ia0Var.setTextSize(1, u61Var.A);
        if (u61Var.f31076q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        ia0Var.setTypeface(typeface);
        int i10 = u61Var.f31068i;
        ia0Var.setPadding(i10, 0, i10, u61Var.f31070k);
        ia0Var.setText(u61Var.f31071l);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new zb(context, 5, null);
    }
}
