package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final i91 f43339a;

    public z81(i91 i91Var) {
        this.f43339a = i91Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        i91 i91Var = this.f43339a;
        i91Var.S = i10;
        i91Var.f37268c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f11426b, 0, i91Var.S + i91Var.T);
        return r0.l1.f44710b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(i91.U(this.f43339a, (org.telegram.ui.Components.h51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        i91.f0(this.f43339a, (org.telegram.ui.Components.h51) obj);
    }
}
