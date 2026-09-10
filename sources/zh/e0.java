package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class e0 extends u51 {
    public static final int f48360a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((f0) view).set((k0) v51Var.G);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        f0 f0Var = new f0(i10, context, false);
        f0Var.setLayoutParams(new s4.p0(-2, -2));
        return f0Var;
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.G == v51Var2.G) {
            return true;
        }
        return false;
    }
}
