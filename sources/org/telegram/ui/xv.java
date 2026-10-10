package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xv implements ValueAnimator.AnimatorUpdateListener {
    public final int f44197a;
    public final ty f44198b;
    public final float f44199c;

    public xv(ty tyVar, float f7, int i10) {
        this.f44197a = i10;
        this.f44198b = tyVar;
        this.f44199c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44197a) {
            case 0:
                ty.V(this.f44198b, this.f44199c, valueAnimator);
                return;
            default:
                ty.B0(this.f44198b, this.f44199c, valueAnimator);
                return;
        }
    }
}
