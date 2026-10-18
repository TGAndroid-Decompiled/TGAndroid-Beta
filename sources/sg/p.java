package sg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46362a;
    public final s f46363b;
    public final r f46364c;

    public p(s sVar, r rVar, int i10) {
        this.f46362a = i10;
        this.f46363b = sVar;
        this.f46364c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46362a) {
            case 0:
                s sVar = this.f46363b;
                sVar.getClass();
                this.f46364c.f46400c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46363b;
                sVar2.getClass();
                this.f46364c.f46400c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
