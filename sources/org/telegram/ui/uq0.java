package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class uq0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.c2, ImageReceiver.ImageReceiverDelegate, r0.o {
    public final PhotoViewer f38990a;

    public uq0(PhotoViewer photoViewer) {
        this.f38990a = photoViewer;
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.f38990a.w2(z4, i10, i11, false, false, false);
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        PhotoViewer photoViewer = this.f38990a;
        mq0 mq0Var = photoViewer.f31863s4;
        Rect rect = photoViewer.f31832p2;
        Rect rect2 = new Rect(rect);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7213a;
        int i11 = defaultWindowInsets.f7214b;
        int i12 = defaultWindowInsets.f7215c;
        rect.set(i10, i11, i12, defaultWindowInsets.d);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f31790k4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f31732e0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f31763h4[0][2] = photoViewer.f31732e0.getTranslationX();
            }
            iu0 iu0Var = photoViewer.f31723d0;
            if (iu0Var != null) {
                iu0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f31750g0;
        if (view2 != null) {
            photoViewer.f31759h0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f31759h0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f31750g0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f31705b0.setPadding(defaultWindowInsets.f7213a, 0, i12, 0);
        if (photoViewer.C != null) {
            AndroidUtilities.cancelRunOnUIThread(mq0Var);
            if (photoViewer.e && photoViewer.f31790k4 == 0) {
                AndroidUtilities.runOnUIThread(mq0Var, 200L);
            }
        }
        return r0.m1.f43129b;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        hu0 hu0Var;
        int i10;
        Bitmap bitmap;
        boolean z12;
        int i11;
        PhotoViewer photoViewer = this.f38990a;
        if (imageReceiver == photoViewer.z4 && z4 && !z10) {
            if (!photoViewer.f31822o1 && ((photoViewer.f31853r4 == 1 || (i11 = photoViewer.Z1) == 1 || i11 == 11) && photoViewer.f31924z1 != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                org.telegram.ui.Components.ye0 ye0Var = photoViewer.f31924z1;
                int orientation = imageReceiver.getOrientation();
                int i12 = photoViewer.Z1;
                if (i12 != 1 && i12 != 11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ye0Var.b(bitmap, orientation, z12, true, photoViewer.A1, null, null);
            }
            if (photoViewer.f31888v4.getVisibility() == 0) {
                photoViewer.f31705b0.requestLayout();
            }
            photoViewer.Q0();
        }
        if (imageReceiver == photoViewer.z4 && z4 && (hu0Var = photoViewer.d) != null && hu0Var.J() && !photoViewer.f31764h5 && (i10 = photoViewer.Z1) != 1 && i10 != 11) {
            if (!photoViewer.Q5) {
                photoViewer.R5 = true;
            } else {
                photoViewer.N2();
            }
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.Q8;
        this.f38990a.e3(0);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }
}
