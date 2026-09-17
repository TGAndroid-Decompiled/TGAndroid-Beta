package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46220a;
    public final s f46221b;
    public final r f46222c;

    public p(s sVar, r rVar, int i10) {
        this.f46220a = i10;
        this.f46221b = sVar;
        this.f46222c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46220a) {
            case 0:
                s sVar = this.f46221b;
                sVar.getClass();
                this.f46222c.f46233c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46221b;
                sVar2.getClass();
                this.f46222c.f46233c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
