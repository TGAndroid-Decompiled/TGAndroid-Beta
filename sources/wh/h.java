package wh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.xn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f46603a;
    public final float f46604b;
    public final n f46605c;
    public final View d;

    public h(n nVar, View view, float f10, int i10) {
        this.f46603a = i10;
        this.f46605c = nVar;
        this.d = view;
        this.f46604b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f46603a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f46605c;
                xn xnVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - xnVar.f40141p9) - xnVar.f40244xa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f40141p9;
                if (h0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - h0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                h0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f46604b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f46605c;
                xn xnVar2 = nVar2.F;
                xa xaVar = (xa) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - xnVar2.f40141p9) - xnVar2.f40244xa) / 2.0f) - (xaVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f40141p9;
                if (xaVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - xaVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                xaVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f46604b));
                return;
        }
    }
}
