package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class t2 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(String str) {
        x31 K = x31.K(t2.class);
        K.f40159l = str;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((u2) view).set(x31Var.f40159l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new u2(context, f6Var);
    }
}
