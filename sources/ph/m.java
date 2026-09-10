package ph;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.fi0;
public final class m extends u51 {
    public static final int f40436a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        fi0 fi0Var = (fi0) view;
        fi0Var.a((TLObject) v51Var.G, true, v51Var.f27842z);
        fi0Var.setOnClickListener(v51Var.D);
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.B == v51Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        fi0 fi0Var = new fi0(context);
        fi0Var.setBackground(j6.K0(false));
        return fi0Var;
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.B == v51Var2.B) {
            return true;
        }
        return false;
    }
}
