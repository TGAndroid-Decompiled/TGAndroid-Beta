package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.qh0;
public final class m extends e61 {
    public static final int f45773a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        qh0 qh0Var = (qh0) view;
        qh0Var.a((TLObject) f61Var.G, true, f61Var.f26153z);
        qh0Var.setOnClickListener(f61Var.D);
    }

    @Override
    public final boolean contentsEquals(f61 f61Var, f61 f61Var2) {
        if (f61Var.B == f61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        qh0 qh0Var = new qh0(context);
        qh0Var.setBackground(h6.L0(false));
        return qh0Var;
    }

    @Override
    public final boolean equals(f61 f61Var, f61 f61Var2) {
        if (f61Var.B == f61Var2.B) {
            return true;
        }
        return false;
    }
}
