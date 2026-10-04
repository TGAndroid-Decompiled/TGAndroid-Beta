package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f53305a;
    public final b f53306b;
    public final d0 f53307c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f53305a = i10;
        this.f53306b = bVar;
        this.f53307c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53305a) {
            case 0:
                this.f53306b.f53321f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53307c.invalidate();
                return;
            default:
                this.f53306b.f53321f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53307c.invalidate();
                return;
        }
    }
}
