package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f45294a;
    public final s f45295b;
    public final r f45296c;

    public p(s sVar, r rVar, int i10) {
        this.f45294a = i10;
        this.f45295b = sVar;
        this.f45296c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f45294a) {
            case 0:
                s sVar = this.f45295b;
                sVar.getClass();
                this.f45296c.f45333c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f45295b;
                sVar2.getClass();
                this.f45296c.f45333c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
