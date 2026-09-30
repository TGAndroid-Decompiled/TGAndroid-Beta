package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.yh0;
public final class m extends x51 {
    public static final int f42183a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        yh0 yh0Var = (yh0) view;
        yh0Var.a((TLObject) y51Var.G, true, y51Var.f30650z);
        yh0Var.setOnClickListener(y51Var.D);
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.B == y51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        yh0 yh0Var = new yh0(context);
        yh0Var.setBackground(h6.K0(false));
        return yh0Var;
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.B == y51Var2.B) {
            return true;
        }
        return false;
    }
}
