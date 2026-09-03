package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class us0 extends AnimatorListenerAdapter {
    public final int f38911a;
    public final PhotoViewer f38912b;

    public us0(PhotoViewer photoViewer, int i10) {
        this.f38911a = i10;
        this.f38912b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.li liVar;
        int i10 = this.f38911a;
        PhotoViewer photoViewer = this.f38912b;
        switch (i10) {
            case 0:
                photoViewer.f31782m6 = null;
                org.telegram.ui.Components.ze0 ze0Var = photoViewer.f31898z1;
                if (ze0Var != null) {
                    if (ze0Var.f31372b.j()) {
                        photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.j6.f20279zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.X0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f31703d6 = 0.0f;
                    photoViewer.f31679b0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f31816q3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.I1.n0(false);
                mt0 mt0Var = photoViewer.I1;
                mt0Var.f4490r1.setTypeface(cg.f1.e(mt0Var.M1).f2381j);
                mt0Var.W0.setVisibility(0);
                mt0Var.T0.setVisibility(0);
                mt0Var.U0.setVisibility(0);
                org.telegram.ui.Components.id0 id0Var = photoViewer.f31862v4;
                int childCount = id0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    id0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f31782m6 = null;
                photoViewer.f31827r4 = 3;
                ph.i3 i3Var = photoViewer.f1().I;
                if (photoViewer.f31827r4 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i3Var.b(z4);
                ph.i3 i3Var2 = photoViewer.H1;
                if (i3Var2 != null) {
                    if (photoViewer.f31827r4 != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i3Var2.b(z10);
                }
                photoViewer.f31774l6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.X5 = r22;
                photoViewer.f31685b6 = r22;
                photoViewer.Z5 = 0.0f;
                photoViewer.f31675a6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f31815q2 = true;
                photoViewer.f31679b0.invalidate();
                ou0 ou0Var = photoViewer.d;
                if (ou0Var == null || !ou0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.f31889y1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.l1.setVisibility(8);
                    photoViewer.f31889y1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gl0(this, 20));
                return;
            case 6:
                photoViewer.f31757j6 = 1.0f;
                Runnable runnable = photoViewer.f31780m4;
                if (runnable != null) {
                    zn znVar = photoViewer.f31746i4;
                    if (znVar == null && (liVar = photoViewer.X1) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
                        if (p2Var instanceof zn) {
                            znVar = (zn) p2Var;
                        }
                    }
                    if (znVar != null) {
                        znVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f31780m4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f31782m6 = null;
                photoViewer.f31679b0.invalidate();
                return;
            case 8:
                photoViewer.f31861v3[0].setTag(null);
                return;
            default:
                photoViewer.f31861v3[0].setTag(null);
                return;
        }
    }
}
