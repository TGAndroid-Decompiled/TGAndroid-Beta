package wh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.zn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f46672a;
    public final float f46673b;
    public final n f46674c;
    public final View d;

    public h(n nVar, View view, float f10, int i10) {
        this.f46672a = i10;
        this.f46674c = nVar;
        this.d = view;
        this.f46673b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f46672a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f46674c;
                zn znVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - znVar.f40707p9) - znVar.f40810xa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f40707p9;
                if (h0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - h0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                h0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f46673b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f46674c;
                zn znVar2 = nVar2.F;
                wa waVar = (wa) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - znVar2.f40707p9) - znVar2.f40810xa) / 2.0f) - (waVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f40707p9;
                if (waVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - waVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                waVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f46673b));
                return;
        }
    }
}
