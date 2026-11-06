package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class t90 extends AnimatorListenerAdapter {
    public final int f49964a;
    public final float f49965b;
    public final u90 f49966c;

    public t90(u90 u90Var, float f10, int i7) {
        this.f49964a = i7;
        this.f49966c = u90Var;
        this.f49965b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49964a) {
            case 0:
                u90 u90Var = this.f49966c;
                TextView textView = u90Var.f50331f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false);
                float f10 = this.f49965b;
                u90Var.f50334s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                u90 u90Var2 = this.f49966c;
                TextView textView2 = u90Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28240y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28030n6, false);
                float f11 = this.f49965b;
                u90Var2.f50336x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
