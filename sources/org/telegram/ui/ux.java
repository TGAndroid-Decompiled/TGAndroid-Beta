package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ux extends AnimatorListenerAdapter {
    public final int f41231a;
    public final boolean f41232b;
    public final uy f41233c;

    public ux(uy uyVar, boolean z10, int i10) {
        this.f41231a = i10;
        this.f41233c = uyVar;
        this.f41232b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41231a) {
            case 0:
                uy uyVar = this.f41233c;
                uyVar.f41311o3.unlock();
                if (uyVar.f41352w1 == animator) {
                    if (this.f41232b) {
                        uyVar.f41260e0[0].f40859a.b1();
                    } else {
                        qy qyVar = uyVar.f41260e0[0].f40859a;
                        if (qyVar.f28211i1) {
                            qyVar.f28211i1 = false;
                            qyVar.J0(false);
                        }
                    }
                    uyVar.f41352w1 = null;
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
        switch (this.f41231a) {
            case 0:
                uy uyVar = this.f41233c;
                uyVar.f41311o3.unlock();
                if (uyVar.f41352w1 == animator) {
                    uyVar.A4(false, true);
                    boolean z10 = this.f41232b;
                    if (z10) {
                        uyVar.f41260e0[0].f40859a.b1();
                        lx lxVar = uyVar.E0;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                        uyVar.f41321q3 = true;
                        Activity parentActivity = uyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) uyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        uyVar.f41286j0.setVisibility(8);
                        ox oxVar = uyVar.F3;
                        if (oxVar != null) {
                            oxVar.setVisibility(8);
                        }
                    } else {
                        uyVar.f41327r3 = false;
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
                            eyVar2.A0.clear();
                            eyVar2.J();
                        }
                        qy qyVar = uyVar.f41260e0[0].f40859a;
                        if (qyVar.f28211i1) {
                            qyVar.f28211i1 = false;
                            qyVar.J0(false);
                        }
                        uyVar.f41321q3 = false;
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
                    uyVar.f41260e0[0].f40859a.setVerticalScrollBarEnabled(true);
                    ey eyVar3 = uyVar.C0;
                    if (eyVar3 != null) {
                        eyVar3.setBackground(null);
                    }
                    uyVar.f41352w1 = null;
                    return;
                }
                return;
            case 1:
                uy uyVar2 = this.f41233c;
                uyVar2.P3 = null;
                if (!this.f41232b && (v0Var = uyVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                uy uyVar3 = this.f41233c;
                uyVar3.I = null;
                boolean z11 = this.f41232b;
                uyVar3.K = z11;
                if (!z11 && !uyVar3.L) {
                    uyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    uyVar3.C4(0.0f);
                    uyVar3.f41360x3 = AndroidUtilities.dp(81.0f);
                } else {
                    uyVar3.f41360x3 = -AndroidUtilities.dp(81.0f);
                    uyVar3.C4(-uyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    ty[] tyVarArr = uyVar3.f41260e0;
                    if (i11 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i11];
                        if (tyVar != null) {
                            tyVar.f40859a.requestLayout();
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
