package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42704a;
    public final s f42705b;
    public final r f42706c;

    public p(s sVar, r rVar, int i10) {
        this.f42704a = i10;
        this.f42705b = sVar;
        this.f42706c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42704a) {
            case 0:
                s sVar = this.f42705b;
                sVar.getClass();
                this.f42706c.f42736c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42705b;
                sVar2.getClass();
                this.f42706c.f42736c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
