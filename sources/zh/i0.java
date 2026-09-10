package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class i0 extends u51 {
    public static final int f48486a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((j0) view).set((l0) v51Var.G);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j0(context);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.G == v51Var2.G) {
            return true;
        }
        return false;
    }
}
