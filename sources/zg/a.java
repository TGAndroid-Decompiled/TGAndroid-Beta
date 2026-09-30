package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49232a;
    public final b f49233b;
    public final d0 f49234c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49232a = i10;
        this.f49233b = bVar;
        this.f49234c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49232a) {
            case 0:
                this.f49233b.f49246f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49234c.invalidate();
                return;
            default:
                this.f49233b.f49246f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49234c.invalidate();
                return;
        }
    }
}
