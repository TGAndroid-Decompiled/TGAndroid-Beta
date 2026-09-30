package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49338a;
    public final b f49339b;
    public final d0 f49340c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49338a = i10;
        this.f49339b = bVar;
        this.f49340c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49338a) {
            case 0:
                this.f49339b.f49352f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49340c.invalidate();
                return;
            default:
                this.f49339b.f49352f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49340c.invalidate();
                return;
        }
    }
}
