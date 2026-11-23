package tg;

import ai.u2;
import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class z1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f58241a;
    public final Object f58242b;

    public z1(Object obj, int i7) {
        this.f58241a = i7;
        this.f58242b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i7 = this.f58241a;
        Object obj = this.f58242b;
        switch (i7) {
            case 0:
                f2 f2Var = (f2) obj;
                f2Var.getClass();
                f2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                l2 l2Var = (l2) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.E = floatValue;
                u2 u2Var = l2Var.f58049c;
                u2Var.setAlpha(floatValue);
                u2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, l2Var.E));
                u2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, l2Var.E));
                l2Var.f58048b.invalidate();
                return;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.f33059p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f10 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f33065c0 = f10;
                return;
            case 3:
                ug.r0 r0Var = (ug.r0) obj;
                r0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.f58904f.invalidate();
                ug.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.invalidate();
                    return;
                }
                return;
            case 4:
                ((ug.t1) obj).f58958a.f58943o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                ((vg.e) obj).f59456a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 6:
                wg.b bVar = (wg.b) obj;
                bVar.getClass();
                bVar.f59762b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            default:
                ((wi.h) obj).f60001m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
