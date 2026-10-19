package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class vi extends AnimatorListenerAdapter {
    public final int f42261a = 1;
    public final boolean f42262b;
    public int f42263c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public vi(org.telegram.ui.Components.tv0 tv0Var, boolean z10, int i10, org.telegram.ui.Components.mu0 mu0Var) {
        this.e = tv0Var;
        this.f42262b = z10;
        this.f42263c = i10;
        this.d = mu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.f42261a) {
            case 0:
                qn qnVar = (qn) this.e;
                qnVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) qnVar).fragmentBeginToShow = true;
                qnVar.V9 = null;
                if (this.f42262b) {
                    qnVar.f40749ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) qnVar).actionBar;
                kVar.invalidate();
                qnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new ti(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f42263c;
                org.telegram.ui.Components.tv0 tv0Var = (org.telegram.ui.Components.tv0) this.e;
                int[] iArr = tv0Var.f30713m1;
                org.telegram.ui.Components.mu0[] mu0VarArr = tv0Var.f30710k0;
                tv0Var.f30718o1 = false;
                boolean z10 = this.f42262b;
                if (z10) {
                    int i12 = tv0Var.f30722q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (tv0Var.c0(((org.telegram.ui.Components.mu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(tv0Var.f30722q1);
                    }
                }
                for (int i13 = 0; i13 < mu0VarArr.length; i13++) {
                    org.telegram.ui.Components.mu0 mu0Var = mu0VarArr[i13];
                    if (mu0Var != null && mu0Var.h != null && (((i10 = mu0Var.F) == 0 || org.telegram.ui.Components.tv0.q0(i10)) && (adapter = mu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            tv0Var.f30730t1[0].g(false);
                        }
                        if (z10) {
                            mu0VarArr[i13].f28614x.y1(iArr[i11]);
                            mu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(mu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        mu0VarArr[i13].f28611r.setVisibility(8);
                    }
                }
                if (tv0Var.f30726s >= 0) {
                    for (int i14 = 0; i14 < mu0VarArr.length; i14++) {
                        org.telegram.ui.Components.mu0 mu0Var2 = mu0VarArr[i14];
                        if (mu0Var2.F == tv0Var.f30720p1) {
                            if (z10 && (m10 = mu0Var2.f28612s.m(tv0Var.f30726s)) != null) {
                                tv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.mu0 mu0Var3 = mu0VarArr[i14];
                            mu0Var3.f28614x.h1(tv0Var.f30726s, (-mu0Var3.h.getPaddingTop()) + tv0Var.v);
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
        switch (this.f42261a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((qn) this.e)).currentAccount;
                this.f42263c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f42263c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vi(qn qnVar, boolean z10, Runnable runnable) {
        this.e = qnVar;
        this.f42262b = z10;
        this.d = runnable;
    }
}
