package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class sf implements ValueAnimator.AnimatorUpdateListener {
    public final int f49736a;
    public final float f49737b;
    public final Object f49738c;

    public sf(Object obj, float f10, int i7) {
        this.f49736a = i7;
        this.f49738c = obj;
        this.f49737b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7;
        boolean z9;
        switch (this.f49736a) {
            case 0:
                an anVar = (an) this.f49738c;
                anVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.V8 = floatValue;
                anVar.Z8 = floatValue / this.f49737b;
                View view = anVar.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f49738c;
                float floatValue2 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    View view2 = (View) arrayList.get(i10);
                    if (view2 != null) {
                        view2.setTranslationY(this.f49737b * floatValue2);
                    }
                }
                return;
            case 2:
                ((org.telegram.ui.Components.bn) this.f49738c).E.setTranslationY(org.telegram.messenger.g0.T1(this.f49737b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 3:
                ((or0) this.f49738c).R.setTranslationY(org.telegram.messenger.g0.T1(this.f49737b, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                return;
            case 4:
                nx0 nx0Var = (nx0) this.f49738c;
                nx0Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float T1 = org.telegram.messenger.g0.T1(0.0f, this.f49737b, floatValue3);
                nx0Var.f48130a.setTranslationX(T1);
                nx0Var.f48131b.setTranslationX(T1);
                ImageView imageView = nx0Var.f48132c;
                imageView.setTranslationX(T1);
                org.telegram.ui.Components.wo woVar = nx0Var.f48134f;
                if (org.telegram.messenger.hd.f22871a0) {
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
                org.telegram.ui.Wallet.d4 d4Var = (org.telegram.ui.Wallet.d4) this.f49738c;
                d4Var.getClass();
                d4Var.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + this.f49737b) % 360.0f;
                d4Var.f42313a.invalidate();
                return;
            default:
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) this.f49738c;
                p8Var.getClass();
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p8Var.f42996c = p8Var.c();
                p8Var.d = this.f49737b * floatValue4;
                if (floatValue4 > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                p8Var.f43001s = z9;
                return;
        }
    }
}
