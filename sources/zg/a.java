package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f53299a;
    public final b f53300b;
    public final d0 f53301c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f53299a = i10;
        this.f53300b = bVar;
        this.f53301c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53299a) {
            case 0:
                this.f53300b.f53315f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53301c.invalidate();
                return;
            default:
                this.f53300b.f53315f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53301c.invalidate();
                return;
        }
    }
}
