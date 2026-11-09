package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class sf implements ValueAnimator.AnimatorUpdateListener {
    public final int f49896a;
    public final float f49897b;
    public final Object f49898c;

    public sf(Object obj, float f10, int i7) {
        this.f49896a = i7;
        this.f49898c = obj;
        this.f49897b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        boolean z9;
        switch (this.f49896a) {
            case 0:
                cn cnVar = (cn) this.f49898c;
                cnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.V8 = floatValue;
                cnVar.Z8 = floatValue / this.f49897b;
                View view = cnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f49898c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f49897b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.bn) this.f49898c).E.setTranslationY(org.telegram.messenger.g0.T1(this.f49897b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((rr0) this.f49898c).R.setTranslationY(org.telegram.messenger.g0.T1(this.f49897b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                rx0 rx0Var = (rx0) this.f49898c;
                rx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f49897b, floatValue3);
                rx0Var.f49622a.setTranslationX(T1);
                rx0Var.f49623b.setTranslationX(T1);
                ImageView imageView = rx0Var.f49624c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = rx0Var.f49626f;
                if (org.telegram.messenger.id.f23157a0) {
                    i7 = org.telegram.messenger.g0.L(32.0f);
                } else {
                    i7 = -org.telegram.messenger.g0.L(32.0f);
                }
                woVar.setTranslationX(i7 + T1);
                float f10 = (floatValue3 * 0.5f) + 0.5f;
                woVar.setScaleX(f10);
                woVar.setScaleY(f10);
                woVar.setAlpha(floatValue3);
                float f11 = 1.0f - floatValue3;
                float f12 = (f11 * 0.5f) + 0.5f;
                imageView.setScaleX(f12);
                imageView.setScaleY(f12);
                imageView.setAlpha(f11);
                return;
            case 5:
                org.telegram.ui.Wallet.b4 b4Var = (org.telegram.ui.Wallet.b4) this.f49898c;
                b4Var.getClass();
                b4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f49897b) % 360.0f;
                b4Var.f42222a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) this.f49898c;
                n8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n8Var.f42900c = n8Var.c();
                n8Var.d = this.f49897b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                n8Var.f42905s = z9;
                return;
        }
    }
}
