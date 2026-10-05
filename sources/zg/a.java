package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f53326a;
    public final b f53327b;
    public final b0 f53328c;

    public a(b bVar, b0 b0Var, int i10) {
        this.f53326a = i10;
        this.f53327b = bVar;
        this.f53328c = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53326a) {
            case 0:
                this.f53327b.f53333f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53328c.invalidate();
                return;
            default:
                this.f53327b.f53333f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f53328c.invalidate();
                return;
        }
    }
}
