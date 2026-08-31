package qh;

import android.animation.ValueAnimator;
public final class e9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45268a;
    public final ca f45269b;

    public e9(ca caVar, int i10) {
        this.f45268a = i10;
        this.f45269b = caVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45268a) {
            case 0:
                this.f45269b.Z0.m();
                return;
            default:
                this.f45269b.n0();
                return;
        }
    }
}
