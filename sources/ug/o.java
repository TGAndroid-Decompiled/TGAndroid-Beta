package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f56739a;
    public final r f56740b;
    public final q f56741c;

    public o(r rVar, q qVar, int i7) {
        this.f56739a = i7;
        this.f56740b = rVar;
        this.f56741c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56739a) {
            case 0:
                r rVar = this.f56740b;
                rVar.getClass();
                this.f56741c.f56801c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f56740b;
                rVar2.getClass();
                this.f56741c.f56801c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
