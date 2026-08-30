package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class g extends h51 {
    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, int i11, int i12, CharSequence charSequence, String str) {
        i51 J = i51.J(g.class);
        J.d = i10;
        J.f25578z = i11;
        J.f25564k = i12;
        J.f25565l = charSequence;
        J.f25566m = str;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((h) view).a(i51Var.f25578z, i51Var.f25564k, i51Var.f25565l, i51Var.f25566m);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new h(context, f6Var);
    }
}
