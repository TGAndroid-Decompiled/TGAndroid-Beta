package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class z40 extends AnimatorListenerAdapter {
    public final int f39958a;
    public final f60 f39959b;

    public z40(f60 f60Var, int i10) {
        this.f39958a = i10;
        this.f39959b = f60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f39958a) {
            case 0:
                f60 f60Var = this.f39959b;
                f60Var.V.setVisibility(4);
                f60Var.W.setVisibility(4);
                f60Var.U.setVisibility(4);
                return;
            case 1:
                this.f39959b.f33128h0 = null;
                return;
            default:
                f60 f60Var2 = this.f39959b;
                f60Var2.f33129h1 = null;
                Paint paint = f60Var2.f33125g1;
                if (f60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                f60Var2.f33121f1.invalidate();
                return;
        }
    }
}
