package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class xo0 extends AnimatorListenerAdapter {
    public final int f52068a;
    public final PhotoViewer f52069b;

    public xo0(PhotoViewer photoViewer, int i3) {
        this.f52068a = i3;
        this.f52069b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.bi biVar;
        int i3 = this.f52068a;
        PhotoViewer photoViewer = this.f52069b;
        switch (i3) {
            case 0:
                photoViewer.f41519q6 = null;
                org.telegram.ui.Components.ad0 ad0Var = photoViewer.D1;
                if (ad0Var != null) {
                    if (ad0Var.f31808b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.f41383b1, org.telegram.ui.ActionBar.k6.f28071ng, photoViewer.f41570w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f41383b1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f41443h6 = 0.0f;
                    photoViewer.f41420f0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f41552u3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.j3();
                return;
            case 3:
                photoViewer.M1.m0(false);
                lp0 lp0Var = photoViewer.M1;
                lp0Var.f55968e1.setTypeface(tg.k0.e(lp0Var.f56002z1).f55236j);
                lp0Var.J0.setVisibility(0);
                lp0Var.G0.setVisibility(0);
                lp0Var.H0.setVisibility(0);
                org.telegram.ui.Components.nb0 nb0Var = photoViewer.f41601z4;
                int childCount = nb0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    nb0Var.getChildAt(i10).setVisibility(4);
                }
                photoViewer.f41519q6 = null;
                photoViewer.f41562v4 = 3;
                gi.p3 p3Var = photoViewer.h1().M;
                if (photoViewer.f41562v4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p3Var.b(z10);
                gi.p3 p3Var2 = photoViewer.L1;
                if (p3Var2 != null) {
                    if (photoViewer.f41562v4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p3Var2.b(z11);
                }
                photoViewer.f41510p6 = -1;
                float u22 = photoViewer.u2(false);
                photoViewer.f41388b6 = u22;
                photoViewer.f41426f6 = u22;
                photoViewer.f41406d6 = 0.0f;
                photoViewer.f41416e6 = 0.0f;
                photoViewer.z3(u22);
                photoViewer.f41551u2 = true;
                photoViewer.f41420f0.invalidate();
                kq0 kq0Var = photoViewer.d;
                if (kq0Var == null || !kq0Var.P()) {
                    photoViewer.V1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.C1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f41505p1.setVisibility(8);
                    photoViewer.C1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.g0.h3(new sg0(this, 23));
                return;
            case 6:
                photoViewer.f41492n6 = 1.0f;
                Runnable runnable = photoViewer.f41517q4;
                if (runnable != null) {
                    wm wmVar = photoViewer.f41481m4;
                    if (wmVar == null && (biVar = photoViewer.f41384b2) != null) {
                        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                        if (d2Var instanceof wm) {
                            wmVar = (wm) d2Var;
                        }
                    }
                    if (wmVar != null) {
                        wmVar.w8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f41517q4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f41519q6 = null;
                photoViewer.f41420f0.invalidate();
                return;
            case 8:
                photoViewer.f41600z3[0].setTag(null);
                return;
            default:
                photoViewer.f41600z3[0].setTag(null);
                return;
        }
    }
}
