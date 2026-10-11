package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f54671a;
    public final q f54672b;

    public j(q qVar, int i10) {
        this.f54671a = i10;
        this.f54672b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f54671a) {
            case 0:
                q qVar = this.f54672b;
                qVar.f54776w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f54770c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f54672b;
                qVar2.f54776w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f54770c.getMeasuredHeight());
                return;
        }
    }
}
