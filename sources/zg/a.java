package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f48980a;
    public final b f48981b;
    public final e0 f48982c;

    public a(b bVar, e0 e0Var, int i10) {
        this.f48980a = i10;
        this.f48981b = bVar;
        this.f48982c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48980a) {
            case 0:
                this.f48981b.f48988f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48982c.invalidate();
                return;
            default:
                this.f48981b.f48988f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48982c.invalidate();
                return;
        }
    }
}
