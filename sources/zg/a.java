package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49273a;
    public final b f49274b;
    public final e0 f49275c;

    public a(b bVar, e0 e0Var, int i10) {
        this.f49273a = i10;
        this.f49274b = bVar;
        this.f49275c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49273a) {
            case 0:
                this.f49274b.f49281f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49275c.invalidate();
                return;
            default:
                this.f49274b.f49281f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49275c.invalidate();
                return;
        }
    }
}
