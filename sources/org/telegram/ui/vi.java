package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class vi extends AnimatorListenerAdapter {
    public final int f42262a = 1;
    public final boolean f42263b;
    public int f42264c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public vi(org.telegram.ui.Components.tv0 tv0Var, boolean z10, int i10, org.telegram.ui.Components.mu0 mu0Var) {
        this.e = tv0Var;
        this.f42263b = z10;
        this.f42264c = i10;
        this.d = mu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.f42262a) {
            case 0:
                qn qnVar = (qn) this.e;
                qnVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow = true;
                qnVar.V9 = null;
                if (this.f42263b) {
                    qnVar.f40741ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.invalidate();
                qnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new ti(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f42264c;
                org.telegram.ui.Components.tv0 tv0Var = (org.telegram.ui.Components.tv0) this.e;
                int[] iArr = tv0Var.f30711m1;
                org.telegram.ui.Components.mu0[] mu0VarArr = tv0Var.f30708k0;
                tv0Var.f30716o1 = false;
                boolean z10 = this.f42263b;
                if (z10) {
                    int i12 = tv0Var.f30720q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (tv0Var.c0(((org.telegram.ui.Components.mu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(tv0Var.f30720q1);
                    }
                }
                for (int i13 = 0; i13 < mu0VarArr.length; i13++) {
                    org.telegram.ui.Components.mu0 mu0Var = mu0VarArr[i13];
                    if (mu0Var != null && mu0Var.h != null && (((i10 = mu0Var.F) == 0 || org.telegram.ui.Components.tv0.q0(i10)) && (adapter = mu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            tv0Var.f30728t1[0].g(false);
                        }
                        if (z10) {
                            mu0VarArr[i13].f28612x.y1(iArr[i11]);
                            mu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(mu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        mu0VarArr[i13].f28609r.setVisibility(8);
                    }
                }
                if (tv0Var.f30724s >= 0) {
                    for (int i14 = 0; i14 < mu0VarArr.length; i14++) {
                        org.telegram.ui.Components.mu0 mu0Var2 = mu0VarArr[i14];
                        if (mu0Var2.F == tv0Var.f30718p1) {
                            if (z10 && (m10 = mu0Var2.f28610s.m(tv0Var.f30724s)) != null) {
                                tv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.mu0 mu0Var3 = mu0VarArr[i14];
                            mu0Var3.f28612x.h1(tv0Var.f30724s, (-mu0Var3.h.getPaddingTop()) + tv0Var.v);
                        }
                    }
                } else {
                    tv0Var.Z0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f42262a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((qn) this.e)).currentAccount;
                this.f42264c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f42264c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vi(qn qnVar, boolean z10, Runnable runnable) {
        this.e = qnVar;
        this.f42263b = z10;
        this.d = runnable;
    }
}
