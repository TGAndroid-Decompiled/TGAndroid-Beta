package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f54774a;
    public final q f54775b;

    public j(q qVar, int i10) {
        this.f54774a = i10;
        this.f54775b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54774a) {
            case 0:
                q qVar = this.f54775b;
                qVar.f54879w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f54873c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f54775b;
                qVar2.f54879w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f54873c.getMeasuredHeight());
                return;
        }
    }
}
