package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class r2 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(String str) {
        x31 K = x31.K(r2.class);
        K.f40180l = str;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        ((s2) view).set(x31Var.f40180l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new s2(context, f6Var);
    }
}
