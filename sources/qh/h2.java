package qh;

import android.animation.ValueAnimator;
public final class h2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45389a;
    public final j2 f45390b;

    public h2(j2 j2Var, int i10) {
        this.f45389a = i10;
        this.f45390b = j2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45389a) {
            case 0:
                this.f45390b.h.invalidate();
                return;
            default:
                this.f45390b.h.invalidate();
                return;
        }
    }
}
