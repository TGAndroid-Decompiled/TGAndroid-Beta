package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class si extends AnimatorListenerAdapter {
    public final int f42702a = 1;
    public final boolean f42703b;
    public int f42704c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f42705e;

    public si(org.telegram.ui.Components.eu0 eu0Var, boolean z10, int i9, org.telegram.ui.Components.xs0 xs0Var) {
        this.f42705e = eu0Var;
        this.f42703b = z10;
        this.f42704c = i9;
        this.d = xs0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i9;
        f2.r0 adapter;
        switch (this.f42702a) {
            case 0:
                qn qnVar = (qn) this.f42705e;
                qnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) qnVar).fragmentBeginToShow = true;
                qnVar.R9 = null;
                if (this.f42703b) {
                    qnVar.f41926ga = false;
                }
                kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
                kVar.invalidate();
                qnVar.T0.invalidate();
                AndroidUtilities.runOnUIThread(new ri(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i10 = this.f42704c;
                org.telegram.ui.Components.eu0 eu0Var = (org.telegram.ui.Components.eu0) this.f42705e;
                int[] iArr = eu0Var.f28142i1;
                org.telegram.ui.Components.xs0[] xs0VarArr = eu0Var.f28137g0;
                eu0Var.f28146k1 = false;
                boolean z10 = this.f42703b;
                if (z10) {
                    int i11 = eu0Var.f28148m1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        SharedConfig.setMediaColumnsCount(i11);
                    } else if (eu0Var.c0(((org.telegram.ui.Components.xs0) this.d).B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(eu0Var.f28148m1);
                    }
                }
                for (int i12 = 0; i12 < xs0VarArr.length; i12++) {
                    org.telegram.ui.Components.xs0 xs0Var = xs0VarArr[i12];
                    if (xs0Var != null && xs0Var.h != null && (((i9 = xs0Var.B) == 0 || org.telegram.ui.Components.eu0.p0(i9)) && (adapter = xs0VarArr[i12].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i12 == 0) {
                            eu0Var.f28155p1[0].g(false);
                        }
                        if (z10) {
                            xs0VarArr[i12].f34764x.y1(iArr[i10]);
                            xs0VarArr[i12].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(xs0VarArr[i12].h);
                            } else {
                                adapter.l();
                            }
                        }
                        xs0VarArr[i12].f34761r.setVisibility(8);
                    }
                }
                if (eu0Var.f28161s >= 0) {
                    for (int i13 = 0; i13 < xs0VarArr.length; i13++) {
                        org.telegram.ui.Components.xs0 xs0Var2 = xs0VarArr[i13];
                        if (xs0Var2.B == eu0Var.l1) {
                            if (z10 && (m10 = xs0Var2.f34762s.m(eu0Var.f28161s)) != null) {
                                eu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.xs0 xs0Var3 = xs0VarArr[i13];
                            xs0Var3.f34764x.h1(eu0Var.f28161s, (-xs0Var3.h.getPaddingTop()) + eu0Var.v);
                        }
                    }
                } else {
                    eu0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i9;
        switch (this.f42702a) {
            case 0:
                super.onAnimationStart(animator);
                i9 = ((org.telegram.ui.ActionBar.o2) ((qn) this.f42705e)).currentAccount;
                this.f42704c = NotificationCenter.getInstance(i9).setAnimationInProgress(this.f42704c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public si(qn qnVar, boolean z10, Runnable runnable) {
        this.f42705e = qnVar;
        this.f42703b = z10;
        this.d = runnable;
    }
}
