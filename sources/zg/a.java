package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f48957a;
    public final b f48958b;
    public final e0 f48959c;

    public a(b bVar, e0 e0Var, int i10) {
        this.f48957a = i10;
        this.f48958b = bVar;
        this.f48959c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48957a) {
            case 0:
                this.f48958b.f48965f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48959c.invalidate();
                return;
            default:
                this.f48958b.f48965f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48959c.invalidate();
                return;
        }
    }
}
