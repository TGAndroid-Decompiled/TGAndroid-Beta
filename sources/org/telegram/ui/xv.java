package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40050a;
    public final ty f40051b;
    public final float f40052c;

    public xv(ty tyVar, float f7, int i10) {
        this.f40050a = i10;
        this.f40051b = tyVar;
        this.f40052c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40050a) {
            case 0:
                ty.V(this.f40051b, this.f40052c, valueAnimator);
                return;
            default:
                ty.F0(this.f40051b, this.f40052c, valueAnimator);
                return;
        }
    }
}
