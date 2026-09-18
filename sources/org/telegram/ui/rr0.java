package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class rr0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f37125a;

    public rr0(PhotoViewer photoViewer) {
        this.f37125a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f37125a.v2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.f37125a;
        jr0 jr0Var = photoViewer.f31334v4;
        Rect rect = photoViewer.f31305s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f10591a;
        int i11 = defaultWindowInsets.f10592b;
        int i12 = defaultWindowInsets.f10593c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f31262n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f31207h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f31237k4[0][2] = photoViewer.f31207h0.getTranslationX();
            }
            cv0 cv0Var = photoViewer.f31198g0;
            if (cv0Var != null) {
                cv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f31225j0;
        if (view2 != null) {
            photoViewer.f31233k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f31233k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f31225j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f31181e0.setPadding(defaultWindowInsets.f10591a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(jr0Var);
            if (photoViewer.e && photoViewer.f31262n4 == 0) {
                AndroidUtilities.runOnUIThread(jr0Var, 200L);
            }
        }
        return r0.m1.f42108b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bv0 bv0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f37125a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f31294r1 && ((photoViewer.f31325u4 == 1 || (i11 = photoViewer.f31165c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f31165c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                df0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f31363y4.getVisibility() == 0) {
                photoViewer.f31181e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (bv0Var = photoViewer.d) != null && bv0Var.J() && !photoViewer.f31238k5 && (i10 = photoViewer.f31165c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.M2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f37125a.d3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
