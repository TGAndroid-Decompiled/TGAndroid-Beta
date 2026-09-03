package qh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class t5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46137a;
    public final float f46138b;
    public final float f46139c;
    public final float d;
    public final float f46140e;
    public final Object f46141f;

    public t5(Object obj, float f10, float f11, float f12, float f13, int i10) {
        this.f46137a = i10;
        this.f46141f = obj;
        this.f46138b = f10;
        this.f46139c = f11;
        this.d = f12;
        this.f46140e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f46137a) {
            case 0:
                n nVar = (n) this.f46141f;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u5 u5Var = nVar.f46210a;
                float f10 = this.f46138b;
                float f11 = this.f46139c;
                u5Var.setScaleX(AndroidUtilities.lerp(f10, f11, floatValue));
                u5Var.setScaleY(AndroidUtilities.lerp(f10, f11, floatValue));
                u5Var.setTranslationX(this.d * floatValue);
                u5Var.setTranslationY(this.f46140e * floatValue);
                float f12 = 1.0f - floatValue;
                u5Var.setAlpha(f12);
                nVar.f46217s = f12;
                nVar.invalidate();
                return;
            default:
                wf.j jVar = (wf.j) this.f46141f;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = this.f46139c;
                float f14 = this.f46138b;
                jVar.f49635k = e2.c.w(f13, f14, floatValue2, f14);
                float f15 = this.f46140e;
                float f16 = this.d;
                jVar.f49636l = e2.c.w(f15, f16, floatValue2, f16);
                jVar.f49627a.a(f13, f15, false);
                return;
        }
    }
}
