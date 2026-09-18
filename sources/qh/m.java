package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.gi0;
public final class m extends i51 {
    public static final int f41820a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        gi0 gi0Var = (gi0) view;
        gi0Var.a((TLObject) j51Var.G, true, j51Var.f25140z);
        gi0Var.setOnClickListener(j51Var.D);
    }

    @Override
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        gi0 gi0Var = new gi0(context);
        gi0Var.setBackground(j6.K0(false));
        return gi0Var;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        if (j51Var.B == j51Var2.B) {
            return true;
        }
        return false;
    }
}
