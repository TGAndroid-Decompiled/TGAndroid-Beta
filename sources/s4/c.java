package s4;

import android.animation.ValueAnimator;
public final class c implements ValueAnimator.AnimatorUpdateListener {
    public final int f42657a;
    public final j f42658b;

    public c(j jVar, c1 c1Var, int i10) {
        this.f42657a = i10;
        this.f42658b = jVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42657a) {
            case 0:
                this.f42658b.Q();
                return;
            default:
                this.f42658b.M();
                return;
        }
    }
}
