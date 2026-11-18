package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class w90 extends AnimatorListenerAdapter {
    public final int f52986a;
    public final float f52987b;
    public final x90 f52988c;

    public w90(x90 x90Var, float f10, int i7) {
        this.f52986a = i7;
        this.f52988c = x90Var;
        this.f52987b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52986a) {
            case 0:
                x90 x90Var = this.f52988c;
                TextView textView = x90Var.f53748f;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false);
                float f10 = this.f52987b;
                x90Var.f53751s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                x90 x90Var2 = this.f52988c;
                TextView textView2 = x90Var2.d;
                int x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29786y6, false);
                int x05 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29576n6, false);
                float f11 = this.f52987b;
                x90Var2.f53753x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
