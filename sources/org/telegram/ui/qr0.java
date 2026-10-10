package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class qr0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f41215a;

    public qr0(PhotoViewer photoViewer) {
        this.f41215a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41215a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f41215a;
        ir0 ir0Var = photoViewer.f34095v4;
        Rect rect = photoViewer.f34066s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f11576a;
        int i11 = defaultWindowInsets.f11577b;
        int i12 = defaultWindowInsets.f11578c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f34023n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33968h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33998k4[0][2] = photoViewer.f33968h0.getTranslationX();
            }
            dv0 dv0Var = photoViewer.f33959g0;
            if (dv0Var != null) {
                dv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33986j0;
        if (view2 != null) {
            photoViewer.f33994k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f33994k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f33986j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33942e0.setPadding(defaultWindowInsets.f11576a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(ir0Var);
            if (photoViewer.f33941e && photoViewer.f34023n4 == 0) {
                AndroidUtilities.runOnUIThread(ir0Var, 200L);
            }
        }
        return r0.k1.f46820b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        cv0 cv0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f41215a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f34055r1 && ((photoViewer.f34086u4 == 1 || (i11 = photoViewer.f33925c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.xf0 xf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f33925c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                xf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f34124y4.getVisibility() == 0) {
                photoViewer.f33942e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (cv0Var = photoViewer.d) != null && cv0Var.J() && !photoViewer.f33999k5 && (i10 = photoViewer.f33925c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41215a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}
