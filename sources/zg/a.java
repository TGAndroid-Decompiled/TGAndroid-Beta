package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49229a;
    public final b f49230b;
    public final d0 f49231c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49229a = i10;
        this.f49230b = bVar;
        this.f49231c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49229a) {
            case 0:
                this.f49230b.f49243f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49231c.invalidate();
                return;
            default:
                this.f49230b.f49243f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49231c.invalidate();
                return;
        }
    }
}
