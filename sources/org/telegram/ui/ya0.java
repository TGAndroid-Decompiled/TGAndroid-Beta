package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class ya0 extends AnimatorListenerAdapter {
    public final int f43769a;
    public final float f43770b;
    public final za0 f43771c;

    public ya0(za0 za0Var, float f7, int i10) {
        this.f43769a = i10;
        this.f43771c = za0Var;
        this.f43770b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43769a) {
            case 0:
                za0 za0Var = this.f43771c;
                TextView textView = za0Var.f44062f;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false);
                float f7 = this.f43770b;
                za0Var.f44065s = f7;
                textView.setTextColor(i0.b.f(f7, x02, x03));
                return;
            default:
                za0 za0Var2 = this.f43771c;
                TextView textView2 = za0Var2.d;
                int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false);
                int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21115n6, false);
                float f10 = this.f43770b;
                za0Var2.f44067x = f10;
                textView2.setTextColor(i0.b.f(f10, x04, x05));
                return;
        }
    }
}
