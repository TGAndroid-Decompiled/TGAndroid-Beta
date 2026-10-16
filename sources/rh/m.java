package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.ji0;
public final class m extends l61 {
    public static final int f44452a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ji0 ji0Var = (ji0) view;
        ji0Var.a((TLObject) m61Var.G, true, m61Var.f26959z);
        ji0Var.setOnClickListener(m61Var.D);
    }

    @Override
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.B == m61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        ji0 ji0Var = new ji0(context);
        ji0Var.setBackground(g6.L0(false));
        return ji0Var;
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.B == m61Var2.B) {
            return true;
        }
        return false;
    }
}
