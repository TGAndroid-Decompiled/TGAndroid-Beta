package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class r extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(String str, CharSequence charSequence, int i10) {
        l61 J = l61.J(r.class);
        J.f43204b = false;
        J.f26967z = i10;
        J.f26954l = str;
        J.f26955m = charSequence;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((s) view).a(l61Var.f26954l, l61Var.f26955m, l61Var.f26967z);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new s(context, 0, c6Var);
    }
}
