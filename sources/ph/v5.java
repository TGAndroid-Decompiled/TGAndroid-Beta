package ph;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class v5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f42511a;
    public final float f42512b;
    public final float f42513c;
    public final float d;
    public final float e;
    public final Object f42514f;

    public v5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f42511a = i10;
        this.f42514f = obj;
        this.f42512b = f10;
        this.f42513c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f42511a) {
            case 0:
                n nVar = (n) this.f42514f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5 w5Var = nVar.f42592a;
                float f10 = this.f42512b;
                float f11 = this.f42513c;
                w5Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                w5Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                w5Var.setTranslationX(this.d * floatValue);
                w5Var.setTranslationY(this.e * floatValue);
                float f12 = 1.0f - floatValue;
                w5Var.setAlpha(f12);
                nVar.f42598s = f12;
                nVar.invalidate();
                return;
            default:
                vf.j jVar = (vf.j) this.f42514f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f42513c;
                float f14 = this.f42512b;
                jVar.f45836k = e2.c.w(f13, f14, floatValue2, f14);
                float f15 = this.e;
                float f16 = this.d;
                jVar.f45837l = e2.c.w(f15, f16, floatValue2, f16);
                jVar.f45829a.a(f13, f15, false);
                return;
        }
    }
}
