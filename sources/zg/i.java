package zg;

import android.animation.ValueAnimator;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f49034a;
    public final q f49035b;

    public i(q qVar, int i10) {
        this.f49034a = i10;
        this.f49035b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49034a) {
            case 0:
                q qVar = this.f49035b;
                qVar.f49129w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49124c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49035b;
                qVar2.f49129w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49124c.getMeasuredHeight());
                return;
        }
    }
}
