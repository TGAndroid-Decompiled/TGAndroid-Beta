package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f48985a;
    public final b f48986b;
    public final e0 f48987c;

    public a(b bVar, e0 e0Var, int i10) {
        this.f48985a = i10;
        this.f48986b = bVar;
        this.f48987c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48985a) {
            case 0:
                this.f48986b.f48993f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48987c.invalidate();
                return;
            default:
                this.f48986b.f48993f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f48987c.invalidate();
                return;
        }
    }
}
