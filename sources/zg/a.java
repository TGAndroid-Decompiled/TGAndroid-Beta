package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49230a;
    public final b f49231b;
    public final d0 f49232c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49230a = i10;
        this.f49231b = bVar;
        this.f49232c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49230a) {
            case 0:
                this.f49231b.f49244f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49232c.invalidate();
                return;
            default:
                this.f49231b.f49244f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49232c.invalidate();
                return;
        }
    }
}
