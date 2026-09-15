package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final e91 f37892a;

    public u81(e91 e91Var) {
        this.f37892a = e91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        e91 e91Var = this.f37892a;
        e91Var.S = i10;
        e91Var.f33285c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10589b, 0, e91Var.S + e91Var.T);
        return r0.l1.f41854b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(e91.U(this.f37892a, (org.telegram.ui.Components.i51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        e91.f0(this.f37892a, (org.telegram.ui.Components.i51) obj);
    }
}
