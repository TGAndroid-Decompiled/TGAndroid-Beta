package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class x40 extends AnimatorListenerAdapter {
    public final int f39823a;
    public final d60 f39824b;

    public x40(d60 d60Var, int i10) {
        this.f39823a = i10;
        this.f39824b = d60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f39823a) {
            case 0:
                d60 d60Var = this.f39824b;
                d60Var.V.setVisibility(4);
                d60Var.W.setVisibility(4);
                d60Var.U.setVisibility(4);
                return;
            case 1:
                this.f39824b.f32963h0 = null;
                return;
            default:
                d60 d60Var2 = this.f39824b;
                d60Var2.f32964h1 = null;
                Paint paint = d60Var2.f32960g1;
                if (d60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                d60Var2.f32956f1.invalidate();
                return;
        }
    }
}
