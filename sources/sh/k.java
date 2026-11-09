package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.kf0;
public final class k extends x31 {
    public static final int f55333b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        kf0 kf0Var = (kf0) view;
        kf0Var.a((TLObject) y31Var.G, y31Var.f40581z, true);
        kf0Var.setOnClickListener(y31Var.D);
    }

    @Override
    public final boolean c(y31 y31Var, y31 y31Var2) {
        if (y31Var.B == y31Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        kf0 kf0Var = new kf0(context);
        kf0Var.setBackground(l6.N0(false));
        return kf0Var;
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var.B == y31Var2.B) {
            return true;
        }
        return false;
    }
}
