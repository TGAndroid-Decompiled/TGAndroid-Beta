package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class f extends w31 {
    public static final int f57511b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ah.c cVar = (ah.c) view;
        cVar.f1062w = (TLRPC.TL_help_country) x31Var.G;
        cVar.f();
        cVar.setDivider(z9);
        cVar.c(x31Var.f40174e, false);
    }

    @Override
    public final boolean c(x31 x31Var, x31 x31Var2) {
        return x31Var.I(x31Var2);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        ah.c cVar = new ah.c(context, f6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(x31 x31Var, x31 x31Var2) {
        return x31Var.J(x31Var2);
    }
}
