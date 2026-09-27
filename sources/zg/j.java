package zg;

import android.animation.ValueAnimator;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f49368a;
    public final r f49369b;

    public j(r rVar, int i10) {
        this.f49368a = i10;
        this.f49369b = rVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f49368a) {
            case 0:
                r rVar = this.f49369b;
                rVar.f49480w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * rVar.f49475c.getMeasuredHeight());
                return;
            default:
                r rVar2 = this.f49369b;
                rVar2.f49480w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * rVar2.f49475c.getMeasuredHeight());
                return;
        }
    }
}
