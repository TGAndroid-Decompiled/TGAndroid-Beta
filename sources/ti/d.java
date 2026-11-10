package ti;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import ug.o0;
import ug.p0;
import ug.q1;
import zh.m3;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f56082a;
    public final Object f56083b;

    public d(Object obj, int i7) {
        this.f56082a = i7;
        this.f56083b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i7 = this.f56082a;
        Object obj = this.f56083b;
        switch (i7) {
            case 0:
                ((i) obj).f56103m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i10 = LimitPreviewView.f31464o0;
                limitPreviewView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    f10 = (floatValue / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f31468b0 = f10;
                return;
            case 2:
                p0 p0Var = (p0) obj;
                p0Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.f56768f.invalidate();
                o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
            case 3:
                ((q1) obj).f56805a.f56787o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                ((vg.e) obj).f57371a.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                wg.b bVar = (wg.b) obj;
                bVar.getClass();
                bVar.f57695b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            default:
                m3 m3Var = (m3) obj;
                m3Var.getClass();
                m3Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m3Var.j0();
                return;
        }
    }
}
