package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
public final class vi extends AnimatorListenerAdapter {
    public final int f43605a = 1;
    public final boolean f43606b;
    public int f43607c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f43608e;

    public vi(org.telegram.ui.Components.qu0 qu0Var, boolean z10, int i10, org.telegram.ui.Components.it0 it0Var) {
        this.f43608e = qu0Var;
        this.f43606b = z10;
        this.f43607c = i10;
        this.d = it0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        int i10;
        f2.p0 adapter;
        switch (this.f43605a) {
            case 0:
                tn tnVar = (tn) this.f43608e;
                tnVar.K5 = true;
                ((org.telegram.ui.ActionBar.o2) tnVar).fragmentBeginToShow = true;
                tnVar.R9 = null;
                if (this.f43606b) {
                    tnVar.f42824ga = false;
                }
                lVar = ((org.telegram.ui.ActionBar.o2) tnVar).actionBar;
                lVar.invalidate();
                tnVar.T0.invalidate();
                AndroidUtilities.runOnUIThread(new ui(this, 0), 32L);
                ((Runnable) this.d).run();
                return;
            default:
                int i11 = this.f43607c;
                org.telegram.ui.Components.qu0 qu0Var = (org.telegram.ui.Components.qu0) this.f43608e;
                int[] iArr = qu0Var.f32075i1;
                org.telegram.ui.Components.it0[] it0VarArr = qu0Var.f32070g0;
                qu0Var.f32079k1 = false;
                boolean z10 = this.f43606b;
                if (z10) {
                    int i12 = qu0Var.f32081m1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (qu0Var.c0(((org.telegram.ui.Components.it0) this.d).B) >= 5) {
                        SharedConfig.setStoriesColumnsCount(qu0Var.f32081m1);
                    }
                }
                for (int i13 = 0; i13 < it0VarArr.length; i13++) {
                    org.telegram.ui.Components.it0 it0Var = it0VarArr[i13];
                    if (it0Var != null && it0Var.h != null && (((i10 = it0Var.B) == 0 || org.telegram.ui.Components.qu0.p0(i10)) && (adapter = it0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            qu0Var.f32088p1[0].g(false);
                        }
                        if (z10) {
                            it0VarArr[i13].f29472x.y1(iArr[i11]);
                            it0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(it0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        it0VarArr[i13].f29469r.setVisibility(8);
                    }
                }
                if (qu0Var.f32094s >= 0) {
                    for (int i14 = 0; i14 < it0VarArr.length; i14++) {
                        org.telegram.ui.Components.it0 it0Var2 = it0VarArr[i14];
                        if (it0Var2.B == qu0Var.l1) {
                            if (z10 && (m10 = it0Var2.f29470s.m(qu0Var.f32094s)) != null) {
                                qu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.it0 it0Var3 = it0VarArr[i14];
                            it0Var3.f29472x.h1(qu0Var.f32094s, (-it0Var3.h.getPaddingTop()) + qu0Var.v);
                        }
                    }
                } else {
                    qu0Var.X0();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.f43605a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.o2) ((tn) this.f43608e)).currentAccount;
                this.f43607c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.f43607c, null);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public vi(tn tnVar, boolean z10, Runnable runnable) {
        this.f43608e = tnVar;
        this.f43606b = z10;
        this.d = runnable;
    }
}
