package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.yh0;
public final class m extends w51 {
    public static final int f42080a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        yh0 yh0Var = (yh0) view;
        yh0Var.a((TLObject) x51Var.G, true, x51Var.f30291z);
        yh0Var.setOnClickListener(x51Var.D);
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (x51Var.B == x51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        yh0 yh0Var = new yh0(context);
        yh0Var.setBackground(h6.K0(false));
        return yh0Var;
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.B == x51Var2.B) {
            return true;
        }
        return false;
    }
}
