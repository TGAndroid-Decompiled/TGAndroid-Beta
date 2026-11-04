package u4;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f55537a;
    public final k f55538b;

    public d(k kVar, d1 d1Var, int i3) {
        this.f55537a = i3;
        this.f55538b = kVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f55537a) {
            case 0:
                this.f55538b.Q();
                return;
            default:
                this.f55538b.M();
                return;
        }
    }
}
