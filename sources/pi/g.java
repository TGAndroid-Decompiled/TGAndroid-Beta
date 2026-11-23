package pi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.bn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f55676a;
    public final float f55677b;
    public final k f55678c;
    public final View d;

    public g(k kVar, View view, float f10, int i7) {
        this.f55676a = i7;
        this.f55678c = kVar;
        this.d = view;
        this.f55677b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f55676a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f55678c;
                bn bnVar = kVar.F;
                g0 g0Var = (g0) this.d;
                float measuredHeight = ((((kVar.G.getMeasuredHeight() - bnVar.P9) - bnVar.Ya) / 2.0f) - (g0Var.getMeasuredHeight() / 2.0f)) + kVar.F.P9;
                if (g0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - g0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                g0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f55677b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f55678c;
                bn bnVar2 = kVar2.F;
                ta taVar = (ta) this.d;
                float measuredHeight2 = ((((kVar2.G.getMeasuredHeight() - bnVar2.P9) - bnVar2.Ya) / 2.0f) - (taVar.getMeasuredHeight() / 2.0f)) + kVar2.F.P9;
                if (taVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - taVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                taVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f55677b));
                return;
        }
    }
}
