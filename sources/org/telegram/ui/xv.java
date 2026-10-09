package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xv implements ValueAnimator.AnimatorUpdateListener {
    public final int f44153a;
    public final ty f44154b;
    public final float f44155c;

    public xv(ty tyVar, float f7, int i10) {
        this.f44153a = i10;
        this.f44154b = tyVar;
        this.f44155c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44153a) {
            case 0:
                ty.V(this.f44154b, this.f44155c, valueAnimator);
                return;
            default:
                ty.B0(this.f44154b, this.f44155c, valueAnimator);
                return;
        }
    }
}
