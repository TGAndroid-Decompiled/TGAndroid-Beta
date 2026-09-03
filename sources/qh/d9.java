package qh;

import android.animation.ValueAnimator;
public final class d9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45248a;
    public final ba f45249b;

    public d9(ba baVar, int i10) {
        this.f45248a = i10;
        this.f45249b = baVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45248a) {
            case 0:
                this.f45249b.Z0.m();
                return;
            default:
                this.f45249b.n0();
                return;
        }
    }
}
