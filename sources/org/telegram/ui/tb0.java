package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class tb0 extends AnimatorListenerAdapter {
    public final int f41984a;
    public final float f41985b;
    public final ub0 f41986c;

    public tb0(ub0 ub0Var, float f7, int i10) {
        this.f41984a = i10;
        this.f41986c = ub0Var;
        this.f41985b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41984a) {
            case 0:
                ub0 ub0Var = this.f41986c;
                TextView textView = ub0Var.f42373f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21572y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21367n6, false);
                float f7 = this.f41985b;
                ub0Var.f42376s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                return;
            default:
                ub0 ub0Var2 = this.f41986c;
                TextView textView2 = ub0Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21572y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21367n6, false);
                float f10 = this.f41985b;
                ub0Var2.f42377w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                return;
        }
    }
}
