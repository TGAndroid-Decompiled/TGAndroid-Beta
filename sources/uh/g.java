package uh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.tn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f49269a;
    public final float f49270b;
    public final m f49271c;
    public final View d;

    public g(m mVar, View view, float f9, int i10) {
        this.f49269a = i10;
        this.f49271c = mVar;
        this.d = view;
        this.f49270b = f9;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f9;
        float f10;
        switch (this.f49269a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f49271c;
                tn tnVar = mVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((mVar.G.getMeasuredHeight() - tnVar.f42921o9) - tnVar.f43023wa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + mVar.F.f42921o9;
                if (h0Var.getTop() > measuredHeight) {
                    f9 = measuredHeight - h0Var.getTop();
                } else {
                    f9 = 0.0f;
                }
                h0Var.setTranslationY((f9 * floatValue) + ((1.0f - floatValue) * this.f49270b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f49271c;
                tn tnVar2 = mVar2.F;
                ua uaVar = (ua) this.d;
                float measuredHeight2 = ((((mVar2.G.getMeasuredHeight() - tnVar2.f42921o9) - tnVar2.f43023wa) / 2.0f) - (uaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.f42921o9;
                if (uaVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - uaVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                uaVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f49270b));
                return;
        }
    }
}
