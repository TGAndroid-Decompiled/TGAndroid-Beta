package pi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.an;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f55090a;
    public final float f55091b;
    public final k f55092c;
    public final View d;

    public g(k kVar, View view, float f10, int i7) {
        this.f55090a = i7;
        this.f55092c = kVar;
        this.d = view;
        this.f55091b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f55090a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar = this.f55092c;
                an anVar = kVar.F;
                f0 f0Var = (f0) this.d;
                float measuredHeight = ((((kVar.G.getMeasuredHeight() - anVar.O9) - anVar.Xa) / 2.0f) - (f0Var.getMeasuredHeight() / 2.0f)) + kVar.F.O9;
                if (f0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - f0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                f0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f55091b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k kVar2 = this.f55092c;
                an anVar2 = kVar2.F;
                ra raVar = (ra) this.d;
                float measuredHeight2 = ((((kVar2.G.getMeasuredHeight() - anVar2.O9) - anVar2.Xa) / 2.0f) - (raVar.getMeasuredHeight() / 2.0f)) + kVar2.F.O9;
                if (raVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - raVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                raVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f55091b));
                return;
        }
    }
}
