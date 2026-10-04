package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ci0;
public final class m extends f61 {
    public static final int f45489a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ci0 ci0Var = (ci0) view;
        ci0Var.a((TLObject) g61Var.G, true, g61Var.f26682z);
        ci0Var.setOnClickListener(g61Var.D);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B) {
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
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B) {
            return true;
        }
        return false;
    }
}
