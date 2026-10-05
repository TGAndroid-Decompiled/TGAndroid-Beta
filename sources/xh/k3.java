package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class k3 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(String str) {
        h61 K = h61.K(k3.class);
        K.f27093l = str;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((l3) view).set(h61Var.f27093l);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new l3(context, d6Var);
    }
}
