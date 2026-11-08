package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class sf implements ValueAnimator.AnimatorUpdateListener {
    public final int f49747a;
    public final float f49748b;
    public final Object f49749c;

    public sf(Object obj, float f10, int i7) {
        this.f49747a = i7;
        this.f49749c = obj;
        this.f49748b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        boolean z9;
        switch (this.f49747a) {
            case 0:
                an anVar = (an) this.f49749c;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.V8 = floatValue;
                anVar.Z8 = floatValue / this.f49748b;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f49749c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f49748b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.bn) this.f49749c).E.setTranslationY(org.telegram.messenger.g0.T1(this.f49748b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((pr0) this.f49749c).R.setTranslationY(org.telegram.messenger.g0.T1(this.f49748b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                nx0 nx0Var = (nx0) this.f49749c;
                nx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f49748b, floatValue3);
                nx0Var.f48158a.setTranslationX(T1);
                nx0Var.f48159b.setTranslationX(T1);
                ImageView imageView = nx0Var.f48160c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = nx0Var.f48162f;
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
                org.telegram.ui.Wallet.c4 c4Var = (org.telegram.ui.Wallet.c4) this.f49749c;
                c4Var.getClass();
                c4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f49748b) % 360.0f;
                c4Var.f42308a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.o8 o8Var = (org.telegram.ui.Wallet.o8) this.f49749c;
                o8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.f42982c = o8Var.c();
                o8Var.d = this.f49748b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o8Var.f42987s = z9;
                return;
        }
    }
}
