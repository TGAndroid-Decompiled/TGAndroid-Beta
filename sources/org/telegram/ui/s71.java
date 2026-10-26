package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class s71 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final d81 f43379a;

    public s71(d81 d81Var) {
        this.f43379a = d81Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        d81 d81Var = this.f43379a;
        d81Var.f38763c0 = i10;
        int i11 = defaultWindowInsets.f13451b;
        if (d81Var.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = d81Var.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                d81Var.P.setLayoutParams(layoutParams);
            }
        }
        oi.a.d(d81Var.f38762c, i11, defaultWindowInsets.d, AndroidUtilities.dp(12.0f), d81Var.f38764d0);
        return r0.k1.f47117b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(d81.V(this.f43379a, (org.telegram.ui.Components.t61) obj, (View) obj2));
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        d81.f0(this.f43379a, (org.telegram.ui.Components.t61) obj);
    }
}
