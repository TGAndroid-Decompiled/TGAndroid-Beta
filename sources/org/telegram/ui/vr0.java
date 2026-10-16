package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class vr0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.z1, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f40755a;

    public vr0(PhotoViewer photoViewer) {
        this.f40755a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f40755a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f40755a;
        mr0 mr0Var = photoViewer.f32082v4;
        Rect rect = photoViewer.f32053s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10892a;
        int i11 = defaultWindowInsets.f10893b;
        int i12 = defaultWindowInsets.f10894c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f32010n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f31954h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f31985k4[0][2] = photoViewer.f31954h0.getTranslationX();
            }
            iv0 iv0Var = photoViewer.f31945g0;
            if (iv0Var != null) {
                iv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f31972j0;
        if (view2 != null) {
            photoViewer.f31981k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f31981k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f31972j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f31928e0.setPadding(defaultWindowInsets.f10892a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(mr0Var);
            if (photoViewer.e && photoViewer.f32010n4 == 0) {
                AndroidUtilities.runOnUIThread(mr0Var, 200L);
            }
        }
        return r0.l1.f43496b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hv0 hv0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f40755a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f32042r1 && ((photoViewer.f32073u4 == 1 || (i11 = photoViewer.f31912c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.uf0 uf0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f31912c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                uf0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f32111y4.getVisibility() == 0) {
                photoViewer.f31928e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (hv0Var = photoViewer.d) != null && hv0Var.K() && !photoViewer.f31986k5 && (i10 = photoViewer.f31912c2) != 1 && i10 != 11) {
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
        this.f40755a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }
}
