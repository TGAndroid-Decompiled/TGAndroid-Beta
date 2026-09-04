package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class qr0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f39975a;

    public qr0(PhotoViewer photoViewer) {
        this.f39975a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f39975a.w2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f39975a;
        ir0 ir0Var = photoViewer.f33702v4;
        Rect rect = photoViewer.f33673s2;
        Rect rect2 = new Rect(rect);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f11425a;
        int i11 = defaultWindowInsets.f11426b;
        int i12 = defaultWindowInsets.f11427c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f33630n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33575h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33605k4[0][2] = photoViewer.f33575h0.getTranslationX();
            }
            bv0 bv0Var = photoViewer.f33566g0;
            if (bv0Var != null) {
                bv0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33593j0;
        if (view2 != null) {
            photoViewer.f33601k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f33601k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f33593j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33549e0.setPadding(defaultWindowInsets.f11425a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(ir0Var);
            if (photoViewer.f33548e && photoViewer.f33630n4 == 0) {
                AndroidUtilities.runOnUIThread(ir0Var, 200L);
            }
        }
        return r0.l1.f44710b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        av0 av0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f39975a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f33662r1 && ((photoViewer.f33693u4 == 1 || (i11 = photoViewer.f33532c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ue0 ue0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f33532c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ue0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f33731y4.getVisibility() == 0) {
                photoViewer.f33549e0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (av0Var = photoViewer.d) != null && av0Var.J() && !photoViewer.f33606k5 && (i10 = photoViewer.f33532c2) != 1 && i10 != 11) {
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.T8;
        this.f39975a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }
}
