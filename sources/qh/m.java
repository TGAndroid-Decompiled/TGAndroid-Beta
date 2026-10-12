package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.hi0;
public final class m extends t61 {
    public static final int f46652a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        hi0 hi0Var = (hi0) view;
        hi0Var.a((TLObject) u61Var.G, true, u61Var.f31084z);
        hi0Var.setOnClickListener(u61Var.D);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        hi0 hi0Var = new hi0(context);
        hi0Var.setBackground(h6.L0(false));
        return hi0Var;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }
}
