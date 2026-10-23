package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.ph0;
public final class m extends g61 {
    public static final int f45787a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        ph0 ph0Var = (ph0) view;
        ph0Var.a((TLObject) h61Var.G, true, h61Var.f26799z);
        ph0Var.setOnClickListener(h61Var.D);
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        ph0 ph0Var = new ph0(context);
        ph0Var.setBackground(h6.L0(false));
        return ph0Var;
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.B == h61Var2.B) {
            return true;
        }
        return false;
    }
}
