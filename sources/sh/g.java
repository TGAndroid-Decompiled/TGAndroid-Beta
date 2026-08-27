package sh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.rn;

public final class g implements ValueAnimator.AnimatorUpdateListener {

    public final int f47953a;

    public final float f47954b;

    public final m f47955c;
    public final View d;

    public g(m mVar, View view, float f10, int i10) {
        this.f47953a = i10;
        this.f47955c = mVar;
        this.d = view;
        this.f47954b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f47953a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f47955c;
                float measuredHeight = mVar.G.getMeasuredHeight();
                rn rnVar = mVar.F;
                float f10 = ((measuredHeight - rnVar.f42160o9) - rnVar.wa) / 2.0f;
                h0 h0Var = (h0) this.d;
                float measuredHeight2 = (f10 - (h0Var.getMeasuredHeight() / 2.0f)) + mVar.F.f42160o9;
                h0Var.setTranslationY(((((float) h0Var.getTop()) > measuredHeight2 ? measuredHeight2 - h0Var.getTop() : 0.0f) * fFloatValue) + ((1.0f - fFloatValue) * this.f47954b));
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f47955c;
                float measuredHeight3 = mVar2.G.getMeasuredHeight();
                rn rnVar2 = mVar2.F;
                float f11 = ((measuredHeight3 - rnVar2.f42160o9) - rnVar2.wa) / 2.0f;
                ua uaVar = (ua) this.d;
                float measuredHeight4 = (f11 - (uaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.f42160o9;
                uaVar.setTranslationY(((((float) uaVar.getTop()) > measuredHeight4 ? measuredHeight4 - uaVar.getTop() : 0.0f) * fFloatValue2) + ((1.0f - fFloatValue2) * this.f47954b));
                break;
        }
    }
}
