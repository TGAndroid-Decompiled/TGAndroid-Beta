package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class rb0 extends AnimatorListenerAdapter {
    public final int f42026a;
    public final float f42027b;
    public final sb0 f42028c;

    public rb0(sb0 sb0Var, float f9, int i10) {
        this.f42026a = i10;
        this.f42028c = sb0Var;
        this.f42027b = f9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42026a) {
            case 0:
                sb0 sb0Var = this.f42028c;
                TextView textView = sb0Var.f42345f;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false);
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false);
                float f9 = this.f42027b;
                sb0Var.f42348s = f9;
                textView.setTextColor(i0.a.d(f9, w02, w03));
                return;
            default:
                sb0 sb0Var2 = this.f42028c;
                TextView textView2 = sb0Var2.d;
                int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false);
                int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23241n6, false);
                float f10 = this.f42027b;
                sb0Var2.f42349w = f10;
                textView2.setTextColor(i0.a.d(f10, w04, w05));
                return;
        }
    }
}
