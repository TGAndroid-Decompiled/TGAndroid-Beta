package tg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f49010a;
    public final s f49011b;
    public final r f49012c;

    public p(s sVar, r rVar, int i10) {
        this.f49010a = i10;
        this.f49011b = sVar;
        this.f49012c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49010a) {
            case 0:
                s sVar = this.f49011b;
                sVar.getClass();
                this.f49012c.f49054c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f49011b;
                sVar2.getClass();
                this.f49012c.f49054c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
