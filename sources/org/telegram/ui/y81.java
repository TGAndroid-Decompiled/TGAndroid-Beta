package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final h91 f44286a;

    public y81(h91 h91Var) {
        this.f44286a = h91Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        h91 h91Var = this.f44286a;
        h91Var.S = i10;
        h91Var.f38353c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f11576b, 0, h91Var.S + h91Var.T);
        return r0.k1.f46866b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(h91.U(this.f44286a, (org.telegram.ui.Components.r61) obj, (View) obj2));
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h91.f0(this.f44286a, (org.telegram.ui.Components.r61) obj);
    }
}
