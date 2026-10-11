package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f54533a;
    public final b f54534b;
    public final c0 f54535c;

    public a(b bVar, c0 c0Var, int i10) {
        this.f54533a = i10;
        this.f54534b = bVar;
        this.f54535c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54533a) {
            case 0:
                this.f54534b.f54563f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54535c.invalidate();
                return;
            default:
                this.f54534b.f54563f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54535c.invalidate();
                return;
        }
    }
}
