package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.gi0;
public final class m extends x51 {
    public static final int f42113a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        gi0 gi0Var = (gi0) view;
        gi0Var.a((TLObject) y51Var.G, true, y51Var.f30531z);
        gi0Var.setOnClickListener(y51Var.D);
    }

    @Override
    public final boolean contentsEquals(y51 y51Var, y51 y51Var2) {
        if (y51Var.B == y51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        gi0 gi0Var = new gi0(context);
        gi0Var.setBackground(j6.K0(false));
        return gi0Var;
    }

    @Override
    public final boolean equals(y51 y51Var, y51 y51Var2) {
        if (y51Var.B == y51Var2.B) {
            return true;
        }
        return false;
    }
}
