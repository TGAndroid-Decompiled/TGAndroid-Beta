package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45949a;
    public final k f45950b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f45949a = i10;
        this.f45950b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45949a) {
            case 0:
                this.f45950b.Q();
                return;
            default:
                this.f45950b.M();
                return;
        }
    }
}
