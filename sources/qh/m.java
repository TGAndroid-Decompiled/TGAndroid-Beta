package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.fi0;
public final class m extends p61 {
    public static final int f46816a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        fi0 fi0Var = (fi0) view;
        fi0Var.a((TLObject) q61Var.G, true, q61Var.f30180z);
        fi0Var.setOnClickListener(q61Var.D);
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.B == q61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, d6 d6Var) {
        fi0 fi0Var = new fi0(context);
        fi0Var.setBackground(h6.L0(false));
        return fi0Var;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.B == q61Var2.B) {
            return true;
        }
        return false;
    }
}
