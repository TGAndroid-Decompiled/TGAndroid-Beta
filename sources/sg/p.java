package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46372a;
    public final s f46373b;
    public final r f46374c;

    public p(s sVar, r rVar, int i10) {
        this.f46372a = i10;
        this.f46373b = sVar;
        this.f46374c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46372a) {
            case 0:
                s sVar = this.f46373b;
                sVar.getClass();
                this.f46374c.f46410c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46373b;
                sVar2.getClass();
                this.f46374c.f46410c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
