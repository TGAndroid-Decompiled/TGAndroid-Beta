package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class wi extends AnimatorListenerAdapter {
    public final int f45498a = 1;
    public final boolean f45499b;
    public int f45500c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public wi(org.telegram.ui.Components.aw0 aw0Var, boolean z10, int i10, org.telegram.ui.Components.tu0 tu0Var) {
        this.e = aw0Var;
        this.f45499b = z10;
        this.f45500c = i10;
        this.d = tu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f45498a) {
            case 0:
                un unVar = (un) this.e;
                unVar.f44185a6 = true;
                ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow = true;
                unVar.f44279ha = null;
                if (this.f45499b) {
                    unVar.f44467wa = false;
                }
                kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                kVar.invalidate();
                unVar.f44295j1.invalidate();
                AndroidUtilities.runOnUIThread(new ui(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f45500c;
                org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) this.e;
                int[] iArr = aw0Var.f26681o1;
                org.telegram.ui.Components.tu0[] tu0VarArr = aw0Var.m0;
                aw0Var.f26686q1 = false;
                boolean z10 = this.f45499b;
                if (z10) {
                    int i12 = aw0Var.f26692s1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (aw0Var.j0(((org.telegram.ui.Components.tu0) this.d).E) >= 5) {
                        SharedConfig.setStoriesColumnsCount(aw0Var.f26692s1);
                    }
                }
                for (int i13 = 0; i13 < tu0VarArr.length; i13++) {
                    org.telegram.ui.Components.tu0 tu0Var = tu0VarArr[i13];
                    if (tu0Var != null && tu0Var.h != null && (((i10 = tu0Var.E) == 0 || org.telegram.ui.Components.aw0.w0(i10)) && (adapter = tu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            aw0Var.f26698v1[0].g(false);
                        }
                        if (z10) {
                            tu0VarArr[i13].f33163w.z1(iArr[i11]);
                            tu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(tu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        tu0VarArr[i13].f33160n.setVisibility(8);
                    }
                }
                if (aw0Var.f26690s >= 0) {
                    for (int i14 = 0; i14 < tu0VarArr.length; i14++) {
                        org.telegram.ui.Components.tu0 tu0Var2 = tu0VarArr[i14];
                        if (tu0Var2.E == aw0Var.f26689r1) {
                            if (z10 && (m10 = tu0Var2.f33161r.m(aw0Var.f26690s)) != null) {
                                aw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.tu0 tu0Var3 = tu0VarArr[i14];
                            tu0Var3.f33163w.h1(aw0Var.f26690s, (-tu0Var3.h.getPaddingTop()) + aw0Var.v);
                        }
                    }
                } else {
                    aw0Var.d1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f45498a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.r2) ((un) this.e)).currentAccount;
                this.f45500c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f45500c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public wi(un unVar, boolean z10, Runnable runnable) {
        this.e = unVar;
        this.f45499b = z10;
        this.d = runnable;
    }
}
