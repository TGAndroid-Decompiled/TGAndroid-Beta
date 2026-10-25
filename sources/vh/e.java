package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class e extends s61 {
    public static final int f50308a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        zg.b bVar = (zg.b) view;
        bVar.v = (TLRPC.TL_help_country) t61Var.G;
        bVar.f();
        bVar.setDivider(z10);
        bVar.c(t61Var.e, false);
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        return t61Var.I(t61Var2);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        zg.b bVar = new zg.b(context, u6Var);
        bVar.setBackground(null);
        return bVar;
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        return t61Var.J(t61Var2);
    }
}
