package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rx extends AnimatorListenerAdapter {
    public final int f36948a;
    public final boolean f36949b;
    public final ry f36950c;

    public rx(ry ryVar, boolean z10, int i10) {
        this.f36948a = i10;
        this.f36950c = ryVar;
        this.f36949b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36948a) {
            case 0:
                ry ryVar = this.f36950c;
                ryVar.f37029o3.unlock();
                if (ryVar.f37070w1 == animator) {
                    if (this.f36949b) {
                        ryVar.f36978e0[0].f36629a.c1();
                    } else {
                        ny nyVar = ryVar.f36978e0[0].f36629a;
                        if (nyVar.f26208i1) {
                            nyVar.f26208i1 = false;
                            nyVar.K0(false);
                        }
                    }
                    ryVar.f37070w1 = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        int i10;
        org.telegram.ui.ActionBar.v0 v0Var;
        switch (this.f36948a) {
            case 0:
                ry ryVar = this.f36950c;
                ryVar.f37029o3.unlock();
                if (ryVar.f37070w1 == animator) {
                    ryVar.A4(false, true);
                    boolean z10 = this.f36949b;
                    if (z10) {
                        ryVar.f36978e0[0].f36629a.c1();
                        ix ixVar = ryVar.E0;
                        if (ixVar != null) {
                            ixVar.setVisibility(8);
                        }
                        ryVar.f37039q3 = true;
                        Activity parentActivity = ryVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) ryVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        ryVar.f37004j0.setVisibility(8);
                        lx lxVar = ryVar.F3;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                    } else {
                        ryVar.f37045r3 = false;
                        ay ayVar = ryVar.C0;
                        if (ayVar != null) {
                            ayVar.setVisibility(8);
                        }
                        hy hyVar = ryVar.X;
                        if (hyVar != null) {
                            hyVar.c();
                        }
                        ay ayVar2 = ryVar.C0;
                        if (ayVar2 != null) {
                            ayVar2.A0.clear();
                            ayVar2.J();
                        }
                        ny nyVar = ryVar.f36978e0[0].f36629a;
                        if (nyVar.f26208i1) {
                            nyVar.f26208i1 = false;
                            nyVar.K0(false);
                        }
                        ryVar.f37039q3 = false;
                        lx lxVar2 = ryVar.F3;
                        if (lxVar2 != null) {
                            lxVar2.setVisibility(0);
                        }
                    }
                    View view = ryVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ryVar.D4(f7);
                    ryVar.f36978e0[0].f36629a.setVerticalScrollBarEnabled(true);
                    ay ayVar3 = ryVar.C0;
                    if (ayVar3 != null) {
                        ayVar3.setBackground(null);
                    }
                    ryVar.f37070w1 = null;
                    return;
                }
                return;
            case 1:
                ry ryVar2 = this.f36950c;
                ryVar2.O3 = null;
                if (!this.f36949b && (v0Var = ryVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                ry ryVar3 = this.f36950c;
                ryVar3.I = null;
                boolean z11 = this.f36949b;
                ryVar3.K = z11;
                if (!z11 && !ryVar3.L) {
                    ryVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    ryVar3.C4(0.0f);
                    ryVar3.f37077x3 = AndroidUtilities.dp(81.0f);
                } else {
                    ryVar3.f37077x3 = -AndroidUtilities.dp(81.0f);
                    ryVar3.C4(-ryVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    qy[] qyVarArr = ryVar3.f36978e0;
                    if (i11 < qyVarArr.length) {
                        qy qyVar = qyVarArr[i11];
                        if (qyVar != null) {
                            qyVar.f36629a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = ryVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            return;
                        }
                        return;
                    }
                }
                break;
        }
    }
}
