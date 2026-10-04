package rg;

import android.animation.ValueAnimator;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f46230a;
    public final s f46231b;
    public final r f46232c;

    public p(s sVar, r rVar, int i10) {
        this.f46230a = i10;
        this.f46231b = sVar;
        this.f46232c = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46230a) {
            case 0:
                s sVar = this.f46231b;
                sVar.getClass();
                this.f46232c.f46274c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar.invalidate();
                return;
            default:
                s sVar2 = this.f46231b;
                sVar2.getClass();
                this.f46232c.f46274c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sVar2.invalidate();
                return;
        }
    }
}
