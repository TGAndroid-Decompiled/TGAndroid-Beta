package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class w90 extends AnimatorListenerAdapter {
    public final int f53036a;
    public final float f53037b;
    public final x90 f53038c;

    public w90(x90 x90Var, float f10, int i7) {
        this.f53036a = i7;
        this.f53038c = x90Var;
        this.f53037b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53036a) {
            case 0:
                x90 x90Var = this.f53038c;
                TextView textView = x90Var.f53795f;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false);
                float f10 = this.f53037b;
                x90Var.f53798s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                x90 x90Var2 = this.f53038c;
                TextView textView2 = x90Var2.d;
                int x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false);
                int x05 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29563n6, false);
                float f11 = this.f53037b;
                x90Var2.f53800x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
