package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ei0;
public final class m extends h51 {
    public static final int f41789a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        ei0 ei0Var = (ei0) view;
        ei0Var.a((TLObject) i51Var.G, true, i51Var.f24913z);
        ei0Var.setOnClickListener(i51Var.D);
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.B == i51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        ei0 ei0Var = new ei0(context);
        ei0Var.setBackground(i6.K0(false));
        return ei0Var;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.B == i51Var2.B) {
            return true;
        }
        return false;
    }
}
