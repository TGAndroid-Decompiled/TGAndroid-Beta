package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class wq0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45539a;
    public final PhotoViewer f45540b;

    public wq0(PhotoViewer photoViewer, int i10) {
        this.f45539a = i10;
        this.f45540b = photoViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f45539a;
        PhotoViewer photoViewer = this.f45540b;
        switch (i10) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35681i3.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                CropAreaView cropAreaView = photoViewer.C1.f31283b.f18843a;
                float lerp = AndroidUtilities.lerp(photoViewer.f35611a6, photoViewer.f35649e6, photoViewer.f35709l6);
                float lerp2 = AndroidUtilities.lerp(photoViewer.X5, photoViewer.f35631c6, photoViewer.f35709l6);
                float lerp3 = AndroidUtilities.lerp(photoViewer.Y5, photoViewer.f35640d6, photoViewer.f35709l6);
                cropAreaView.f26135n0 = 0.0f;
                cropAreaView.f26136o0 = lerp;
                cropAreaView.f26137p0 = lerp2;
                cropAreaView.f26138q0 = lerp3;
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
                photoViewer.f35717m6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer.u3();
                return;
            case 6:
                photoViewer.L1.s0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                photoViewer.L1.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                nt0 nt0Var = photoViewer.L1;
                if (nt0Var != null) {
                    nt0Var.S0.invalidate();
                    return;
                }
                return;
            case 9:
                Drawable[] drawableArr4 = PhotoViewer.U8;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.Z5 = floatValue;
                nt0 nt0Var2 = photoViewer.L1;
                if (nt0Var2 != null && Math.abs(floatValue - nt0Var2.M1) > 0.1f) {
                    nt0Var2.M1 = floatValue;
                    nt0Var2.u0(nt0Var2.f48361x0, nt0Var2.f48363y0, nt0Var2.f48365z0, nt0Var2.C0, nt0Var2.D0);
                }
                photoViewer.f35643e0.invalidate();
                return;
            case 10:
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer.f35717m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.H1();
                return;
            case 11:
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35717m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 12:
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35717m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 13:
                photoViewer.W0[0].e(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                return;
            default:
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer.getClass();
                photoViewer.f35717m6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
        }
    }
}
