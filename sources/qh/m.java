package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.fi0;
public final class m extends w51 {
    public static final int f42047a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        fi0 fi0Var = (fi0) view;
        fi0Var.a((TLObject) x51Var.G, true, x51Var.f30261z);
        fi0Var.setOnClickListener(x51Var.D);
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (x51Var.B == x51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        fi0 fi0Var = new fi0(context);
        fi0Var.setBackground(j6.K0(false));
        return fi0Var;
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.B == x51Var2.B) {
            return true;
        }
        return false;
    }
}
