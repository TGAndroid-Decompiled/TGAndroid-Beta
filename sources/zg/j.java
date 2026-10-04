package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f53403a;
    public final q f53404b;

    public j(q qVar, int i10) {
        this.f53403a = i10;
        this.f53404b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f53403a) {
            case 0:
                q qVar = this.f53404b;
                qVar.f53518w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f53512c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f53404b;
                qVar2.f53518w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f53512c.getMeasuredHeight());
                return;
        }
    }
}
