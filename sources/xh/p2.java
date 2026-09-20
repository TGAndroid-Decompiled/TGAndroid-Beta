package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wb;
public final class p2 extends v51 {
    public static final int f46367a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        Typeface typeface;
        k90 k90Var = (k90) view;
        k90Var.setGravity(w51Var.f29961z);
        k90Var.setTextColor((int) w51Var.B);
        k90Var.setTextSize(1, w51Var.A);
        if (w51Var.f29953q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        k90Var.setTypeface(typeface);
        int i10 = w51Var.f29945i;
        k90Var.setPadding(i10, 0, i10, w51Var.f29947k);
        k90Var.setText(w51Var.f29948l);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new wb(context, 5, null);
    }
}
