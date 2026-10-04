package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46238a;
    public final s f46239b;
    public final r f46240c;

    public p(s sVar, r rVar, int i10) {
        this.f46238a = i10;
        this.f46239b = sVar;
        this.f46240c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46238a) {
            case 0:
                s sVar = this.f46239b;
                sVar.getClass();
                this.f46240c.f46282c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46239b;
                sVar2.getClass();
                this.f46240c.f46282c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
