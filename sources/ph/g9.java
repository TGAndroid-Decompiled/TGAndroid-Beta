package ph;

import android.animation.ValueAnimator;
public final class g9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f41727a;
    public final da f41728b;

    public g9(da daVar, int i10) {
        this.f41727a = i10;
        this.f41728b = daVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f41727a) {
            case 0:
                this.f41728b.Z0.m();
                return;
            default:
                this.f41728b.n0();
                return;
        }
    }
}
