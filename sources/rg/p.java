package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f42418a;
    public final s f42419b;
    public final r f42420c;

    public p(s sVar, r rVar, int i10) {
        this.f42418a = i10;
        this.f42419b = sVar;
        this.f42420c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42418a) {
            case 0:
                s sVar = this.f42419b;
                sVar.getClass();
                this.f42420c.f42448c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f42419b;
                sVar2.getClass();
                this.f42420c.f42448c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
