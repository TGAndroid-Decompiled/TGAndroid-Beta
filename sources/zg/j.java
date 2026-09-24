package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f49312a;
    public final q f49313b;

    public j(q qVar, int i10) {
        this.f49312a = i10;
        this.f49313b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49312a) {
            case 0:
                q qVar = this.f49313b;
                qVar.f49421w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49416c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49313b;
                qVar2.f49421w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49416c.getMeasuredHeight());
                return;
        }
    }
}
