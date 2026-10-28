package sh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.sh0;
public final class m extends t61 {
    public static final int f48694a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        sh0 sh0Var = (sh0) view;
        sh0Var.a((TLObject) u61Var.G, true, u61Var.f33262z);
        sh0Var.setOnClickListener(u61Var.D);
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        sh0 sh0Var = new sh0(context);
        sh0Var.setBackground(y6.M0(false));
        return sh0Var;
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.B == u61Var2.B) {
            return true;
        }
        return false;
    }
}
