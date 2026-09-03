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
    public final int f41925a;
    public final PhotoViewer f41926b;

    public us0(PhotoViewer photoViewer, int i10) {
        this.f41925a = i10;
        this.f41926b = photoViewer;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.mi miVar;
        int i10 = this.f41925a;
        PhotoViewer photoViewer = this.f41926b;
        switch (i10) {
            case 0:
                photoViewer.f34334m6 = null;
                org.telegram.ui.Components.af0 af0Var = photoViewer.f34450z1;
                if (af0Var != null) {
                    if (af0Var.f25240b.j()) {
                        photoViewer.X0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.k6.f22061zf), PorterDuff.Mode.MULTIPLY));
                    } else {
                        photoViewer.X0.setColorFilter((ColorFilter) null);
                    }
                    photoViewer.f34254d6 = 0.0f;
                    photoViewer.f34230b0.invalidate();
                    return;
                }
                return;
            case 1:
                photoViewer.f34368q3 = null;
                return;
            case 2:
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.g3();
                return;
            case 3:
                photoViewer.I1.n0(false);
                mt0 mt0Var = photoViewer.I1;
                mt0Var.f5127r1.setTypeface(dg.e1.e(mt0Var.M1).f4521j);
                mt0Var.W0.setVisibility(0);
                mt0Var.T0.setVisibility(0);
                mt0Var.U0.setVisibility(0);
                org.telegram.ui.Components.jd0 jd0Var = photoViewer.f34414v4;
                int childCount = jd0Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    jd0Var.getChildAt(i11).setVisibility(4);
                }
                photoViewer.f34334m6 = null;
                photoViewer.f34379r4 = 3;
                qh.h3 h3Var = photoViewer.f1().I;
                if (photoViewer.f34379r4 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h3Var.b(z4);
                qh.h3 h3Var2 = photoViewer.H1;
                if (h3Var2 != null) {
                    if (photoViewer.f34379r4 != 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    h3Var2.b(z10);
                }
                photoViewer.f34326l6 = -1;
                float r22 = photoViewer.r2(false);
                photoViewer.X5 = r22;
                photoViewer.f34236b6 = r22;
                photoViewer.Z5 = 0.0f;
                photoViewer.f34226a6 = 0.0f;
                photoViewer.w3(r22);
                photoViewer.f34367q2 = true;
                photoViewer.f34230b0.invalidate();
                ou0 ou0Var = photoViewer.d;
                if (ou0Var == null || !ou0Var.O()) {
                    photoViewer.R1();
                    return;
                }
                return;
            case 4:
                AnimatorSet animatorSet = photoViewer.f34441y1;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    photoViewer.l1.setVisibility(8);
                    photoViewer.f34441y1 = null;
                    return;
                }
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new gl0(this, 20));
                return;
            case 6:
                photoViewer.f34309j6 = 1.0f;
                Runnable runnable = photoViewer.f34332m4;
                if (runnable != null) {
                    xn xnVar = photoViewer.f34298i4;
                    if (xnVar == null && (miVar = photoViewer.X1) != null) {
                        org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
                        if (p2Var instanceof xn) {
                            xnVar = (xn) p2Var;
                        }
                    }
                    if (xnVar != null) {
                        xnVar.h8(runnable);
                        return;
                    }
                    runnable.run();
                    photoViewer.f34332m4 = null;
                    return;
                }
                return;
            case 7:
                photoViewer.f34334m6 = null;
                photoViewer.f34230b0.invalidate();
                return;
            case 8:
                photoViewer.f34413v3[0].setTag(null);
                return;
            default:
                photoViewer.f34413v3[0].setTag(null);
                return;
        }
    }
}
