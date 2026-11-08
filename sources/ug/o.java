package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56726a;
    public final r f56727b;
    public final q f56728c;

    public o(r rVar, q qVar, int i7) {
        this.f56726a = i7;
        this.f56727b = rVar;
        this.f56728c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56726a) {
            case 0:
                r rVar = this.f56727b;
                rVar.getClass();
                this.f56728c.f56788c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56727b;
                rVar2.getClass();
                this.f56728c.f56788c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
