package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class i3 extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(String str) {
        m61 J = m61.J(i3.class);
        J.f26946l = str;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((j3) view).set(m61Var.f26946l);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new j3(context, c6Var);
    }
}
