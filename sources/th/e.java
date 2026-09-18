package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class e extends w51 {
    public static final int f43512a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        xg.b bVar = (xg.b) view;
        bVar.f46005s = (TLRPC.TL_help_country) x51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(x51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        return x51Var.H(x51Var2);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, e6 e6Var) {
        xg.b bVar = new xg.b(context, e6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        return x51Var.I(x51Var2);
    }
}
