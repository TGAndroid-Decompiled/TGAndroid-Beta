package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f54637a;
    public final q f54638b;

    public j(q qVar, int i10) {
        this.f54637a = i10;
        this.f54638b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54637a) {
            case 0:
                q qVar = this.f54638b;
                qVar.f54742w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f54736c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f54638b;
                qVar2.f54742w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f54736c.getMeasuredHeight());
                return;
        }
    }
}
