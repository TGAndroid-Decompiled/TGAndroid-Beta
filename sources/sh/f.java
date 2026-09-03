package sh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class f extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        h51 J = h51.J(f.class);
        J.d = i10;
        J.f27388z = i11;
        J.f27374k = i12;
        J.f27375l = charSequence;
        J.f27376m = str;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        ((g) view).a(h51Var.f27388z, h51Var.f27374k, h51Var.f27375l, h51Var.f27376m);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new g(context, g6Var);
    }
}
