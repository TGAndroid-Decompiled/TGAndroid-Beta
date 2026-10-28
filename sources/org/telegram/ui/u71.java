package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class u71 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final f81 f43899a;

    public u71(f81 f81Var) {
        this.f43899a = f81Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        f81 f81Var = this.f43899a;
        f81Var.f39261c0 = i10;
        int i11 = defaultWindowInsets.f13450b;
        if (f81Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = f81Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                f81Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.d(f81Var.f39260c, i11, defaultWindowInsets.d, AndroidUtilities.dp(12.0f), f81Var.f39262d0);
        return r0.k1.f47152b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(f81.V(this.f43899a, (org.telegram.ui.Components.u61) obj, (View) obj2));
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        f81.f0(this.f43899a, (org.telegram.ui.Components.u61) obj);
    }
}
