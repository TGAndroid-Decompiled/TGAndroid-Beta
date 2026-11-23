package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.kf0;
public final class j extends m41 {
    public static final int f57580b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        kf0 kf0Var = (kf0) view;
        kf0Var.a((TLObject) n41Var.H, n41Var.A, true);
        kf0Var.setOnClickListener(n41Var.E);
    }

    @Override
    public final boolean c(n41 n41Var, n41 n41Var2) {
        if (n41Var.C == n41Var2.C) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        kf0 kf0Var = new kf0(context);
        kf0Var.setBackground(n6.N0(false));
        return kf0Var;
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.C == n41Var2.C) {
            return true;
        }
        return false;
    }
}
