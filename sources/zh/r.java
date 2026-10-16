package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class r extends l61 {
    static {
        l61.setup(new l61());
    }

    public static m61 a(String str, CharSequence charSequence, int i10) {
        m61 J = m61.J(r.class);
        J.f42905b = false;
        J.f26959z = i10;
        J.f26946l = str;
        J.f26947m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        ((s) view).a(m61Var.f26946l, m61Var.f26947m, m61Var.f26959z);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new s(context, 0, c6Var);
    }
}
