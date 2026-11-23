package tg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class c2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f57864a;
    public final Object f57865b;

    public c2(Object obj, int i7) {
        this.f57864a = i7;
        this.f57865b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i7 = this.f57864a;
        Object obj = this.f57865b;
        switch (i7) {
            case 0:
                i2 i2Var = (i2) obj;
                i2Var.getClass();
                i2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                o2 o2Var = (o2) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2Var.E = floatValue;
                ai.l2 l2Var = o2Var.f58154c;
                l2Var.setAlpha(floatValue);
                l2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, o2Var.E));
                l2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, o2Var.E));
                o2Var.f58153b.invalidate();
                return;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.f33123p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f10 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f33129c0 = f10;
                return;
            case 3:
                ug.r0 r0Var = (ug.r0) obj;
                r0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.f58984f.invalidate();
                ug.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.invalidate();
                    return;
                }
                return;
            case 4:
                ((ug.t1) obj).f59038a.f59023o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                ((vg.e) obj).f59541a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 6:
                wg.b bVar = (wg.b) obj;
                bVar.getClass();
                bVar.f59829b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            default:
                ((wi.h) obj).f60084m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
