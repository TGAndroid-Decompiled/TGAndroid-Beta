package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class t90 extends AnimatorListenerAdapter {
    public final int f49981a;
    public final float f49982b;
    public final u90 f49983c;

    public t90(u90 u90Var, float f10, int i7) {
        this.f49981a = i7;
        this.f49983c = u90Var;
        this.f49982b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49981a) {
            case 0:
                u90 u90Var = this.f49983c;
                TextView textView = u90Var.f50265f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28244y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28034n6, false);
                float f10 = this.f49982b;
                u90Var.f50268s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                u90 u90Var2 = this.f49983c;
                TextView textView2 = u90Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28244y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28034n6, false);
                float f11 = this.f49982b;
                u90Var2.f50270x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
