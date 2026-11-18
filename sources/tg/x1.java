package tg;

import ai.r2;
import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f58170a;
    public final Object f58171b;

    public x1(Object obj, int i7) {
        this.f58170a = i7;
        this.f58171b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i7 = this.f58170a;
        Object obj = this.f58171b;
        switch (i7) {
            case 0:
                e2 e2Var = (e2) obj;
                e2Var.getClass();
                e2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                k2 k2Var = (k2) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.E = floatValue;
                r2 r2Var = k2Var.f57989c;
                r2Var.setAlpha(floatValue);
                r2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, k2Var.E));
                r2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, k2Var.E));
                k2Var.f57988b.invalidate();
                return;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.f33023p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f10 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f33029c0 = f10;
                return;
            case 3:
                ug.s0 s0Var = (ug.s0) obj;
                s0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0Var.f58864f.invalidate();
                ug.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.invalidate();
                    return;
                }
                return;
            case 4:
                ((ug.u1) obj).f58920a.f58905o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                ((vg.e) obj).f59414a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 6:
                wg.b bVar = (wg.b) obj;
                bVar.getClass();
                bVar.f59720b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            default:
                ((wi.h) obj).f59956m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
