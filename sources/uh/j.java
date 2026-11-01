package uh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class j extends a51 {
    public static final int f50269b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        k kVar = (k) view;
        n10 n10Var = (n10) b51Var.G;
        kVar.f50270a.setText(n10Var.f17247b);
        kVar.f50271b.setText(n10Var.f17248c);
        if (kVar.f50272c != z10) {
            kVar.invalidate();
        }
        kVar.f50272c = z10;
        kVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new k(context);
    }
}
