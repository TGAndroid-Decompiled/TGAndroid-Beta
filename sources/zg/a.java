package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f48950a;
    public final b f48951b;
    public final e0 f48952c;

    public a(b bVar, e0 e0Var, int i10) {
        this.f48950a = i10;
        this.f48951b = bVar;
        this.f48952c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48950a) {
            case 0:
                this.f48951b.f48958f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48952c.invalidate();
                return;
            default:
                this.f48951b.f48958f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48952c.invalidate();
                return;
        }
    }
}
