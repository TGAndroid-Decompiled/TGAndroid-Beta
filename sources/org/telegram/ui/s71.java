package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s71 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final c81 f41318a;

    public s71(c81 c81Var) {
        this.f41318a = c81Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        c81 c81Var = this.f41318a;
        c81Var.T = i10;
        c81Var.f36294c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f12316b, 0, c81Var.T + c81Var.U);
        return r0.k1.f45250b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(c81.U(this.f41318a, (org.telegram.ui.Components.m61) obj, (View) obj2));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        c81.f0(this.f41318a, (org.telegram.ui.Components.m61) obj);
    }
}
