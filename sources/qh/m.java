package qh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.gi0;
public final class m extends o61 {
    public static final int f46707a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        gi0 gi0Var = (gi0) view;
        gi0Var.a((TLObject) p61Var.G, true, p61Var.f29747z);
        gi0Var.setOnClickListener(p61Var.D);
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (p61Var.B == p61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        gi0 gi0Var = new gi0(context);
        gi0Var.setBackground(i6.L0(false));
        return gi0Var;
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.B == p61Var2.B) {
            return true;
        }
        return false;
    }
}
