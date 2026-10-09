package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final i91 f44514a;

    public z81(i91 i91Var) {
        this.f44514a = i91Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        i91 i91Var = this.f44514a;
        i91Var.S = i10;
        i91Var.f38582c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f11577b, 0, i91Var.S + i91Var.T);
        return r0.k1.f46774b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(i91.U(this.f44514a, (org.telegram.ui.Components.p61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        i91.f0(this.f44514a, (org.telegram.ui.Components.p61) obj);
    }
}
