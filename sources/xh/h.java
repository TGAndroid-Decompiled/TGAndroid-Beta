package xh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.xn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f50622a;
    public final float f50623b;
    public final n f50624c;
    public final View d;

    public h(n nVar, View view, float f10, int i10) {
        this.f50622a = i10;
        this.f50624c = nVar;
        this.d = view;
        this.f50623b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f50622a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f50624c;
                xn xnVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - xnVar.f43310p9) - xnVar.f43413xa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f43310p9;
                if (h0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - h0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                h0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f50623b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f50624c;
                xn xnVar2 = nVar2.F;
                xa xaVar = (xa) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - xnVar2.f43310p9) - xnVar2.f43413xa) / 2.0f) - (xaVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f43310p9;
                if (xaVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - xaVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                xaVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f50623b));
                return;
        }
    }
}
