package qh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class u5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46157a;
    public final float f46158b;
    public final float f46159c;
    public final float d;
    public final float f46160e;
    public final Object f46161f;

    public u5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f46157a = i10;
        this.f46161f = obj;
        this.f46158b = f10;
        this.f46159c = f11;
        this.d = f12;
        this.f46160e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46157a) {
            case 0:
                n nVar = (n) this.f46161f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5 v5Var = nVar.f46227a;
                float f10 = this.f46158b;
                float f11 = this.f46159c;
                v5Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                v5Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                v5Var.setTranslationX(this.d * floatValue);
                v5Var.setTranslationY(this.f46160e * floatValue);
                float f12 = 1.0f - floatValue;
                v5Var.setAlpha(f12);
                nVar.f46234s = f12;
                nVar.invalidate();
                return;
            default:
                wf.j jVar = (wf.j) this.f46161f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f46159c;
                float f14 = this.f46158b;
                jVar.f49598k = e2.c.w(f13, f14, floatValue2, f14);
                float f15 = this.f46160e;
                float f16 = this.d;
                jVar.f49599l = e2.c.w(f15, f16, floatValue2, f16);
                jVar.f49590a.a(f13, f15, false);
                return;
        }
    }
}
