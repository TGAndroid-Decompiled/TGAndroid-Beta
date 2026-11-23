package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class w90 extends AnimatorListenerAdapter {
    public final int f52999a;
    public final float f53000b;
    public final x90 f53001c;

    public w90(x90 x90Var, float f10, int i7) {
        this.f52999a = i7;
        this.f53001c = x90Var;
        this.f53000b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52999a) {
            case 0:
                x90 x90Var = this.f53001c;
                TextView textView = x90Var.f53715f;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29739y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29529n6, false);
                float f10 = this.f53000b;
                x90Var.f53718s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                x90 x90Var2 = this.f53001c;
                TextView textView2 = x90Var2.d;
                int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29739y6, false);
                int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29529n6, false);
                float f11 = this.f53000b;
                x90Var2.f53720x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
