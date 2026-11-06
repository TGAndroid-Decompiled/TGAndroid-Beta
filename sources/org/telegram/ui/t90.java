package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class t90 extends AnimatorListenerAdapter {
    public final int f49991a;
    public final float f49992b;
    public final u90 f49993c;

    public t90(u90 u90Var, float f10, int i7) {
        this.f49991a = i7;
        this.f49993c = u90Var;
        this.f49992b = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49991a) {
            case 0:
                u90 u90Var = this.f49993c;
                TextView textView = u90Var.f50352f;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28241y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28031n6, false);
                float f10 = this.f49992b;
                u90Var.f50355s = f10;
                textView.setTextColor(i0.a.f(f10, x02, x03));
                return;
            default:
                u90 u90Var2 = this.f49993c;
                TextView textView2 = u90Var2.d;
                int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28241y6, false);
                int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28031n6, false);
                float f11 = this.f49992b;
                u90Var2.f50357x = f11;
                textView2.setTextColor(i0.a.f(f11, x04, x05));
                return;
        }
    }
}
