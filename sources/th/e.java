package th;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class e extends v51 {
    public static final int f43540a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        xg.b bVar = (xg.b) view;
        bVar.f46031s = (TLRPC.TL_help_country) w51Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(w51Var.e, false);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        return w51Var.H(w51Var2);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        xg.b bVar = new xg.b(context, d6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        return w51Var.I(w51Var2);
    }
}
