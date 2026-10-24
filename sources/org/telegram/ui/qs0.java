package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class qs0 extends AnimatorListenerAdapter {
    public final int f40929a;
    public final PhotoViewer f40930b;

    public qs0(PhotoViewer photoViewer, int i10) {
        this.f40929a = i10;
        this.f40930b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ri riVar;
        int i10 = this.f40929a;
        PhotoViewer photoViewer = this.f40930b;
        switch (i10) {
            case 0:
                photoViewer.f33683p6 = null;
                org.telegram.ui.Components.qf0 qf0Var = photoViewer.C1;
                if (qf0Var != null) {
                    if (qf0Var.f29903b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.f33546a1, org.telegram.ui.ActionBar.k6.f21597zf, photoViewer.f33734v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f33546a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33605g6 = 0.0f;
                    photoViewer.f33582e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f33717t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.i3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                it0 it0Var = photoViewer.L1;
                it0Var.f45914u1.setTypeface(qg.u0.e(it0Var.P1).f45096j);
                it0Var.Z0.setVisibility(0);
                it0Var.W0.setVisibility(0);
                it0Var.X0.setVisibility(0);
                org.telegram.ui.Components.ae0 ae0Var = photoViewer.f33765y4;
                int childCount = ae0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ae0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33683p6 = null;
                photoViewer.f33727u4 = 3;
                ei.b4 b4Var = photoViewer.g1().L;
                if (photoViewer.f33727u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b4Var.b(z10);
                ei.b4 b4Var2 = photoViewer.K1;
                if (b4Var2 != null) {
                    if (photoViewer.f33727u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b4Var2.b(z11);
                }
                photoViewer.f33675o6 = -1;
                float t22 = photoViewer.t2(false);
                photoViewer.f33550a6 = t22;
                photoViewer.f33588e6 = t22;
                photoViewer.f33570c6 = 0.0f;
                photoViewer.f33579d6 = 0.0f;
                photoViewer.y3(t22);
                photoViewer.f33716t2 = true;
                photoViewer.f33582e0.invalidate();
                ju0 ju0Var = photoViewer.d;
                if (ju0Var == null || !ju0Var.P()) {
                    photoViewer.U1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33670o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new nj0(this, 22));
                return;
            case 6:
                photoViewer.f33656m6 = 1.0f;
                Runnable runnable = photoViewer.f33682p4;
                if (runnable != null) {
                    sn snVar = photoViewer.l4;
                    if (snVar == null && (riVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
                        if (o2Var instanceof sn) {
                            snVar = (sn) o2Var;
                        }
                    }
                    if (snVar != null) {
                        snVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33682p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33683p6 = null;
                photoViewer.f33582e0.invalidate();
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
