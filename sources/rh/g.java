package rh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.qn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f47232a;
    public final float f47233b;
    public final m f47234c;
    public final View d;

    public g(m mVar, View view, float f10, int i9) {
        this.f47232a = i9;
        this.f47234c = mVar;
        this.d = view;
        this.f47233b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f47232a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f47234c;
                qn qnVar = mVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((mVar.G.getMeasuredHeight() - qnVar.o9) - qnVar.f42123wa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + mVar.F.o9;
                if (h0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - h0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                h0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f47233b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f47234c;
                qn qnVar2 = mVar2.F;
                xa xaVar = (xa) this.d;
                float measuredHeight2 = ((((mVar2.G.getMeasuredHeight() - qnVar2.o9) - qnVar2.f42123wa) / 2.0f) - (xaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.o9;
                if (xaVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - xaVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                xaVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f47233b));
                return;
        }
    }
}
