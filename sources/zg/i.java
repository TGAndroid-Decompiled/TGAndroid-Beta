package zg;

import android.animation.ValueAnimator;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f49302a;
    public final q f49303b;

    public i(q qVar, int i10) {
        this.f49302a = i10;
        this.f49303b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49302a) {
            case 0:
                q qVar = this.f49303b;
                qVar.f49413w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49408c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49303b;
                qVar2.f49413w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49408c.getMeasuredHeight());
                return;
        }
    }
}
