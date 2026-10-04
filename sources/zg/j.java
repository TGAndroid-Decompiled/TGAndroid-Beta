package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f53402a;
    public final q f53403b;

    public j(q qVar, int i10) {
        this.f53402a = i10;
        this.f53403b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53402a) {
            case 0:
                q qVar = this.f53403b;
                qVar.f53517w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f53511c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f53403b;
                qVar2.f53517w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f53511c.getMeasuredHeight());
                return;
        }
    }
}
