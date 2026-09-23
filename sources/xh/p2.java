package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xb;
public final class p2 extends g51 {
    public static final int f46019a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        Typeface typeface;
        d90 d90Var = (d90) view;
        d90Var.setGravity(h51Var.f24520z);
        d90Var.setTextColor((int) h51Var.B);
        d90Var.setTextSize(1, h51Var.A);
        if (h51Var.f24512q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        d90Var.setTypeface(typeface);
        int i10 = h51Var.f24504i;
        d90Var.setPadding(i10, 0, i10, h51Var.f24506k);
        d90Var.setText(h51Var.f24507l);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
