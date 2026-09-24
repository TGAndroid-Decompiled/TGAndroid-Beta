package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class zq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f40555a;
    public final PhotoViewer f40556b;

    public zq0(PhotoViewer photoViewer, int i10) {
        this.f40555a = i10;
        this.f40556b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f40555a;
        PhotoViewer photoViewer = this.f40556b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31247i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f23931b.f14308a;
                float lerp = AndroidUtilities.lerp(photoViewer.f31177a6, photoViewer.f31215e6, photoViewer.f31274l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f31197c6, photoViewer.f31274l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f31206d6, photoViewer.f31274l6);
                cropAreaView.f22228n0 = 0.0f;
                cropAreaView.f22229o0 = lerp;
                cropAreaView.f22230p0 = lerp2;
                cropAreaView.f22231q0 = lerp3;
                cropAreaView.invalidate();
                return;
            case 2:
                photoViewer.L1.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31282m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.r3();
                return;
            case 6:
                photoViewer.L1.u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                st0 st0Var = photoViewer.L1;
                if (st0Var != null) {
                    st0Var.f41761d1.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                st0 st0Var2 = photoViewer.L1;
                if (st0Var2 != null && Math.abs(floatValue - st0Var2.X1) > 0.1f) {
                    st0Var2.X1 = floatValue;
                    st0Var2.w0(st0Var2.I0, st0Var2.J0, st0Var2.K0, st0Var2.N0, st0Var2.O0);
                }
                photoViewer.f31209e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.F1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f31282m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
