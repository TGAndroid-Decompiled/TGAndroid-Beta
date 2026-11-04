package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class s20 extends AnimatorListenerAdapter {
    public final int f49336a;
    public final x30 f49337b;

    public s20(x30 x30Var, int i3) {
        this.f49336a = i3;
        this.f49337b = x30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        switch (this.f49336a) {
            case 0:
                x30 x30Var = this.f49337b;
                x30Var.N1.setVisibility(4);
                x30Var.O1.setVisibility(4);
                x30Var.M1.setVisibility(4);
                return;
            case 1:
                this.f49337b.Z1 = null;
                return;
            default:
                x30 x30Var2 = this.f49337b;
                x30Var2.Z2 = null;
                Paint paint = x30Var2.Y2;
                if (x30Var2.L3 == 3) {
                    i3 = -1163700;
                } else {
                    i3 = -12761513;
                }
                paint.setColor(i3);
                x30Var2.X2.invalidate();
                return;
        }
    }
}
