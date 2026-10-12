package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f47598a;
    public final s f47599b;
    public final r f47600c;

    public p(s sVar, r rVar, int i10) {
        this.f47598a = i10;
        this.f47599b = sVar;
        this.f47600c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47598a) {
            case 0:
                s sVar = this.f47599b;
                sVar.getClass();
                this.f47600c.f47641c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f47599b;
                sVar2.getClass();
                this.f47600c.f47641c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
