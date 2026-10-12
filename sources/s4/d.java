package s4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f44867a;
    public final k f44868b;

    public d(k kVar, b1 b1Var, int i10) {
        this.f44867a = i10;
        this.f44868b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f44867a) {
            case 0:
                this.f44868b.Q();
                return;
            default:
                this.f44868b.M();
                return;
        }
    }
}
