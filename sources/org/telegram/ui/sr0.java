package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class sr0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f41984a;

    public sr0(PhotoViewer photoViewer) {
        this.f41984a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41984a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f41984a;
        kr0 kr0Var = photoViewer.f33896v4;
        Rect rect = photoViewer.f33867s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f11574a;
        int i11 = defaultWindowInsets.f11575b;
        int i12 = defaultWindowInsets.f11576c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f33824n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33769h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33799k4[0][2] = photoViewer.f33769h0.getTranslationX();
            }
            fv0 fv0Var = photoViewer.f33760g0;
            if (fv0Var != null) {
                fv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33787j0;
        if (view2 != null) {
            photoViewer.f33795k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f33795k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f33787j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33743e0.setPadding(defaultWindowInsets.f11574a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(kr0Var);
            if (photoViewer.f33742e && photoViewer.f33824n4 == 0) {
                AndroidUtilities.runOnUIThread(kr0Var, 200L);
            }
        }
        return r0.k1.f46999b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ev0 ev0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f41984a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f33856r1 && ((photoViewer.f33887u4 == 1 || (i11 = photoViewer.f33726c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.zf0 zf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f33726c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f33925y4.getVisibility() == 0) {
                photoViewer.f33743e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (ev0Var = photoViewer.d) != null && ev0Var.J() && !photoViewer.f33800k5 && (i10 = photoViewer.f33726c2) != 1 && i10 != 11) {
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
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f41984a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }
}
