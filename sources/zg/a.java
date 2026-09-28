package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49231a;
    public final b f49232b;
    public final d0 f49233c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49231a = i10;
        this.f49232b = bVar;
        this.f49233c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49231a) {
            case 0:
                this.f49232b.f49245f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49233c.invalidate();
                return;
            default:
                this.f49232b.f49245f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49233c.invalidate();
                return;
        }
    }
}
