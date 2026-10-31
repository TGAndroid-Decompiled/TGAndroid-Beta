package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class yo0 implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, org.telegram.messenger.mc, r0.m {
    public final PhotoViewer f43876a;

    public yo0(PhotoViewer photoViewer) {
        this.f43876a = photoViewer;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f43876a.z2(z10, i10, i11, false, false, false);
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        PhotoViewer photoViewer = this.f43876a;
        qo0 qo0Var = photoViewer.f33624v4;
        Rect rect = photoViewer.f33595s2;
        Rect rect2 = new Rect(rect);
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = j1Var.f46132a.f(647).d;
        int i11 = I0.f7765a;
        int i12 = I0.f7766b;
        int i13 = I0.f7767c;
        rect.set(i11, i12, i13, i10);
        if (!rect2.equals(rect)) {
            int i14 = photoViewer.f33552n4;
            if (i14 == 1 || i14 == 3) {
                ClippingImageView clippingImageView = photoViewer.f33496h0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f33527k4[0][2] = photoViewer.f33496h0.getTranslationX();
            }
            fs0 fs0Var = photoViewer.f33487g0;
            if (fs0Var != null) {
                fs0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f33514j0;
        if (view2 != null) {
            photoViewer.f33523k0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i15 = photoViewer.f33523k0;
            marginLayoutParams.height = i15;
            marginLayoutParams.bottomMargin = (-i15) / 2;
            photoViewer.f33514j0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f33470e0.setPadding(i11, 0, i13, 0);
        if (photoViewer.F != null) {
            org.telegram.messenger.i0.r(qo0Var);
            if (photoViewer.e && photoViewer.f33552n4 == 0) {
                org.telegram.messenger.i0.h3(qo0Var, 200L);
            }
        }
        return r0.j1.f46131b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        Drawable[] drawableArr = PhotoViewer.U8;
        this.f43876a.h3(0);
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        es0 es0Var;
        int i10;
        Bitmap n10;
        boolean z13;
        int i11;
        PhotoViewer photoViewer = this.f43876a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f33584r1 && ((photoViewer.f33615u4 == 1 || (i11 = photoViewer.f33454c2) == 1 || i11 == 11) && photoViewer.C1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                int i12 = imageReceiver.U;
                int i13 = photoViewer.f33454c2;
                if (i13 != 1 && i13 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                be0Var.b(n10, i12, z13, true, photoViewer.D1, null, null);
            }
            if (photoViewer.f33653y4.getVisibility() == 0) {
                photoViewer.f33470e0.requestLayout();
            }
            photoViewer.R0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (es0Var = photoViewer.d) != null && es0Var.K() && !photoViewer.f33528k5 && (i10 = photoViewer.f33454c2) != 1 && i10 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.Q2();
            }
        }
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }
}
