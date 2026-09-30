package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f49325a;
    public final q f49326b;

    public j(q qVar, int i10) {
        this.f49325a = i10;
        this.f49326b = qVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49325a) {
            case 0:
                q qVar = this.f49326b;
                qVar.f49434w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * qVar.f49429c.getMeasuredHeight());
                return;
            default:
                q qVar2 = this.f49326b;
                qVar2.f49434w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * qVar2.f49429c.getMeasuredHeight());
                return;
        }
    }
}
