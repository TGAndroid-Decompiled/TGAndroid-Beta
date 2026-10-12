package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.ki0;
public final class n extends k61 {
    public static final int f44695a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ki0 ki0Var = (ki0) view;
        ki0Var.a((TLObject) l61Var.G, true, l61Var.f26967z);
        ki0Var.setOnClickListener(l61Var.D);
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.B == l61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        ki0 ki0Var = new ki0(context);
        ki0Var.setBackground(g6.L0(false));
        return ki0Var;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.B == l61Var2.B) {
            return true;
        }
        return false;
    }
}
