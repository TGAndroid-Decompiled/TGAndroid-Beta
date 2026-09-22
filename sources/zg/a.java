package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49277a;
    public final b f49278b;
    public final e0 f49279c;

    public a(b bVar, e0 e0Var, int i10) {
        this.f49277a = i10;
        this.f49278b = bVar;
        this.f49279c = e0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49277a) {
            case 0:
                this.f49278b.f49285f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49279c.invalidate();
                return;
            default:
                this.f49278b.f49285f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49279c.invalidate();
                return;
        }
    }
}
