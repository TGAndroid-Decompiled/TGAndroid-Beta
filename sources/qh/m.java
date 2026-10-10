package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.gi0;
public final class m extends p61 {
    public static final int f46751a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        gi0 gi0Var = (gi0) view;
        gi0Var.a((TLObject) q61Var.G, true, q61Var.f30076z);
        gi0Var.setOnClickListener(q61Var.D);
    }

    @Override
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.B == q61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        gi0 gi0Var = new gi0(context);
        gi0Var.setBackground(i6.L0(false));
        return gi0Var;
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.B == q61Var2.B) {
            return true;
        }
        return false;
    }
}
