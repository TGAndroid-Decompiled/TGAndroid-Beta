package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class qr0 implements org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.c2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f36130a;

    public qr0(PhotoViewer photoViewer) {
        this.f36130a = photoViewer;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f36130a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f36130a;
        ir0 ir0Var = photoViewer.f30202v4;
        Rect rect = photoViewer.f30173s2;
        Rect rect2 = new Rect(rect);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10074a;
        int i11 = defaultWindowInsets.f10075b;
        int i12 = defaultWindowInsets.f10076c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f30130n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f30075h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f30105k4[0][2] = photoViewer.f30075h0.getTranslationX();
            }
            dv0 dv0Var = photoViewer.f30066g0;
            if (dv0Var != null) {
                dv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f30093j0;
        if (view2 != null) {
            photoViewer.f30101k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f30101k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f30093j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f30049e0.setPadding(defaultWindowInsets.f10074a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(ir0Var);
            if (photoViewer.e && photoViewer.f30130n4 == 0) {
                AndroidUtilities.runOnUIThread(ir0Var, 200L);
            }
        }
        return r0.l1.f41073b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        cv0 cv0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f36130a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f30162r1 && ((photoViewer.f30193u4 == 1 || (i11 = photoViewer.f30033c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.df0 df0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f30033c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                df0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f30231y4.getVisibility() == 0) {
                photoViewer.f30049e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (cv0Var = photoViewer.d) != null && cv0Var.J() && !photoViewer.f30106k5 && (i10 = photoViewer.f30033c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f36130a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }
}
