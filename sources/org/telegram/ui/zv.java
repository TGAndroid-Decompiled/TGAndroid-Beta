package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zv implements ValueAnimator.AnimatorUpdateListener {
    public final int f44922a;
    public final vy f44923b;
    public final float f44924c;

    public zv(vy vyVar, float f7, int i10) {
        this.f44922a = i10;
        this.f44923b = vyVar;
        this.f44924c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44922a) {
            case 0:
                vy.V(this.f44923b, this.f44924c, valueAnimator);
                return;
            default:
                vy.B0(this.f44923b, this.f44924c, valueAnimator);
                return;
        }
    }
}
