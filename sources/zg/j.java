package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f49323a;
    public final q f49324b;

    public j(q qVar, int i10) {
        this.f49323a = i10;
        this.f49324b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49323a) {
            case 0:
                q qVar = this.f49324b;
                qVar.f49432w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49427c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49324b;
                qVar2.f49432w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49427c.getMeasuredHeight());
                return;
        }
    }
}
