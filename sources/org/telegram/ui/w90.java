package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class w90 extends AnimatorListenerAdapter {
    public final int f50950a;
    public final float f50951b;
    public final x90 f50952c;

    public w90(x90 x90Var, float f10, int i7) {
        this.f50950a = i7;
        this.f50952c = x90Var;
        this.f50951b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50950a) {
            case 0:
                x90 x90Var = this.f50952c;
                TextView textView = x90Var.f51647f;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                float f10 = this.f50951b;
                x90Var.f51650s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                x90 x90Var2 = this.f50952c;
                TextView textView2 = x90Var2.d;
                int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                float f11 = this.f50951b;
                x90Var2.f51652x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
