package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46219a;
    public final s f46220b;
    public final r f46221c;

    public p(s sVar, r rVar, int i10) {
        this.f46219a = i10;
        this.f46220b = sVar;
        this.f46221c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46219a) {
            case 0:
                s sVar = this.f46220b;
                sVar.getClass();
                this.f46221c.f46232c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46220b;
                sVar2.getClass();
                this.f46221c.f46232c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
