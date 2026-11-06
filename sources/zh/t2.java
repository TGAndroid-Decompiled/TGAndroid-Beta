package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class t2 extends q31 {
    static {
        q31.h(new q31());
    }

    public static r31 i(String str) {
        r31 K = r31.K(t2.class);
        K.f37598l = str;
        return K;
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((u2) view).set(r31Var.f37598l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new u2(context, f6Var);
    }
}
