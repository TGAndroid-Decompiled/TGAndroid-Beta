package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xv implements ValueAnimator.AnimatorUpdateListener {
    public final int f44151a;
    public final ty f44152b;
    public final float f44153c;

    public xv(ty tyVar, float f7, int i10) {
        this.f44151a = i10;
        this.f44152b = tyVar;
        this.f44153c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44151a) {
            case 0:
                ty.V(this.f44152b, this.f44153c, valueAnimator);
                return;
            default:
                ty.B0(this.f44152b, this.f44153c, valueAnimator);
                return;
        }
    }
}
