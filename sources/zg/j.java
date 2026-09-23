package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f48996a;
    public final q f48997b;

    public j(q qVar, int i10) {
        this.f48996a = i10;
        this.f48997b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48996a) {
            case 0:
                q qVar = this.f48997b;
                qVar.f49080w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49075c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f48997b;
                qVar2.f49080w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49075c.getMeasuredHeight());
                return;
        }
    }
}
