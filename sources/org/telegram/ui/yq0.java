package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class yq0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.a2, ImageReceiver.ImageReceiverDelegate, r0.n {
    public final PhotoViewer f43542a;

    public yq0(PhotoViewer photoViewer) {
        this.f43542a = photoViewer;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        PhotoViewer photoViewer = this.f43542a;
        qq0 qq0Var = photoViewer.f33436v4;
        Rect rect = photoViewer.f33407s2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.f12283a;
        int i11 = defaultWindowInsets.f12284b;
        int i12 = defaultWindowInsets.f12285c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f33364n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33308h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33339k4[0][2] = photoViewer.f33308h0.getTranslationX();
            }
            iu0 iu0Var = photoViewer.f33299g0;
            if (iu0Var != null) {
                iu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33326j0;
        if (view2 != null) {
            photoViewer.f33335k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f33335k0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f33326j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33282e0.setPadding(defaultWindowInsets.f12283a, 0, i12, 0);
        if (photoViewer.F != null) {
            AndroidUtilities.cancelRunOnUIThread(qq0Var);
            if (photoViewer.e && photoViewer.f33364n4 == 0) {
                AndroidUtilities.runOnUIThread(qq0Var, 200L);
            }
        }
        return r0.k1.f44837b;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f43542a.y2(z10, i10, i11, false, false, false);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hu0 hu0Var;
        int i10;
        Bitmap bitmap;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f43542a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f33396r1 && ((photoViewer.f33427u4 == 1 || (i11 = photoViewer.f33266c2) == 1 || i11 == 11) && photoViewer.C1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.f33266c2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                of0Var.b(bitmap, orientation, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f33465y4.getVisibility() == 0) {
                photoViewer.f33282e0.requestLayout();
            }
            photoViewer.S0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (hu0Var = photoViewer.d) != null && hu0Var.K() && !photoViewer.f33340k5 && (i10 = photoViewer.f33266c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.P2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f43542a.g3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }
}
