package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class qn0 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.r1, org.telegram.messenger.jc, r0.m {
    public final PhotoViewer f51296a;

    public qn0(PhotoViewer photoViewer) {
        this.f51296a = photoViewer;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.f51296a.u2(z10, i7, i10, false, false, false);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f51296a;
        hn0 hn0Var = photoViewer.f43350v4;
        Rect rect = photoViewer.f43331t2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = l1Var.f56258a.f(647).d;
        int i10 = I0.f15892a;
        int i11 = I0.f15893b;
        int i12 = I0.f15894c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f43279n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f43234i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f43254k4[0][2] = photoViewer.f43234i0.getTranslationX();
            }
            vq0 vq0Var = photoViewer.f43226h0;
            if (vq0Var != null) {
                vq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f43250k0;
        if (view2 != null) {
            photoViewer.f43259l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f43259l0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f43250k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f43208f0.setPadding(i10, 0, i12, 0);
        if (photoViewer.G != null) {
            org.telegram.messenger.g0.r(hn0Var);
            if (photoViewer.f43197e && photoViewer.f43279n4 == 0) {
                org.telegram.messenger.g0.h3(hn0Var, 200L);
            }
        }
        return r0.l1.f56257b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.f51296a.c3(0);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        uq0 uq0Var;
        int i7;
        Bitmap n10;
        boolean z13;
        int i10;
        PhotoViewer photoViewer = this.f51296a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f43322s1 && ((photoViewer.f43341u4 == 1 || (i10 = photoViewer.d2) == 1 || i10 == 11) && photoViewer.D1 != null && (n10 = imageReceiver.n()) != null)) {
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
            if (photoViewer.f43380y4.getVisibility() == 0) {
                photoViewer.f43208f0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (uq0Var = photoViewer.d) != null && uq0Var.K() && !photoViewer.f43255k5 && (i7 = photoViewer.d2) != 1 && i7 != 11) {
            if (!photoViewer.T5) {
                photoViewer.U5 = true;
            } else {
                photoViewer.L2();
            }
        }
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
