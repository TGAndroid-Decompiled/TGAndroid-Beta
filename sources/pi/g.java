package pi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.bn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f55789a;
    public final float f55790b;
    public final k f55791c;
    public final View d;

    public g(k kVar, View view, float f10, int i7) {
        this.f55789a = i7;
        this.f55791c = kVar;
        this.d = view;
        this.f55790b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f55789a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f55791c;
                bn bnVar = kVar.F;
                g0 g0Var = (g0) this.d;
                float measuredHeight = ((((kVar.G.getMeasuredHeight() - bnVar.P9) - bnVar.Ya) / 2.0f) - (g0Var.getMeasuredHeight() / 2.0f)) + kVar.F.P9;
                if (g0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - g0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                g0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f55790b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f55791c;
                bn bnVar2 = kVar2.F;
                ua uaVar = (ua) this.d;
                float measuredHeight2 = ((((kVar2.G.getMeasuredHeight() - bnVar2.P9) - bnVar2.Ya) / 2.0f) - (uaVar.getMeasuredHeight() / 2.0f)) + kVar2.F.P9;
                if (uaVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - uaVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                uaVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f55790b));
                return;
        }
    }
}
