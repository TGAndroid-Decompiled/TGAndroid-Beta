package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46248a;
    public final s f46249b;
    public final r f46250c;

    public p(s sVar, r rVar, int i10) {
        this.f46248a = i10;
        this.f46249b = sVar;
        this.f46250c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46248a) {
            case 0:
                s sVar = this.f46249b;
                sVar.getClass();
                this.f46250c.f46261c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46249b;
                sVar2.getClass();
                this.f46250c.f46261c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
