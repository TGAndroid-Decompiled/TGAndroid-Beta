package wh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wb;
public final class n2 extends u51 {
    public static final int f44266a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        Typeface typeface;
        m90 m90Var = (m90) view;
        m90Var.setGravity(v51Var.f27842z);
        m90Var.setTextColor((int) v51Var.B);
        m90Var.setTextSize(1, v51Var.A);
        if (v51Var.f27834q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        m90Var.setTypeface(typeface);
        int i10 = v51Var.f27826i;
        m90Var.setPadding(i10, 0, i10, v51Var.f27828k);
        m90Var.setText(v51Var.f27829l);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new wb(context, 5, null);
    }
}
