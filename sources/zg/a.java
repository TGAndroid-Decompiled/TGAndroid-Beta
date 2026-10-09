package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f54446a;
    public final b f54447b;
    public final c0 f54448c;

    public a(b bVar, c0 c0Var, int i10) {
        this.f54446a = i10;
        this.f54447b = bVar;
        this.f54448c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54446a) {
            case 0:
                this.f54447b.f54476f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54448c.invalidate();
                return;
            default:
                this.f54447b.f54476f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54448c.invalidate();
                return;
        }
    }
}
