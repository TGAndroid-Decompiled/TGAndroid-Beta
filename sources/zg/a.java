package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f53300a;
    public final b f53301b;
    public final d0 f53302c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f53300a = i10;
        this.f53301b = bVar;
        this.f53302c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53300a) {
            case 0:
                this.f53301b.f53316f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53302c.invalidate();
                return;
            default:
                this.f53301b.f53316f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53302c.invalidate();
                return;
        }
    }
}
