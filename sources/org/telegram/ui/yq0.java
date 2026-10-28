package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class yq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f46070a;
    public final PhotoViewer f46071b;

    public yq0(PhotoViewer photoViewer, int i10) {
        this.f46070a = i10;
        this.f46071b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f46070a;
        PhotoViewer photoViewer = this.f46071b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35708i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f31597b.f18842a;
                float lerp = AndroidUtilities.lerp(photoViewer.f35638a6, photoViewer.f35676e6, photoViewer.f35736l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f35658c6, photoViewer.f35736l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f35667d6, photoViewer.f35736l6);
                cropAreaView.f26139n0 = 0.0f;
                cropAreaView.f26140o0 = lerp;
                cropAreaView.f26141p0 = lerp2;
                cropAreaView.f26142q0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35744m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.v3();
                return;
            case 6:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                pt0 pt0Var = photoViewer.L1;
                if (pt0Var != null) {
                    pt0Var.S0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                pt0 pt0Var2 = photoViewer.L1;
                if (pt0Var2 != null && Math.abs(floatValue - pt0Var2.M1) > 0.1f) {
                    pt0Var2.M1 = floatValue;
                    pt0Var2.u0(pt0Var2.f48390x0, pt0Var2.f48392y0, pt0Var2.f48394z0, pt0Var2.C0, pt0Var2.D0);
                }
                photoViewer.f35670e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.f35744m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.I1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35744m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35744m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35744m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
