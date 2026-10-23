package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class rs0 extends AnimatorListenerAdapter {
    public final int f41238a;
    public final PhotoViewer f41239b;

    public rs0(PhotoViewer photoViewer, int i10) {
        this.f41238a = i10;
        this.f41239b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ti tiVar;
        int i10 = this.f41238a;
        PhotoViewer photoViewer = this.f41239b;
        switch (i10) {
            case 0:
                photoViewer.f33681p6 = null;
                org.telegram.ui.Components.rf0 rf0Var = photoViewer.C1;
                if (rf0Var != null) {
                    if (rf0Var.f30163b.j()) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.f33544a1, org.telegram.ui.ActionBar.k6.f21596zf, photoViewer.f33732v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.f33544a1.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f33603g6 = 0.0f;
                    photoViewer.f33580e0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f33715t3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.i3();
                return;
            case 3:
                photoViewer.L1.n0(false);
                jt0 jt0Var = photoViewer.L1;
                jt0Var.f45915u1.setTypeface(qg.u0.e(jt0Var.P1).f45097j);
                jt0Var.Z0.setVisibility(0);
                jt0Var.W0.setVisibility(0);
                jt0Var.X0.setVisibility(0);
                org.telegram.ui.Components.ce0 ce0Var = photoViewer.f33763y4;
                int childCount = ce0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ce0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f33681p6 = null;
                photoViewer.f33725u4 = 3;
                ei.b4 b4Var = photoViewer.g1().L;
                if (photoViewer.f33725u4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b4Var.b(z10);
                ei.b4 b4Var2 = photoViewer.K1;
                if (b4Var2 != null) {
                    if (photoViewer.f33725u4 != 3) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b4Var2.b(z11);
                }
                photoViewer.f33673o6 = -1;
                float t22 = photoViewer.t2(false);
                photoViewer.f33548a6 = t22;
                photoViewer.f33586e6 = t22;
                photoViewer.f33568c6 = 0.0f;
                photoViewer.f33577d6 = 0.0f;
                photoViewer.y3(t22);
                photoViewer.f33714t2 = true;
                photoViewer.f33580e0.invalidate();
                ku0 ku0Var = photoViewer.d;
                if (ku0Var == null || !ku0Var.P()) {
                    photoViewer.U1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.B1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.f33668o1.setVisibility(8);
                    photoViewer.B1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new oj0(this, 22));
                return;
            case 6:
                photoViewer.f33654m6 = 1.0f;
                Runnable runnable = photoViewer.f33680p4;
                if (runnable != null) {
                    sn snVar = photoViewer.l4;
                    if (snVar == null && (tiVar = photoViewer.a2) != null) {
                        org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
                        if (o2Var instanceof sn) {
                            snVar = (sn) o2Var;
                        }
                    }
                    if (snVar != null) {
                        snVar.k8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f33680p4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f33681p6 = null;
                photoViewer.f33580e0.invalidate();
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
