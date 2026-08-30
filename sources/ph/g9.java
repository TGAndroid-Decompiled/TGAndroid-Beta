package ph;

import android.animation.ValueAnimator;
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41697a;
    public final da f41698b;

    public g9(da daVar, int i10) {
        this.f41697a = i10;
        this.f41698b = daVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41697a) {
            case 0:
                this.f41698b.Z0.m();
                return;
            default:
                this.f41698b.n0();
                return;
        }
    }
}
