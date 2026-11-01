package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class xa0 extends AnimatorListenerAdapter {
    public final int f43294a;
    public final float f43295b;
    public final ya0 f43296c;

    public xa0(ya0 ya0Var, float f7, int i10) {
        this.f43294a = i10;
        this.f43296c = ya0Var;
        this.f43295b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43294a) {
            case 0:
                ya0 ya0Var = this.f43296c;
                TextView textView = ya0Var.f43618f;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21116n6, false);
                float f7 = this.f43295b;
                ya0Var.f43621s = f7;
                textView.setTextColor(i0.b.f(f7, x02, x03));
                return;
            default:
                ya0 ya0Var2 = this.f43296c;
                TextView textView2 = ya0Var2.d;
                int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false);
                int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21116n6, false);
                float f10 = this.f43295b;
                ya0Var2.f43623x = f10;
                textView2.setTextColor(i0.b.f(f10, x04, x05));
                return;
        }
    }
}
