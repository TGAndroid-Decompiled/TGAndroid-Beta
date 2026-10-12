package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f54678a;
    public final b f54679b;
    public final c0 f54680c;

    public a(b bVar, c0 c0Var, int i10) {
        this.f54678a = i10;
        this.f54679b = bVar;
        this.f54680c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54678a) {
            case 0:
                this.f54679b.f54708f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54680c.invalidate();
                return;
            default:
                this.f54679b.f54708f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54680c.invalidate();
                return;
        }
    }
}
