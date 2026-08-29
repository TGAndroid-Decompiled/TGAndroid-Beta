package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s71 implements Utilities.Callback5, Utilities.Callback5Return, r0.o {
    public final b81 f42304a;

    public s71(b81 b81Var) {
        this.f42304a = b81Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.d;
        b81 b81Var = this.f42304a;
        b81Var.O = i10;
        b81Var.f36719c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f8187b, 0, b81Var.O + b81Var.P);
        return r0.m1.f46842b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(b81.U(this.f42304a, (org.telegram.ui.Components.w41) obj, (View) obj2));
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        b81.e0(this.f42304a, (org.telegram.ui.Components.w41) obj);
    }
}
