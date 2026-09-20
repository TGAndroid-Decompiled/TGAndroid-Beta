package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class k3 extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(String str) {
        w51 J = w51.J(k3.class);
        J.f29948l = str;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        ((l3) view).set(w51Var.f29948l);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new l3(context, f6Var);
    }
}
