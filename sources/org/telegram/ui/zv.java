package org.telegram.ui;

import android.animation.ValueAnimator;
public final class zv implements ValueAnimator.AnimatorUpdateListener {
    public final int f44927a;
    public final vy f44928b;
    public final float f44929c;

    public zv(vy vyVar, float f7, int i10) {
        this.f44927a = i10;
        this.f44928b = vyVar;
        this.f44929c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44927a) {
            case 0:
                vy.V(this.f44928b, this.f44929c, valueAnimator);
                return;
            default:
                vy.B0(this.f44928b, this.f44929c, valueAnimator);
                return;
        }
    }
}
