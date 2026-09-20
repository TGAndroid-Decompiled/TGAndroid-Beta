package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class e extends v51 {
    public static final int f43556a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        xg.b bVar = (xg.b) view;
        bVar.f46052s = (TLRPC.TL_help_country) w51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(w51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        return w51Var.H(w51Var2);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        xg.b bVar = new xg.b(context, f6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        return w51Var.I(w51Var2);
    }
}
