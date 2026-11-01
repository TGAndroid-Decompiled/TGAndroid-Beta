package sg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f48270a;
    public final b f48271b;
    public final d0 f48272c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f48270a = i10;
        this.f48271b = bVar;
        this.f48272c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48270a) {
            case 0:
                this.f48271b.f48285f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48272c.invalidate();
                return;
            default:
                this.f48271b.f48285f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48272c.invalidate();
                return;
        }
    }
}
