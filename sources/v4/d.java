package v4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f59222a;
    public final l f59223b;

    public d(l lVar, f1 f1Var, int i7) {
        this.f59222a = i7;
        this.f59223b = lVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f59222a) {
            case 0:
                this.f59223b.Q();
                return;
            default:
                this.f59223b.M();
                return;
        }
    }
}
