package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f54782a;
    public final q f54783b;

    public j(q qVar, int i10) {
        this.f54782a = i10;
        this.f54783b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54782a) {
            case 0:
                q qVar = this.f54783b;
                qVar.f54887w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f54881c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f54783b;
                qVar2.f54887w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f54881c.getMeasuredHeight());
                return;
        }
    }
}
