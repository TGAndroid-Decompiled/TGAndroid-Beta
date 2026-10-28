package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class zi extends AnimatorListenerAdapter {
    public final int f46280a = 1;
    public final boolean f46281b;
    public int f46282c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public zi(org.telegram.ui.Components.bw0 bw0Var, boolean z10, int i10, org.telegram.ui.Components.uu0 uu0Var) {
        this.e = bw0Var;
        this.f46281b = z10;
        this.f46282c = i10;
        this.d = uu0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.f46280a) {
            case 0:
                wn wnVar = (wn) this.e;
                wnVar.f45107e6 = true;
                ((org.telegram.ui.ActionBar.r2) wnVar).fragmentBeginToShow = true;
                wnVar.f45195la = null;
                if (this.f46281b) {
                    wnVar.Aa = false;
                }
                kVar = ((org.telegram.ui.ActionBar.r2) wnVar).actionBar;
                kVar.invalidate();
                wnVar.f45163j1.invalidate();
                AndroidUtilities.runOnUIThread(new xi(this, 1), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f46282c;
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) this.e;
                int[] iArr = bw0Var.f26969o1;
                org.telegram.ui.Components.uu0[] uu0VarArr = bw0Var.m0;
                bw0Var.f26974q1 = false;
                boolean z10 = this.f46281b;
                if (z10) {
                    int i12 = bw0Var.f26980s1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (bw0Var.j0(((org.telegram.ui.Components.uu0) this.d).E) >= 5) {
                        SharedConfig.setStoriesColumnsCount(bw0Var.f26980s1);
                    }
                }
                for (int i13 = 0; i13 < uu0VarArr.length; i13++) {
                    org.telegram.ui.Components.uu0 uu0Var = uu0VarArr[i13];
                    if (uu0Var != null && uu0Var.h != null && (((i10 = uu0Var.E) == 0 || org.telegram.ui.Components.bw0.w0(i10)) && (adapter = uu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            bw0Var.f26986v1[0].g(false);
                        }
                        if (z10) {
                            uu0VarArr[i13].f33471w.z1(iArr[i11]);
                            uu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(uu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        uu0VarArr[i13].f33468n.setVisibility(8);
                    }
                }
                if (bw0Var.f26978s >= 0) {
                    for (int i14 = 0; i14 < uu0VarArr.length; i14++) {
                        org.telegram.ui.Components.uu0 uu0Var2 = uu0VarArr[i14];
                        if (uu0Var2.E == bw0Var.f26977r1) {
                            if (z10 && (m10 = uu0Var2.f33469r.m(bw0Var.f26978s)) != null) {
                                bw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.uu0 uu0Var3 = uu0VarArr[i14];
                            uu0Var3.f33471w.h1(bw0Var.f26978s, (-uu0Var3.h.getPaddingTop()) + bw0Var.v);
                        }
                    }
                } else {
                    bw0Var.d1();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f46280a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.r2) ((wn) this.e)).currentAccount;
                this.f46282c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f46282c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public zi(wn wnVar, boolean z10, Runnable runnable) {
        this.e = wnVar;
        this.f46281b = z10;
        this.d = runnable;
    }
}
