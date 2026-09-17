package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zv implements ValueAnimator.AnimatorUpdateListener {
    public final int f40344a;
    public final wy f40345b;
    public final float f40346c;

    public zv(wy wyVar, float f7, int i10) {
        this.f40344a = i10;
        this.f40345b = wyVar;
        this.f40346c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f40344a) {
            case 0:
                wy.V(this.f40345b, this.f40346c, valueAnimator);
                return;
            default:
                wy.E0(this.f40345b, this.f40346c, valueAnimator);
                return;
        }
    }
}
