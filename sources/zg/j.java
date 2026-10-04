package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f53408a;
    public final q f53409b;

    public j(q qVar, int i10) {
        this.f53408a = i10;
        this.f53409b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53408a) {
            case 0:
                q qVar = this.f53409b;
                qVar.f53523w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f53517c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f53409b;
                qVar2.f53523w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f53517c.getMeasuredHeight());
                return;
        }
    }
}
