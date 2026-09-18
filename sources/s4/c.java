package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42688a;
    public final j f42689b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42688a = i10;
        this.f42689b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42688a) {
            case 0:
                this.f42689b.Q();
                return;
            default:
                this.f42689b.M();
                return;
        }
    }
}
