package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f46372a;
    public final k f46373b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f46372a = i10;
        this.f46373b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46372a) {
            case 0:
                this.f46373b.Q();
                return;
            default:
                this.f46373b.M();
                return;
        }
    }
}
