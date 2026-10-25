package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class vs0 extends AnimatorListenerAdapter {
    public final int f44897a;
    public final PhotoViewer f44898b;

    public vs0(PhotoViewer photoViewer, int i10) {
        this.f44897a = i10;
        this.f44898b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ti tiVar;
        int i10 = this.f44897a;
        PhotoViewer photoViewer = this.f44898b;
        switch (i10) {
            case 0:
                photoViewer.f35745p6 = null;
                org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
                if (of0Var != null) {
                    if (of0Var.f31283b.j()) {
                        org.telegram.ui.ActionBar.f7.t(photoViewer.f35607a1, org.telegram.ui.ActionBar.y6.zf, photoViewer.f35795v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f35607a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f35667g6 = 0.0f;
                    photoViewer.f35643e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f35778t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.i3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                nt0 nt0Var = photoViewer.L1;
                nt0Var.f48340j1.setTypeface(rg.s0.e(nt0Var.E1).f47546j);
                nt0Var.O0.setVisibility(0);
                nt0Var.L0.setVisibility(0);
                nt0Var.M0.setVisibility(0);
                org.telegram.ui.Components.yd0 yd0Var = photoViewer.f35826y4;
                int childCount = yd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    yd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f35745p6 = null;
                photoViewer.f35788u4 = 3;
                fi.z3 z3Var = photoViewer.g1().L;
                if (photoViewer.f35788u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z3Var.b(z10);
                fi.z3 z3Var2 = photoViewer.K1;
                if (z3Var2 != null) {
                    if (photoViewer.f35788u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z3Var2.b(z11);
                }
                photoViewer.f35736o6 = -1;
                float t22 = photoViewer.t2(false);
                photoViewer.f35611a6 = t22;
                photoViewer.f35649e6 = t22;
                photoViewer.f35631c6 = 0.0f;
                photoViewer.f35640d6 = 0.0f;
                photoViewer.y3(t22);
                photoViewer.f35777t2 = true;
                photoViewer.f35643e0.invalidate();
                ou0 ou0Var = photoViewer.d;
                if (ou0Var == null || !ou0Var.P()) {
                    photoViewer.U1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f35731o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new lj0(this, 23));
                return;
            case 6:
                photoViewer.f35717m6 = 1.0f;
                Runnable runnable = photoViewer.f35743p4;
                if (runnable != null) {
                    un unVar = photoViewer.l4;
                    if (unVar == null && (tiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
                        if (r2Var instanceof un) {
                            unVar = (un) r2Var;
                        }
                    }
                    if (unVar != null) {
                        unVar.o8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f35743p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f35745p6 = null;
                photoViewer.f35643e0.invalidate();
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
