package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class i3 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(String str) {
        l61 J = l61.J(i3.class);
        J.f26954l = str;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((j3) view).set(l61Var.f26954l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new j3(context, c6Var);
    }
}
