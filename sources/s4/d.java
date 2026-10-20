package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45946a;
    public final k f45947b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f45946a = i10;
        this.f45947b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45946a) {
            case 0:
                this.f45947b.Q();
                return;
            default:
                this.f45947b.M();
                return;
        }
    }
}
