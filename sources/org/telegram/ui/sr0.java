package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class sr0 implements org.telegram.ui.Components.b5, org.telegram.ui.ActionBar.b2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f37546a;

    public sr0(PhotoViewer photoViewer) {
        this.f37546a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f37546a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f37546a;
        kr0 kr0Var = photoViewer.f31103v4;
        Rect rect = photoViewer.f31074s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10591a;
        int i11 = defaultWindowInsets.f10592b;
        int i12 = defaultWindowInsets.f10593c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f31031n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f30976h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f31006k4[0][2] = photoViewer.f30976h0.getTranslationX();
            }
            ev0 ev0Var = photoViewer.f30967g0;
            if (ev0Var != null) {
                ev0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f30994j0;
        if (view2 != null) {
            photoViewer.f31002k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f31002k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f30994j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f30950e0.setPadding(defaultWindowInsets.f10591a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
            if (photoViewer.e && photoViewer.f31031n4 == 0) {
                AndroidUtilities.runOnUIThread(kr0Var, 200L);
            }
        }
        return r0.l1.f41876b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        dv0 dv0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f37546a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f31063r1 && ((photoViewer.f31094u4 == 1 || (i11 = photoViewer.f30934c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f30934c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ue0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f31132y4.getVisibility() == 0) {
                photoViewer.f30950e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (dv0Var = photoViewer.d) != null && dv0Var.J() && !photoViewer.f31007k5 && (i10 = photoViewer.f30934c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f37546a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
