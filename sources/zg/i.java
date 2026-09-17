package zg;

import android.animation.ValueAnimator;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f49064a;
    public final q f49065b;

    public i(q qVar, int i10) {
        this.f49064a = i10;
        this.f49065b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49064a) {
            case 0:
                q qVar = this.f49065b;
                qVar.f49159w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49154c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49065b;
                qVar2.f49159w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49154c.getMeasuredHeight());
                return;
        }
    }
}
