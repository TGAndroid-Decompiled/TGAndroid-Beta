package xh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xl0;
public final class p2 extends v51 {
    public static final int f46346a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        Typeface typeface;
        o90 o90Var = (o90) view;
        o90Var.setGravity(w51Var.f29908z);
        o90Var.setTextColor((int) w51Var.B);
        o90Var.setTextSize(1, w51Var.A);
        if (w51Var.f29900q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        o90Var.setTypeface(typeface);
        int i10 = w51Var.f29892i;
        o90Var.setPadding(i10, 0, i10, w51Var.f29894k);
        o90Var.setText(w51Var.f29895l);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
