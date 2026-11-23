package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.ClippingImageView;
public final class qn0 implements org.telegram.ui.Components.a5, org.telegram.ui.ActionBar.q1, org.telegram.messenger.kc, r0.m {
    public final PhotoViewer f51247a;

    public qn0(PhotoViewer photoViewer) {
        this.f51247a = photoViewer;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.f51247a.u2(z10, i7, i10, false, false, false);
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        PhotoViewer photoViewer = this.f51247a;
        hn0 hn0Var = photoViewer.f43360v4;
        Rect rect = photoViewer.f43341t2;
        Rect rect2 = new Rect(rect);
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = l1Var.f56268a.f(647).d;
        int i10 = I0.f15883a;
        int i11 = I0.f15884b;
        int i12 = I0.f15885c;
        rect.set(i10, i11, i12, i7);
        if (!rect2.equals(rect)) {
            int i13 = photoViewer.f43289n4;
            if (i13 == 1 || i13 == 3) {
                ClippingImageView clippingImageView = photoViewer.f43244i0;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - rect.left);
                photoViewer.f43264k4[0][2] = photoViewer.f43244i0.getTranslationX();
            }
            wq0 wq0Var = photoViewer.f43236h0;
            if (wq0Var != null) {
                wq0Var.requestLayout();
            }
        }
        View view2 = photoViewer.f43260k0;
        if (view2 != null) {
            photoViewer.f43269l0 = rect.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i14 = photoViewer.f43269l0;
            marginLayoutParams.height = i14;
            marginLayoutParams.bottomMargin = (-i14) / 2;
            photoViewer.f43260k0.setLayoutParams(marginLayoutParams);
        }
        photoViewer.f43218f0.setPadding(i10, 0, i12, 0);
        if (photoViewer.G != null) {
            org.telegram.messenger.g0.r(hn0Var);
            if (photoViewer.f43207e && photoViewer.f43289n4 == 0) {
                org.telegram.messenger.g0.h3(hn0Var, 200L);
            }
        }
        return r0.l1.f56267b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        Drawable[] drawableArr = PhotoViewer.Z8;
        this.f51247a.c3(0);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        vq0 vq0Var;
        int i7;
        Bitmap n10;
        boolean z13;
        int i10;
        PhotoViewer photoViewer = this.f51247a;
        if (imageReceiver == photoViewer.C4 && z10 && !z11) {
            if (!photoViewer.f43332s1 && ((photoViewer.f43351u4 == 1 || (i10 = photoViewer.d2) == 1 || i10 == 11) && photoViewer.D1 != null && (n10 = imageReceiver.n()) != null)) {
                org.telegram.ui.Components.rd0 rd0Var = photoViewer.D1;
                int i11 = imageReceiver.V;
                int i12 = photoViewer.d2;
                if (i12 != 1 && i12 != 11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                rd0Var.b(n10, i11, z13, true, photoViewer.E1, null, null);
            }
            if (photoViewer.f43390y4.getVisibility() == 0) {
                photoViewer.f43218f0.requestLayout();
            }
            photoViewer.K0();
        }
        if (imageReceiver == photoViewer.C4 && z10 && (vq0Var = photoViewer.d) != null && vq0Var.K() && !photoViewer.f43265k5 && (i7 = photoViewer.d2) != 1 && i7 != 11) {
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
