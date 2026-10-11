package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.zb;
public final class p2 extends q61 {
    public static final int f51542a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        Typeface typeface;
        fa0 fa0Var = (fa0) view;
        fa0Var.setGravity(r61Var.f30374z);
        fa0Var.setTextColor((int) r61Var.B);
        fa0Var.setTextSize(1, r61Var.A);
        if (r61Var.f30366q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        fa0Var.setTypeface(typeface);
        int i10 = r61Var.f30358i;
        fa0Var.setPadding(i10, 0, i10, r61Var.f30360k);
        fa0Var.setText(r61Var.f30361l);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new zb(context, 5, null);
    }
}
