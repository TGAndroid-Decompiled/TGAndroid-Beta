package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56727a;
    public final r f56728b;
    public final q f56729c;

    public o(r rVar, q qVar, int i7) {
        this.f56727a = i7;
        this.f56728b = rVar;
        this.f56729c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56727a) {
            case 0:
                r rVar = this.f56728b;
                rVar.getClass();
                this.f56729c.f56789c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56728b;
                rVar2.getClass();
                this.f56729c.f56789c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
