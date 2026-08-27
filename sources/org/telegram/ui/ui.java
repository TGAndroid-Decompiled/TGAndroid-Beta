package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

public final class ui extends AnimatorListenerAdapter {

    public final int f43233a = 1;

    public final boolean f43234b;

    public int f43235c;
    public final Object d;

    public final NotificationCenter.NotificationCenterDelegate f43236e;

    public ui(org.telegram.ui.Components.hu0 hu0Var, boolean z10, int i10, org.telegram.ui.Components.zs0 zs0Var) {
        this.f43236e = hu0Var;
        this.f43234b = z10;
        this.f43235c = i10;
        this.d = zs0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        View viewM;
        int i10;
        f2.q0 adapter;
        switch (this.f43233a) {
            case 0:
                rn rnVar = (rn) this.f43236e;
                rnVar.K5 = true;
                ((org.telegram.ui.ActionBar.n2) rnVar).fragmentBeginToShow = true;
                rnVar.R9 = null;
                if (this.f43234b) {
                    rnVar.f42062ga = false;
                }
                ((org.telegram.ui.ActionBar.n2) rnVar).actionBar.invalidate();
                rnVar.T0.invalidate();
                AndroidUtilities.runOnUIThread(new ti(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.f43235c;
                org.telegram.ui.Components.hu0 hu0Var = (org.telegram.ui.Components.hu0) this.f43236e;
                int[] iArr = hu0Var.f29127i1;
                org.telegram.ui.Components.zs0[] zs0VarArr = hu0Var.f29122g0;
                hu0Var.f29131k1 = false;
                boolean z10 = this.f43234b;
                if (z10) {
                    int i12 = hu0Var.f29133m1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (hu0Var.c0(((org.telegram.ui.Components.zs0) this.d).B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(hu0Var.f29133m1);
                    }
                }
                for (int i13 = 0; i13 < zs0VarArr.length; i13++) {
                    org.telegram.ui.Components.zs0 zs0Var = zs0VarArr[i13];
                    if (zs0Var != null && zs0Var.h != null && (((i10 = zs0Var.B) == 0 || org.telegram.ui.Components.hu0.p0(i10)) && (adapter = zs0VarArr[i13].h.getAdapter()) != null)) {
                        int iH = adapter.h();
                        if (i13 == 0) {
                            hu0Var.f29140p1[0].g(false);
                        }
                        if (z10) {
                            zs0VarArr[i13].f35343x.y1(iArr[i11]);
                            zs0VarArr[i13].h.a0();
                            if (adapter.h() == iH) {
                                AndroidUtilities.updateVisibleRows(zs0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        zs0VarArr[i13].f35340r.setVisibility(8);
                    }
                }
                if (hu0Var.f29146s >= 0) {
                    for (int i14 = 0; i14 < zs0VarArr.length; i14++) {
                        org.telegram.ui.Components.zs0 zs0Var2 = zs0VarArr[i14];
                        if (zs0Var2.B == hu0Var.l1) {
                            if (z10 && (viewM = zs0Var2.f35341s.m(hu0Var.f29146s)) != null) {
                                hu0Var.v = viewM.getTop();
                            }
                            org.telegram.ui.Components.zs0 zs0Var3 = zs0VarArr[i14];
                            zs0Var3.f35343x.h1(hu0Var.f29146s, (-zs0Var3.h.getPaddingTop()) + hu0Var.v);
                        }
                    }
                } else {
                    hu0Var.X0();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43233a) {
            case 0:
                super.onAnimationStart(animator);
                this.f43235c = NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) ((rn) this.f43236e)).currentAccount).setAnimationInProgress(this.f43235c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ui(rn rnVar, boolean z10, Runnable runnable) {
        this.f43236e = rnVar;
        this.f43234b = z10;
        this.d = runnable;
    }
}
