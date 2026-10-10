package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f54594a;
    public final q f54595b;

    public j(q qVar, int i10) {
        this.f54594a = i10;
        this.f54595b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54594a) {
            case 0:
                q qVar = this.f54595b;
                qVar.f54699w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f54693c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f54595b;
                qVar2.f54699w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f54693c.getMeasuredHeight());
                return;
        }
    }
}
