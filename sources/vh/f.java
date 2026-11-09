package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class f extends x31 {
    public static final int f57523b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ah.c cVar = (ah.c) view;
        cVar.f1062w = (TLRPC.TL_help_country) y31Var.G;
        cVar.f();
        cVar.setDivider(z9);
        cVar.c(y31Var.f40562e, false);
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        return y31Var.I(y31Var2);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        ah.c cVar = new ah.c(context, g6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        return y31Var.J(y31Var2);
    }
}
