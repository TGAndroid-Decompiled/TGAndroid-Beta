package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45950a;
    public final k f45951b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f45950a = i10;
        this.f45951b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45950a) {
            case 0:
                this.f45951b.Q();
                return;
            default:
                this.f45951b.M();
                return;
        }
    }
}
