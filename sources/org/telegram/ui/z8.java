package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
public final class z8 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final o9 f46195a;

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return this.f46195a.onInsetsInternal(view, k1Var);
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o9.W(this.f46195a, (org.telegram.ui.Components.t61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        Object obj6 = ((org.telegram.ui.Components.t61) obj).G;
        if (obj6 instanceof k9) {
            this.f46195a.b0(((k9) obj6).f40833c, (j9) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
