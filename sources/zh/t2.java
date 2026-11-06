package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class t2 extends v31 {
    static {
        v31.h(new v31());
    }

    public static w31 i(String str) {
        w31 K = w31.K(t2.class);
        K.f39830l = str;
        return K;
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        ((u2) view).set(w31Var.f39830l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new u2(context, f6Var);
    }
}
