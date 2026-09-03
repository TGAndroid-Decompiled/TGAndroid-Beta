package org.telegram.ui;

import android.animation.ValueAnimator;
public final class uv implements ValueAnimator.AnimatorUpdateListener {
    public final int f41942a;
    public final py f41943b;
    public final float f41944c;

    public uv(py pyVar, float f10, int i10) {
        this.f41942a = i10;
        this.f41943b = pyVar;
        this.f41944c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41942a) {
            case 0:
                py.V(this.f41943b, this.f41944c, valueAnimator);
                return;
            default:
                py.E0(this.f41943b, this.f41944c, valueAnimator);
                return;
        }
    }
}
