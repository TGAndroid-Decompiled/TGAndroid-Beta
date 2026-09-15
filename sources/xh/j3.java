package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class j3 extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(String str) {
        i51 J = i51.J(j3.class);
        J.f24894l = str;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        ((k3) view).set(i51Var.f24894l);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new k3(context, e6Var);
    }
}
