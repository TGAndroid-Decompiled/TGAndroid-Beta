package org.telegram.ui;

import android.animation.ValueAnimator;
public final class uv implements ValueAnimator.AnimatorUpdateListener {
    public final int f42049a;
    public final py f42050b;
    public final float f42051c;

    public uv(py pyVar, float f10, int i10) {
        this.f42049a = i10;
        this.f42050b = pyVar;
        this.f42051c = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42049a) {
            case 0:
                py.V(this.f42050b, this.f42051c, valueAnimator);
                return;
            default:
                py.E0(this.f42050b, this.f42051c, valueAnimator);
                return;
        }
    }
}
