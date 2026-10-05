package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class r extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(String str, CharSequence charSequence, int i10) {
        h61 K = h61.K(r.class);
        K.f17193b = false;
        K.f27106z = i10;
        K.f27093l = str;
        K.f27094m = charSequence;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((s) view).a(h61Var.f27093l, h61Var.f27094m, h61Var.f27106z);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new s(context, 0, d6Var);
    }
}
