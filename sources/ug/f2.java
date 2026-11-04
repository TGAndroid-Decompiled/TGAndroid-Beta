package ug;

import android.animation.ValueAnimator;
import android.view.KeyEvent;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f56003a;
    public final KeyEvent.Callback f56004b;

    public f2(KeyEvent.Callback callback, int i3) {
        this.f56003a = i3;
        this.f56004b = callback;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i3 = this.f56003a;
        KeyEvent.Callback callback = this.f56004b;
        switch (i3) {
            case 0:
                j2 j2Var = (j2) callback;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j2Var.E = floatValue;
                ci.q qVar = j2Var.f56103c;
                qVar.setAlpha(floatValue);
                qVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, j2Var.E));
                qVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, j2Var.E));
                j2Var.f56102b.invalidate();
                return;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) callback;
                int i10 = LimitPreviewView.f31519p0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f10 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f31525c0 = f10;
                return;
            case 2:
                vg.o0 o0Var = (vg.o0) callback;
                o0Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.f56763f.invalidate();
                vg.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((vg.t1) callback).f56857a.f56841o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ((wg.e) callback).f57617a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                xg.b bVar = (xg.b) callback;
                bVar.getClass();
                bVar.f58653b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
        }
    }
}
