package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f54567a;
    public final b f54568b;
    public final c0 f54569c;

    public a(b bVar, c0 c0Var, int i10) {
        this.f54567a = i10;
        this.f54568b = bVar;
        this.f54569c = c0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54567a) {
            case 0:
                this.f54568b.f54597f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54569c.invalidate();
                return;
            default:
                this.f54568b.f54597f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f54569c.invalidate();
                return;
        }
    }
}
