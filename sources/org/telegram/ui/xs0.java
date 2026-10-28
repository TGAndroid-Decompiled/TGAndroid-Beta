package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xs0 extends AnimatorListenerAdapter {
    public final int f45775a;
    public final PhotoViewer f45776b;

    public xs0(PhotoViewer photoViewer, int i10) {
        this.f45775a = i10;
        this.f45776b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ti tiVar;
        int i10 = this.f45775a;
        PhotoViewer photoViewer = this.f45776b;
        switch (i10) {
            case 0:
                photoViewer.f35772p6 = null;
                org.telegram.ui.Components.pf0 pf0Var = photoViewer.C1;
                if (pf0Var != null) {
                    if (pf0Var.f31597b.j()) {
                        org.telegram.ui.ActionBar.f7.t(photoViewer.f35634a1, org.telegram.ui.ActionBar.y6.zf, photoViewer.f35822v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f35634a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f35694g6 = 0.0f;
                    photoViewer.f35670e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f35805t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.j3();
                return;
            case 3:
                photoViewer.L1.m0(false);
                pt0 pt0Var = photoViewer.L1;
                pt0Var.f48369j1.setTypeface(rg.s0.e(pt0Var.E1).f47584j);
                pt0Var.O0.setVisibility(0);
                pt0Var.L0.setVisibility(0);
                pt0Var.M0.setVisibility(0);
                org.telegram.ui.Components.zd0 zd0Var = photoViewer.f35853y4;
                int childCount = zd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    zd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f35772p6 = null;
                photoViewer.f35815u4 = 3;
                fi.z3 z3Var = photoViewer.h1().L;
                if (photoViewer.f35815u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z3Var.b(z10);
                fi.z3 z3Var2 = photoViewer.K1;
                if (z3Var2 != null) {
                    if (photoViewer.f35815u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z3Var2.b(z11);
                }
                photoViewer.f35763o6 = -1;
                float u22 = photoViewer.u2(false);
                photoViewer.f35638a6 = u22;
                photoViewer.f35676e6 = u22;
                photoViewer.f35658c6 = 0.0f;
                photoViewer.f35667d6 = 0.0f;
                photoViewer.z3(u22);
                photoViewer.f35804t2 = true;
                photoViewer.f35670e0.invalidate();
                qu0 qu0Var = photoViewer.d;
                if (qu0Var == null || !qu0Var.P()) {
                    photoViewer.V1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f35758o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new nj0(this, 23));
                return;
            case 6:
                photoViewer.f35744m6 = 1.0f;
                Runnable runnable = photoViewer.f35770p4;
                if (runnable != null) {
                    wn wnVar = photoViewer.l4;
                    if (wnVar == null && (tiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                        if (r2Var instanceof wn) {
                            wnVar = (wn) r2Var;
                        }
                    }
                    if (wnVar != null) {
                        wnVar.q8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f35770p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f35772p6 = null;
                photoViewer.f35670e0.invalidate();
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
