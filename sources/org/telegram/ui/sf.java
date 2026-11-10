package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class sf implements ValueAnimator.AnimatorUpdateListener {
    public final int f49847a;
    public final float f49848b;
    public final Object f49849c;

    public sf(Object obj, float f10, int i7) {
        this.f49847a = i7;
        this.f49849c = obj;
        this.f49848b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        boolean z9;
        switch (this.f49847a) {
            case 0:
                cn cnVar = (cn) this.f49849c;
                cnVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cnVar.V8 = floatValue;
                cnVar.Z8 = floatValue / this.f49848b;
                View view = cnVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f49849c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f49848b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.an) this.f49849c).E.setTranslationY(org.telegram.messenger.g0.T1(this.f49848b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((sr0) this.f49849c).R.setTranslationY(org.telegram.messenger.g0.T1(this.f49848b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                sx0 sx0Var = (sx0) this.f49849c;
                sx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f49848b, floatValue3);
                sx0Var.f49979a.setTranslationX(T1);
                sx0Var.f49980b.setTranslationX(T1);
                ImageView imageView = sx0Var.f49981c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = sx0Var.f49983f;
                if (org.telegram.messenger.id.f23161a0) {
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
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f49849c;
                d4Var.getClass();
                d4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f49848b) % 360.0f;
                d4Var.f42302a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.q8 q8Var = (org.telegram.ui.Wallet.q8) this.f49849c;
                q8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.f43076c = q8Var.c();
                q8Var.d = this.f49848b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                q8Var.f43081s = z9;
                return;
        }
    }
}
