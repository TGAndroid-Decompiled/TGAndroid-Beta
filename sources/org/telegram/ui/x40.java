package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class x40 extends AnimatorListenerAdapter {
    public final int f39825a;
    public final d60 f39826b;

    public x40(d60 d60Var, int i10) {
        this.f39825a = i10;
        this.f39826b = d60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f39825a) {
            case 0:
                d60 d60Var = this.f39826b;
                d60Var.V.setVisibility(4);
                d60Var.W.setVisibility(4);
                d60Var.U.setVisibility(4);
                return;
            case 1:
                this.f39826b.f32965h0 = null;
                return;
            default:
                d60 d60Var2 = this.f39826b;
                d60Var2.f32966h1 = null;
                Paint paint = d60Var2.f32962g1;
                if (d60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                d60Var2.f32958f1.invalidate();
                return;
        }
    }
}
