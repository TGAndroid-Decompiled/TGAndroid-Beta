package wh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class i3 extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(String str) {
        v51 J = v51.J(i3.class);
        J.f27829l = str;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        ((j3) view).set(v51Var.f27829l);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new j3(context, f6Var);
    }
}
