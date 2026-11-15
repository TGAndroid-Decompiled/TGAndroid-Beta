package tg;

import ai.r2;
import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f57602a;
    public final Object f57603b;

    public x1(Object obj, int i7) {
        this.f57602a = i7;
        this.f57603b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i7 = this.f57602a;
        Object obj = this.f57603b;
        switch (i7) {
            case 0:
                e2 e2Var = (e2) obj;
                e2Var.getClass();
                e2Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 1:
                l2 l2Var = (l2) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.E = floatValue;
                r2 r2Var = l2Var.f57424c;
                r2Var.setAlpha(floatValue);
                r2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, l2Var.E));
                r2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, l2Var.E));
                l2Var.f57423b.invalidate();
                return;
            case 2:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.f32626p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f10 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f32632c0 = f10;
                return;
            case 3:
                ug.q0 q0Var = (ug.q0) obj;
                q0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q0Var.f58267f.invalidate();
                ug.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.invalidate();
                    return;
                }
                return;
            case 4:
                ((ug.s1) obj).f58330a.f58317o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                ((vg.e) obj).f58844a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 6:
                wg.b bVar = (wg.b) obj;
                bVar.getClass();
                bVar.f59131b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            default:
                ((wi.h) obj).f59391m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
