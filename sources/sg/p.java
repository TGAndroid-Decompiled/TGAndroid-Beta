package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46369a;
    public final s f46370b;
    public final r f46371c;

    public p(s sVar, r rVar, int i10) {
        this.f46369a = i10;
        this.f46370b = sVar;
        this.f46371c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46369a) {
            case 0:
                s sVar = this.f46370b;
                sVar.getClass();
                this.f46371c.f46407c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46370b;
                sVar2.getClass();
                this.f46371c.f46407c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
