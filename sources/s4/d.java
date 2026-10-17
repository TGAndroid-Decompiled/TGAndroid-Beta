package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f45967a;
    public final k f45968b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f45967a = i10;
        this.f45968b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45967a) {
            case 0:
                this.f45968b.Q();
                return;
            default:
                this.f45968b.M();
                return;
        }
    }
}
