package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f54670a;
    public final b f54671b;
    public final c0 f54672c;

    public a(b bVar, c0 c0Var, int i10) {
        this.f54670a = i10;
        this.f54671b = bVar;
        this.f54672c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54670a) {
            case 0:
                this.f54671b.f54700f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54672c.invalidate();
                return;
            default:
                this.f54671b.f54700f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54672c.invalidate();
                return;
        }
    }
}
