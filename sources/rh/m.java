package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.fi0;
public final class m extends g51 {
    public static final int f45675a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        fi0 fi0Var = (fi0) view;
        fi0Var.a((TLObject) h51Var.G, true, h51Var.f26634z);
        fi0Var.setOnClickListener(h51Var.D);
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        fi0 fi0Var = new fi0(context);
        fi0Var.setBackground(j6.K0(false));
        return fi0Var;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.B == h51Var2.B) {
            return true;
        }
        return false;
    }
}
