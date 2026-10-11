package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.fi0;
public final class m extends q61 {
    public static final int f46782a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        fi0 fi0Var = (fi0) view;
        fi0Var.a((TLObject) r61Var.G, true, r61Var.f30374z);
        fi0Var.setOnClickListener(r61Var.D);
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (r61Var.B == r61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        fi0 fi0Var = new fi0(context);
        fi0Var.setBackground(h6.L0(false));
        return fi0Var;
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.B == r61Var2.B) {
            return true;
        }
        return false;
    }
}
