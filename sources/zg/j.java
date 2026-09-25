package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f49324a;
    public final q f49325b;

    public j(q qVar, int i10) {
        this.f49324a = i10;
        this.f49325b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49324a) {
            case 0:
                q qVar = this.f49325b;
                qVar.f49433w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49428c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49325b;
                qVar2.f49433w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49428c.getMeasuredHeight());
                return;
        }
    }
}
