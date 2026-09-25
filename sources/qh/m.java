package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.yh0;
public final class m extends u51 {
    public static final int f42079a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        yh0 yh0Var = (yh0) view;
        yh0Var.a((TLObject) v51Var.G, true, v51Var.f29062z);
        yh0Var.setOnClickListener(v51Var.D);
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.B == v51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        yh0 yh0Var = new yh0(context);
        yh0Var.setBackground(h6.K0(false));
        return yh0Var;
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.B == v51Var2.B) {
            return true;
        }
        return false;
    }
}
