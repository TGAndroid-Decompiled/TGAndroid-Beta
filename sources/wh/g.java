package wh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class g extends q31 {
    public static final int f57768b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        bh.c cVar = (bh.c) view;
        cVar.f3304w = (TLRPC.TL_help_country) r31Var.G;
        cVar.f();
        cVar.setDivider(z10);
        cVar.c(r31Var.f37621e, false);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.I(r31Var2);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        bh.c cVar = new bh.c(context, e6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.J(r31Var2);
    }
}
