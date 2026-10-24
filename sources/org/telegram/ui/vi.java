package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class vi extends AnimatorListenerAdapter {
    public final int f42749a = 1;
    public final boolean f42750b;
    public int f42751c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public vi(org.telegram.ui.Components.wv0 wv0Var, boolean z10, int i10, org.telegram.ui.Components.pu0 pu0Var) {
        this.e = wv0Var;
        this.f42750b = z10;
        this.f42751c = i10;
        this.d = pu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.f42749a) {
            case 0:
                sn snVar = (sn) this.e;
                snVar.f41450a6 = true;
                ((org.telegram.ui.ActionBar.o2) snVar).fragmentBeginToShow = true;
                snVar.ha = null;
                if (this.f42750b) {
                    snVar.f41730wa = false;
                }
                kVar = ((org.telegram.ui.ActionBar.o2) snVar).actionBar;
                kVar.invalidate();
                snVar.f41558j1.invalidate();
                AndroidUtilities.runOnUIThread(new ti(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f42751c;
                org.telegram.ui.Components.wv0 wv0Var = (org.telegram.ui.Components.wv0) this.e;
                int[] iArr = wv0Var.f32389m1;
                org.telegram.ui.Components.pu0[] pu0VarArr = wv0Var.f32386k0;
                wv0Var.f32394o1 = false;
                boolean z10 = this.f42750b;
                if (z10) {
                    int i12 = wv0Var.f32398q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (wv0Var.d0(((org.telegram.ui.Components.pu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(wv0Var.f32398q1);
                    }
                }
                for (int i13 = 0; i13 < pu0VarArr.length; i13++) {
                    org.telegram.ui.Components.pu0 pu0Var = pu0VarArr[i13];
                    if (pu0Var != null && pu0Var.h != null && (((i10 = pu0Var.F) == 0 || org.telegram.ui.Components.wv0.r0(i10)) && (adapter = pu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            wv0Var.f32406t1[0].g(false);
                        }
                        if (z10) {
                            pu0VarArr[i13].f29680x.y1(iArr[i11]);
                            pu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(pu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        pu0VarArr[i13].f29677r.setVisibility(8);
                    }
                }
                if (wv0Var.f32402s >= 0) {
                    for (int i14 = 0; i14 < pu0VarArr.length; i14++) {
                        org.telegram.ui.Components.pu0 pu0Var2 = pu0VarArr[i14];
                        if (pu0Var2.F == wv0Var.f32396p1) {
                            if (z10 && (m10 = pu0Var2.f29678s.m(wv0Var.f32402s)) != null) {
                                wv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.pu0 pu0Var3 = pu0VarArr[i14];
                            pu0Var3.f29680x.h1(wv0Var.f32402s, (-pu0Var3.h.getPaddingTop()) + wv0Var.v);
                        }
                    }
                } else {
                    wv0Var.a1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f42749a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((sn) this.e)).currentAccount;
                this.f42751c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f42751c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vi(sn snVar, boolean z10, Runnable runnable) {
        this.e = snVar;
        this.f42750b = z10;
        this.d = runnable;
    }
}
