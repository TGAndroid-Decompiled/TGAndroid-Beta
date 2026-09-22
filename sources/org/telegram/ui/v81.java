package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class v81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final f91 f38422a;

    public v81(f91 f91Var) {
        this.f38422a = f91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        f91 f91Var = this.f38422a;
        f91Var.S = i10;
        f91Var.f33546c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10591b, 0, f91Var.S + f91Var.T);
        return r0.l1.f41850b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(f91.U(this.f38422a, (org.telegram.ui.Components.i51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f91.f0(this.f38422a, (org.telegram.ui.Components.i51) obj);
    }
}
