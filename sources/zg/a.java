package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49211a;
    public final b f49212b;
    public final d0 f49213c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49211a = i10;
        this.f49212b = bVar;
        this.f49213c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49211a) {
            case 0:
                this.f49212b.f49225f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49213c.invalidate();
                return;
            default:
                this.f49212b.f49225f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49213c.invalidate();
                return;
        }
    }
}
