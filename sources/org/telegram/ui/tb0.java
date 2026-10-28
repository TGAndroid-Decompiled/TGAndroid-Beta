package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class tb0 extends AnimatorListenerAdapter {
    public final int f43591a;
    public final float f43592b;
    public final ub0 f43593c;

    public tb0(ub0 ub0Var, float f7, int i10) {
        this.f43591a = i10;
        this.f43593c = ub0Var;
        this.f43592b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43591a) {
            case 0:
                ub0 ub0Var = this.f43593c;
                TextView textView = ub0Var.f43964f;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23749y6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23541n6, false);
                float f7 = this.f43592b;
                ub0Var.f43967s = f7;
                textView.setTextColor(i0.a.f(f7, x02, x03));
                return;
            default:
                ub0 ub0Var2 = this.f43593c;
                TextView textView2 = ub0Var2.d;
                int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23749y6, false);
                int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23541n6, false);
                float f10 = this.f43592b;
                ub0Var2.f43968w = f10;
                textView2.setTextColor(i0.a.f(f10, x04, x05));
                return;
        }
    }
}
