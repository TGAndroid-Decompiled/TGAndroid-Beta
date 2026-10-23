package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class vi extends AnimatorListenerAdapter {
    public final int f42777a = 1;
    public final boolean f42778b;
    public int f42779c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public vi(org.telegram.ui.Components.xv0 xv0Var, boolean z10, int i10, org.telegram.ui.Components.qu0 qu0Var) {
        this.e = xv0Var;
        this.f42778b = z10;
        this.f42779c = i10;
        this.d = qu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.f42777a) {
            case 0:
                sn snVar = (sn) this.e;
                snVar.f41453a6 = true;
                ((org.telegram.ui.ActionBar.o2) snVar).fragmentBeginToShow = true;
                snVar.ha = null;
                if (this.f42778b) {
                    snVar.f41733wa = false;
                }
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.invalidate();
                snVar.f41561j1.invalidate();
                AndroidUtilities.runOnUIThread(new ti(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f42779c;
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.e;
                int[] iArr = xv0Var.f32690m1;
                org.telegram.ui.Components.qu0[] qu0VarArr = xv0Var.f32687k0;
                xv0Var.f32695o1 = false;
                boolean z10 = this.f42778b;
                if (z10) {
                    int i12 = xv0Var.f32699q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (xv0Var.d0(((org.telegram.ui.Components.qu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(xv0Var.f32699q1);
                    }
                }
                for (int i13 = 0; i13 < qu0VarArr.length; i13++) {
                    org.telegram.ui.Components.qu0 qu0Var = qu0VarArr[i13];
                    if (qu0Var != null && qu0Var.h != null && (((i10 = qu0Var.F) == 0 || org.telegram.ui.Components.xv0.r0(i10)) && (adapter = qu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xv0Var.f32707t1[0].g(false);
                        }
                        if (z10) {
                            qu0VarArr[i13].f30007x.y1(iArr[i11]);
                            qu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        qu0VarArr[i13].f30004r.setVisibility(8);
                    }
                }
                if (xv0Var.f32703s >= 0) {
                    for (int i14 = 0; i14 < qu0VarArr.length; i14++) {
                        org.telegram.ui.Components.qu0 qu0Var2 = qu0VarArr[i14];
                        if (qu0Var2.F == xv0Var.f32697p1) {
                            if (z10 && (m10 = qu0Var2.f30005s.m(xv0Var.f32703s)) != null) {
                                xv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.qu0 qu0Var3 = qu0VarArr[i14];
                            qu0Var3.f30007x.h1(xv0Var.f32703s, (-qu0Var3.h.getPaddingTop()) + xv0Var.v);
                        }
                    }
                } else {
                    xv0Var.a1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f42777a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((sn) this.e)).currentAccount;
                this.f42779c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f42779c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vi(sn snVar, boolean z10, Runnable runnable) {
        this.e = snVar;
        this.f42778b = z10;
        this.d = runnable;
    }
}
