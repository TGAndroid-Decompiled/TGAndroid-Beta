package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class qn0 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.q1, org.telegram.ui.Components.bc0, org.telegram.messenger.jc, r0.m {
    public final PhotoViewer f51496a;

    public qn0(PhotoViewer photoViewer) {
        this.f51496a = photoViewer;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.f43272f9;
        this.f51496a.v2(z10, i7, i10, false, false, false);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        Drawable[] drawableArr = PhotoViewer.f43272f9;
        this.f51496a.d3(0);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f51496a;
        kn0 kn0Var = photoViewer.f43476v4;
        Rect rect = photoViewer.f43457t2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = l1Var.f56381a.f(647).d;
        int i10 = I0.f15978a;
        int i11 = I0.f15979b;
        int i12 = I0.f15980c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f43405n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f43360i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f43380k4[0][2] = photoViewer.f43360i0.getTranslationX();
            }
            vq0 vq0Var = photoViewer.f43352h0;
            if (vq0Var != null) {
                vq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f43376k0;
        if (view2 != null) {
            photoViewer.f43385l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f43385l0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f43376k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f43334f0.setPadding(i10, 0, i12, 0);
        if (photoViewer.G != null) {
            org.telegram.messenger.g0.r(kn0Var);
            if (photoViewer.f43322e && photoViewer.f43405n4 == 0) {
                org.telegram.messenger.g0.h3(kn0Var, 200L);
            }
        }
        return r0.l1.f56380b;
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        uq0 uq0Var;
        int i7;
        Bitmap n10;
        boolean z13;
        int i10;
        PhotoViewer photoViewer = this.f51496a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f43448s1 && ((photoViewer.f43467u4 == 1 || (i10 = photoViewer.d2) == 1 || i10 == 11) && photoViewer.D1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.qd0 qd0Var = photoViewer.D1;
                int i11 = imageReceiver.V;
                int i12 = photoViewer.d2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                qd0Var.b(n10, i11, z13, true, photoViewer.E1, null, null);
            }
            if (photoViewer.f43506y4.getVisibility() == 0) {
                photoViewer.f43334f0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (uq0Var = photoViewer.d) != null && uq0Var.K() && !photoViewer.f43381k5 && (i7 = photoViewer.d2) != 1 && i7 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.M2();
            }
        }
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }
}
