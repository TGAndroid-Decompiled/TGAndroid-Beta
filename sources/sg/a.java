package sg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f48259a;
    public final b f48260b;
    public final d0 f48261c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f48259a = i10;
        this.f48260b = bVar;
        this.f48261c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48259a) {
            case 0:
                this.f48260b.f48274f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48261c.invalidate();
                return;
            default:
                this.f48260b.f48274f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48261c.invalidate();
                return;
        }
    }
}
