package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class qq0 extends AnimatorListenerAdapter {
    public final int f41035a;
    public final PhotoViewer f41036b;

    public qq0(PhotoViewer photoViewer, int i10) {
        this.f41035a = i10;
        this.f41036b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.bi biVar;
        int i10 = this.f41035a;
        PhotoViewer photoViewer = this.f41036b;
        switch (i10) {
            case 0:
                photoViewer.f33571p6 = null;
                org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                if (be0Var != null) {
                    if (be0Var.f24615b.j()) {
                        org.telegram.ui.ActionBar.a7.t(photoViewer.f33434a1, org.telegram.ui.ActionBar.t6.f21125ng, photoViewer.f33622v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f33434a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33493g6 = 0.0f;
                    photoViewer.f33470e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f33605t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.j3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                er0 er0Var = photoViewer.L1;
                er0Var.f10166d1.setTypeface(ig.s0.e(er0Var.f10201y1).f8457j);
                er0Var.I0.setVisibility(0);
                er0Var.F0.setVisibility(0);
                er0Var.G0.setVisibility(0);
                org.telegram.ui.Components.lc0 lc0Var = photoViewer.f33653y4;
                int childCount = lc0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    lc0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33571p6 = null;
                photoViewer.f33615u4 = 3;
                vh.r2 r2Var = photoViewer.h1().L;
                if (photoViewer.f33615u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r2Var.b(z10);
                vh.r2 r2Var2 = photoViewer.K1;
                if (r2Var2 != null) {
                    if (photoViewer.f33615u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r2Var2.b(z11);
                }
                photoViewer.f33563o6 = -1;
                float u22 = photoViewer.u2(false);
                photoViewer.f33438a6 = u22;
                photoViewer.f33476e6 = u22;
                photoViewer.f33458c6 = 0.0f;
                photoViewer.f33467d6 = 0.0f;
                photoViewer.z3(u22);
                photoViewer.f33604t2 = true;
                photoViewer.f33470e0.invalidate();
                es0 es0Var = photoViewer.d;
                if (es0Var == null || !es0Var.P()) {
                    photoViewer.V1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33558o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                org.telegram.messenger.i0.g3(new mg0(this, 24));
                return;
            case 6:
                photoViewer.f33544m6 = 1.0f;
                Runnable runnable = photoViewer.f33570p4;
                if (runnable != null) {
                    un unVar = photoViewer.l4;
                    if (unVar == null && (biVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
                        if (k2Var instanceof un) {
                            unVar = (un) k2Var;
                        }
                    }
                    if (unVar != null) {
                        unVar.p8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33570p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33571p6 = null;
                photoViewer.f33470e0.invalidate();
                return;
            case 8:
                photoViewer.y3[0].setTag(null);
                return;
            default:
                photoViewer.y3[0].setTag(null);
                return;
        }
    }
}
