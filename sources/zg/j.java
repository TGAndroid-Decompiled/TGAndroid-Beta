package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f49322a;
    public final q f49323b;

    public j(q qVar, int i10) {
        this.f49322a = i10;
        this.f49323b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49322a) {
            case 0:
                q qVar = this.f49323b;
                qVar.f49431w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49426c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49323b;
                qVar2.f49431w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49426c.getMeasuredHeight());
                return;
        }
    }
}
