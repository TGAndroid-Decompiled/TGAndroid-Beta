package zg;

import android.animation.ValueAnimator;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f49348a;
    public final q f49349b;

    public i(q qVar, int i10) {
        this.f49348a = i10;
        this.f49349b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49348a) {
            case 0:
                q qVar = this.f49349b;
                qVar.f49459w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49454c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49349b;
                qVar2.f49459w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49454c.getMeasuredHeight());
                return;
        }
    }
}
