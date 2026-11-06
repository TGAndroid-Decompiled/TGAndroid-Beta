package vh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class f extends q31 {
    public static final int f57394b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ah.c cVar = (ah.c) view;
        cVar.f1062w = (TLRPC.TL_help_country) r31Var.G;
        cVar.f();
        cVar.setDivider(z9);
        cVar.c(r31Var.f37592e, false);
    }

    @Override
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.I(r31Var2);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        ah.c cVar = new ah.c(context, f6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.J(r31Var2);
    }
}
