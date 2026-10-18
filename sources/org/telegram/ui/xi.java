package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class xi extends AnimatorListenerAdapter {
    public final int f43170a = 1;
    public final boolean f43171b;
    public int f43172c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public xi(org.telegram.ui.Components.sv0 sv0Var, boolean z10, int i10, org.telegram.ui.Components.lu0 lu0Var) {
        this.e = sv0Var;
        this.f43171b = z10;
        this.f43172c = i10;
        this.d = lu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.f43170a) {
            case 0:
                sn snVar = (sn) this.e;
                snVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) snVar).fragmentBeginToShow = true;
                snVar.V9 = null;
                if (this.f43171b) {
                    snVar.f41300ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) snVar).actionBar;
                kVar.invalidate();
                snVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new vi(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f43172c;
                org.telegram.ui.Components.sv0 sv0Var = (org.telegram.ui.Components.sv0) this.e;
                int[] iArr = sv0Var.f30374m1;
                org.telegram.ui.Components.lu0[] lu0VarArr = sv0Var.f30371k0;
                sv0Var.f30379o1 = false;
                boolean z10 = this.f43171b;
                if (z10) {
                    int i12 = sv0Var.f30383q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (sv0Var.c0(((org.telegram.ui.Components.lu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(sv0Var.f30383q1);
                    }
                }
                for (int i13 = 0; i13 < lu0VarArr.length; i13++) {
                    org.telegram.ui.Components.lu0 lu0Var = lu0VarArr[i13];
                    if (lu0Var != null && lu0Var.h != null && (((i10 = lu0Var.F) == 0 || org.telegram.ui.Components.sv0.q0(i10)) && (adapter = lu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            sv0Var.f30391t1[0].g(false);
                        }
                        if (z10) {
                            lu0VarArr[i13].f28342x.y1(iArr[i11]);
                            lu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(lu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        lu0VarArr[i13].f28339r.setVisibility(8);
                    }
                }
                if (sv0Var.f30387s >= 0) {
                    for (int i14 = 0; i14 < lu0VarArr.length; i14++) {
                        org.telegram.ui.Components.lu0 lu0Var2 = lu0VarArr[i14];
                        if (lu0Var2.F == sv0Var.f30381p1) {
                            if (z10 && (m10 = lu0Var2.f28340s.m(sv0Var.f30387s)) != null) {
                                sv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.lu0 lu0Var3 = lu0VarArr[i14];
                            lu0Var3.f28342x.h1(sv0Var.f30387s, (-lu0Var3.h.getPaddingTop()) + sv0Var.v);
                        }
                    }
                } else {
                    sv0Var.Z0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f43170a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((sn) this.e)).currentAccount;
                this.f43172c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f43172c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public xi(sn snVar, boolean z10, Runnable runnable) {
        this.e = snVar;
        this.f43171b = z10;
        this.d = runnable;
    }
}
