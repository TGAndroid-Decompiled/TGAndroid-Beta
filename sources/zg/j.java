package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f54550a;
    public final q f54551b;

    public j(q qVar, int i10) {
        this.f54550a = i10;
        this.f54551b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54550a) {
            case 0:
                q qVar = this.f54551b;
                qVar.f54655w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f54649c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f54551b;
                qVar2.f54655w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f54649c.getMeasuredHeight());
                return;
        }
    }
}
