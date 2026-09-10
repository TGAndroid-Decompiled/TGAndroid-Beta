package yg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f46931a;
    public final c f46932b;
    public final e0 f46933c;

    public a(c cVar, e0 e0Var, int i10) {
        this.f46931a = i10;
        this.f46932b = cVar;
        this.f46933c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46931a) {
            case 0:
                this.f46932b.f46949f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f46933c.invalidate();
                return;
            default:
                this.f46932b.f46949f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f46933c.invalidate();
                return;
        }
    }
}
