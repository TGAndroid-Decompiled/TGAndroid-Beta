package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class v90 extends AnimatorListenerAdapter {
    public final int f50608a;
    public final float f50609b;
    public final w90 f50610c;

    public v90(w90 w90Var, float f10, int i7) {
        this.f50608a = i7;
        this.f50610c = w90Var;
        this.f50609b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50608a) {
            case 0:
                w90 w90Var = this.f50610c;
                TextView textView = w90Var.f50992f;
                int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false);
                int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false);
                float f10 = this.f50609b;
                w90Var.f50995s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                w90 w90Var2 = this.f50610c;
                TextView textView2 = w90Var2.d;
                int x04 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false);
                int x05 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28047n6, false);
                float f11 = this.f50609b;
                w90Var2.f50997x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
