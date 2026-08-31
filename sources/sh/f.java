package sh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class f extends i51 {
    static {
        i51.setup(new i51());
    }

    public static j51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        j51 J = j51.J(f.class);
        J.d = i10;
        J.f28027z = i11;
        J.f28013k = i12;
        J.f28014l = charSequence;
        J.f28015m = str;
        return J;
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        ((g) view).a(j51Var.f28027z, j51Var.f28013k, j51Var.f28014l, j51Var.f28015m);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new g(context, g6Var);
    }
}
