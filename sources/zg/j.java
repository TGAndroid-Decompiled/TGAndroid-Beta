package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f49431a;
    public final q f49432b;

    public j(q qVar, int i10) {
        this.f49431a = i10;
        this.f49432b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49431a) {
            case 0:
                q qVar = this.f49432b;
                qVar.f49540w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49535c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49432b;
                qVar2.f49540w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49535c.getMeasuredHeight());
                return;
        }
    }
}
