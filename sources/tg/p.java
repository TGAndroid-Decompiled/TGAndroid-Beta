package tg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f48975a;
    public final s f48976b;
    public final r f48977c;

    public p(s sVar, r rVar, int i10) {
        this.f48975a = i10;
        this.f48976b = sVar;
        this.f48977c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48975a) {
            case 0:
                s sVar = this.f48976b;
                sVar.getClass();
                this.f48977c.f49019c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f48976b;
                sVar2.getClass();
                this.f48977c.f49019c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
