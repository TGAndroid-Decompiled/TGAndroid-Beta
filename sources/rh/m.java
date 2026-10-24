package rh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.sh0;
public final class m extends k61 {
    public static final int f46207a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        sh0 sh0Var = (sh0) view;
        sh0Var.a((TLObject) l61Var.G, true, l61Var.f28240z);
        sh0Var.setOnClickListener(l61Var.D);
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.B == l61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        sh0 sh0Var = new sh0(context);
        sh0Var.setBackground(k6.M0(false));
        return sh0Var;
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.B == l61Var2.B) {
            return true;
        }
        return false;
    }
}
