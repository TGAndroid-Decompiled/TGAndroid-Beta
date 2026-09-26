package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.yh0;
public final class m extends v51 {
    public static final int f42077a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        yh0 yh0Var = (yh0) view;
        yh0Var.a((TLObject) w51Var.G, true, w51Var.f29908z);
        yh0Var.setOnClickListener(w51Var.D);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.B == w51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        yh0 yh0Var = new yh0(context);
        yh0Var.setBackground(h6.K0(false));
        return yh0Var;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.B == w51Var2.B) {
            return true;
        }
        return false;
    }
}
