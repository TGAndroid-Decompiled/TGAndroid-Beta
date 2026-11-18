package ug;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f58800a;
    public final r f58801b;
    public final q f58802c;

    public o(r rVar, q qVar, int i7) {
        this.f58800a = i7;
        this.f58801b = rVar;
        this.f58802c = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58800a) {
            case 0:
                r rVar = this.f58801b;
                rVar.getClass();
                this.f58802c.f58824c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.invalidate();
                return;
            default:
                r rVar2 = this.f58801b;
                rVar2.getClass();
                this.f58802c.f58824c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar2.invalidate();
                return;
        }
    }
}
