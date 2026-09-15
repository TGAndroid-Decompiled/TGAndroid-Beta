package org.telegram.ui;

import android.animation.ValueAnimator;
public final class xv implements ValueAnimator.AnimatorUpdateListener {
    public final int f39682a;
    public final uy f39683b;
    public final float f39684c;

    public xv(uy uyVar, float f7, int i10) {
        this.f39682a = i10;
        this.f39683b = uyVar;
        this.f39684c = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f39682a) {
            case 0:
                uy.V(this.f39683b, this.f39684c, valueAnimator);
                return;
            default:
                uy.E0(this.f39683b, this.f39684c, valueAnimator);
                return;
        }
    }
}
