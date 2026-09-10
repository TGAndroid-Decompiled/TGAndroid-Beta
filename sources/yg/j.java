package yg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f47026a;
    public final s f47027b;

    public j(s sVar, int i10) {
        this.f47026a = i10;
        this.f47027b = sVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47026a) {
            case 0:
                s sVar = this.f47027b;
                sVar.f47140w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * sVar.f47135c.getMeasuredHeight());
                return;
            default:
                s sVar2 = this.f47027b;
                sVar2.f47140w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * sVar2.f47135c.getMeasuredHeight());
                return;
        }
    }
}
