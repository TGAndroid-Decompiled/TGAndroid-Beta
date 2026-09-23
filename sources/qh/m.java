package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.zh0;
public final class m extends g51 {
    public static final int f41745a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        zh0 zh0Var = (zh0) view;
        zh0Var.a((TLObject) h51Var.G, true, h51Var.f24520z);
        zh0Var.setOnClickListener(h51Var.D);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        zh0 zh0Var = new zh0(context);
        zh0Var.setBackground(h6.K0(false));
        return zh0Var;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }
}
