package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f54548a;
    public final q f54549b;

    public j(q qVar, int i10) {
        this.f54548a = i10;
        this.f54549b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54548a) {
            case 0:
                q qVar = this.f54549b;
                qVar.f54653w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f54647c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f54549b;
                qVar2.f54653w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f54647c.getMeasuredHeight());
                return;
        }
    }
}
