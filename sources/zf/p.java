package zf;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f50642a;
    public final s f50643b;
    public final r f50644c;

    public p(s sVar, r rVar, int i9) {
        this.f50642a = i9;
        this.f50643b = sVar;
        this.f50644c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50642a) {
            case 0:
                s sVar = this.f50643b;
                sVar.getClass();
                this.f50644c.f50676c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f50643b;
                sVar2.getClass();
                this.f50644c.f50676c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
