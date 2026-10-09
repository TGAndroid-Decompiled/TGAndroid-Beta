package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f54444a;
    public final b f54445b;
    public final c0 f54446c;

    public a(b bVar, c0 c0Var, int i10) {
        this.f54444a = i10;
        this.f54445b = bVar;
        this.f54446c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54444a) {
            case 0:
                this.f54445b.f54474f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54446c.invalidate();
                return;
            default:
                this.f54445b.f54474f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54446c.invalidate();
                return;
        }
    }
}
