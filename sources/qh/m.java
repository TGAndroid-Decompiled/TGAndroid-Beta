package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ci0;
public final class m extends g61 {
    public static final int f45503a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ci0 ci0Var = (ci0) view;
        ci0Var.a((TLObject) h61Var.G, true, h61Var.f27106z);
        ci0Var.setOnClickListener(h61Var.D);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        ci0 ci0Var = new ci0(context);
        ci0Var.setBackground(i6.K0(false));
        return ci0Var;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }
}
