package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.gi0;
public final class m extends v51 {
    public static final int f42092a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        gi0 gi0Var = (gi0) view;
        gi0Var.a((TLObject) w51Var.G, true, w51Var.f29961z);
        gi0Var.setOnClickListener(w51Var.D);
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.B == w51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        gi0 gi0Var = new gi0(context);
        gi0Var.setBackground(j6.K0(false));
        return gi0Var;
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.B == w51Var2.B) {
            return true;
        }
        return false;
    }
}
