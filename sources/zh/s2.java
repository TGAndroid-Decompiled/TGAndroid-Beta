package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class s2 extends w31 {
    static {
        w31.h(new w31());
    }

    public static x31 i(String str) {
        x31 K = x31.K(s2.class);
        K.f40156l = str;
        return K;
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((t2) view).set(x31Var.f40156l);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new t2(context, h6Var);
    }
}
