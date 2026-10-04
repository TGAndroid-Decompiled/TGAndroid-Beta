package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class x8 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final m9 f42774a;

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.f42774a.onInsetsInternal(view, l1Var);
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m9.U(this.f42774a, (org.telegram.ui.Components.g61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.g61) obj).G;
        if (obj6 instanceof i9) {
            this.f42774a.Z(((i9) obj6).f37322c, (h9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
