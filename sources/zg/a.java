package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f48901a;
    public final b f48902b;
    public final e0 f48903c;

    public a(b bVar, e0 e0Var, int i10) {
        this.f48901a = i10;
        this.f48902b = bVar;
        this.f48903c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48901a) {
            case 0:
                this.f48902b.f48909f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48903c.invalidate();
                return;
            default:
                this.f48902b.f48909f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48903c.invalidate();
                return;
        }
    }
}
