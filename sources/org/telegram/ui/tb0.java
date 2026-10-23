package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class tb0 extends AnimatorListenerAdapter {
    public final int f41942a;
    public final float f41943b;
    public final ub0 f41944c;

    public tb0(ub0 ub0Var, float f7, int i10) {
        this.f41942a = i10;
        this.f41944c = ub0Var;
        this.f41943b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41942a) {
            case 0:
                ub0 ub0Var = this.f41944c;
                TextView textView = ub0Var.f42361f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21571y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21366n6, false);
                float f7 = this.f41943b;
                ub0Var.f42364s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                return;
            default:
                ub0 ub0Var2 = this.f41944c;
                TextView textView2 = ub0Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21571y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21366n6, false);
                float f10 = this.f41943b;
                ub0Var2.f42365w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                return;
        }
    }
}
