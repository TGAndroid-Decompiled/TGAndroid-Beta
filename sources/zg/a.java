package zg;

import android.animation.ValueAnimator;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f49257a;
    public final b f49258b;
    public final d0 f49259c;

    public a(b bVar, d0 d0Var, int i10) {
        this.f49257a = i10;
        this.f49258b = bVar;
        this.f49259c = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49257a) {
            case 0:
                this.f49258b.f49271f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49259c.invalidate();
                return;
            default:
                this.f49258b.f49271f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f49259c.invalidate();
                return;
        }
    }
}
