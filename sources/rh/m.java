package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.ph0;
public final class m extends f61 {
    public static final int f45775a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        ph0 ph0Var = (ph0) view;
        ph0Var.a((TLObject) g61Var.G, true, g61Var.f26510z);
        ph0Var.setOnClickListener(g61Var.D);
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        ph0 ph0Var = new ph0(context);
        ph0Var.setBackground(h6.L0(false));
        return ph0Var;
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.B == g61Var2.B) {
            return true;
        }
        return false;
    }
}
