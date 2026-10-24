package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r71 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final b81 f41050a;

    public r71(b81 b81Var) {
        this.f41050a = b81Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        b81 b81Var = this.f41050a;
        b81Var.T = i10;
        b81Var.f35956c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f12316b, 0, b81Var.T + b81Var.U);
        return r0.k1.f45249b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(b81.U(this.f41050a, (org.telegram.ui.Components.l61) obj, (View) obj2));
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        b81.f0(this.f41050a, (org.telegram.ui.Components.l61) obj);
    }
}
