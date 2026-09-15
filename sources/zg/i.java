package zg;

import android.animation.ValueAnimator;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f49041a;
    public final q f49042b;

    public i(q qVar, int i10) {
        this.f49041a = i10;
        this.f49042b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49041a) {
            case 0:
                q qVar = this.f49042b;
                qVar.f49136w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49131c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49042b;
                qVar2.f49136w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49131c.getMeasuredHeight());
                return;
        }
    }
}
