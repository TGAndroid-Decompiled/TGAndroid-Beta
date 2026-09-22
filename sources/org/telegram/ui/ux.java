package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ux extends AnimatorListenerAdapter {
    public final int f38248a;
    public final boolean f38249b;
    public final uy f38250c;

    public ux(uy uyVar, boolean z10, int i10) {
        this.f38248a = i10;
        this.f38250c = uyVar;
        this.f38249b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38248a) {
            case 0:
                uy uyVar = this.f38250c;
                uyVar.f38328o3.unlock();
                if (uyVar.f38369w1 == animator) {
                    if (this.f38249b) {
                        uyVar.f38277e0[0].f37905a.d1();
                    } else {
                        qy qyVar = uyVar.f38277e0[0].f37905a;
                        if (qyVar.f30690i1) {
                            qyVar.f30690i1 = false;
                            qyVar.L0(false);
                        }
                    }
                    uyVar.f38369w1 = null;
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
        switch (this.f38248a) {
            case 0:
                uy uyVar = this.f38250c;
                uyVar.f38328o3.unlock();
                if (uyVar.f38369w1 == animator) {
                    uyVar.A4(false, true);
                    boolean z10 = this.f38249b;
                    if (z10) {
                        uyVar.f38277e0[0].f37905a.d1();
                        lx lxVar = uyVar.E0;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                        uyVar.f38338q3 = true;
                        Activity parentActivity = uyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) uyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        uyVar.f38303j0.setVisibility(8);
                        ox oxVar = uyVar.F3;
                        if (oxVar != null) {
                            oxVar.setVisibility(8);
                        }
                    } else {
                        uyVar.f38344r3 = false;
                        ey eyVar = uyVar.C0;
                        if (eyVar != null) {
                            eyVar.setVisibility(8);
                        }
                        ky kyVar = uyVar.X;
                        if (kyVar != null) {
                            kyVar.c();
                        }
                        ey eyVar2 = uyVar.C0;
                        if (eyVar2 != null) {
                            eyVar2.B0.clear();
                            eyVar2.K();
                        }
                        qy qyVar = uyVar.f38277e0[0].f37905a;
                        if (qyVar.f30690i1) {
                            qyVar.f30690i1 = false;
                            qyVar.L0(false);
                        }
                        uyVar.f38338q3 = false;
                        ox oxVar2 = uyVar.F3;
                        if (oxVar2 != null) {
                            oxVar2.setVisibility(0);
                        }
                    }
                    View view = uyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    uyVar.D4(f7);
                    uyVar.f38277e0[0].f37905a.setVerticalScrollBarEnabled(true);
                    ey eyVar3 = uyVar.C0;
                    if (eyVar3 != null) {
                        eyVar3.setBackground(null);
                    }
                    uyVar.f38369w1 = null;
                    return;
                }
                return;
            case 1:
                uy uyVar2 = this.f38250c;
                uyVar2.O3 = null;
                if (!this.f38249b && (v0Var = uyVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                uy uyVar3 = this.f38250c;
                uyVar3.I = null;
                boolean z11 = this.f38249b;
                uyVar3.K = z11;
                if (!z11 && !uyVar3.L) {
                    uyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    uyVar3.C4(0.0f);
                    uyVar3.f38376x3 = AndroidUtilities.dp(81.0f);
                } else {
                    uyVar3.f38376x3 = -AndroidUtilities.dp(81.0f);
                    uyVar3.C4(-uyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    ty[] tyVarArr = uyVar3.f38277e0;
                    if (i11 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i11];
                        if (tyVar != null) {
                            tyVar.f37905a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = uyVar3.fragmentView;
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
