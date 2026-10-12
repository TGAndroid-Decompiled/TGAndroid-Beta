package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class wr0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, r0.o {
    public final PhotoViewer f41639a;

    public wr0(PhotoViewer photoViewer) {
        this.f41639a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41639a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f41639a;
        or0 or0Var = photoViewer.f32380v4;
        Rect rect = photoViewer.f32351s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10888a;
        int i11 = defaultWindowInsets.f10889b;
        int i12 = defaultWindowInsets.f10890c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f32308n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f32252h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f32283k4[0][2] = photoViewer.f32252h0.getTranslationX();
            }
            jv0 jv0Var = photoViewer.f32243g0;
            if (jv0Var != null) {
                jv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f32270j0;
        if (view2 != null) {
            photoViewer.f32279k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f32279k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f32270j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f32226e0.setPadding(defaultWindowInsets.f10888a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(or0Var);
            if (photoViewer.e && photoViewer.f32308n4 == 0) {
                AndroidUtilities.runOnUIThread(or0Var, 200L);
            }
        }
        return r0.l1.f43740b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        iv0 iv0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f41639a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f32340r1 && ((photoViewer.f32371u4 == 1 || (i11 = photoViewer.f32210c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.tf0 tf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f32210c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                tf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f32409y4.getVisibility() == 0) {
                photoViewer.f32226e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (iv0Var = photoViewer.d) != null && iv0Var.J() && !photoViewer.f32284k5 && (i10 = photoViewer.f32210c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41639a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }
}
