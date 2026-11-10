package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56738a;
    public final r f56739b;
    public final q f56740c;

    public o(r rVar, q qVar, int i7) {
        this.f56738a = i7;
        this.f56739b = rVar;
        this.f56740c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56738a) {
            case 0:
                r rVar = this.f56739b;
                rVar.getClass();
                this.f56740c.f56800c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56739b;
                rVar2.getClass();
                this.f56740c.f56800c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
