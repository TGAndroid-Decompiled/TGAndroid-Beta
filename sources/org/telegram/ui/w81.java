package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class w81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final g91 f38604a;

    public w81(g91 g91Var) {
        this.f38604a = g91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        g91 g91Var = this.f38604a;
        g91Var.S = i10;
        g91Var.f33925c.setPadding(0, AndroidUtilities.dp(12.0f) + defaultWindowInsets.f10592b, 0, g91Var.S + g91Var.T);
        return r0.l1.f41881b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(g91.U(this.f38604a, (org.telegram.ui.Components.j51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        g91.f0(this.f38604a, (org.telegram.ui.Components.j51) obj);
    }
}
