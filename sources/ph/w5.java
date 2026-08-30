package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42507a;
    public final float f42508b;
    public final float f42509c;
    public final float d;
    public final float e;
    public final Object f42510f;

    public w5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f42507a = i10;
        this.f42510f = obj;
        this.f42508b = f10;
        this.f42509c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42507a) {
            case 0:
                n nVar = (n) this.f42510f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5 x5Var = nVar.f42619a;
                float f10 = this.f42508b;
                float f11 = this.f42509c;
                x5Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                x5Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                x5Var.setTranslationX(this.d * floatValue);
                x5Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                x5Var.setAlpha(f12);
                nVar.f42625s = f12;
                nVar.invalidate();
                return;
            default:
                vf.j jVar = (vf.j) this.f42510f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f42509c;
                float f14 = this.f42508b;
                jVar.f45758k = e2.c.w(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                jVar.f45759l = e2.c.w(f15, f16, floatValue2, f16);
                jVar.f45751a.a(f13, f15, false);
                return;
        }
    }
}
