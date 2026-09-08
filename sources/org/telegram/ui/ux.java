package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ux extends AnimatorListenerAdapter {
    public final int f41257a;
    public final boolean f41258b;
    public final uy f41259c;

    public ux(uy uyVar, boolean z10, int i10) {
        this.f41257a = i10;
        this.f41259c = uyVar;
        this.f41258b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41257a) {
            case 0:
                uy uyVar = this.f41259c;
                uyVar.f41337o3.unlock();
                if (uyVar.f41378w1 == animator) {
                    if (this.f41258b) {
                        uyVar.f41286e0[0].f40885a.b1();
                    } else {
                        qy qyVar = uyVar.f41286e0[0].f40885a;
                        if (qyVar.f28237i1) {
                            qyVar.f28237i1 = false;
                            qyVar.J0(false);
                        }
                    }
                    uyVar.f41378w1 = null;
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
        switch (this.f41257a) {
            case 0:
                uy uyVar = this.f41259c;
                uyVar.f41337o3.unlock();
                if (uyVar.f41378w1 == animator) {
                    uyVar.A4(false, true);
                    boolean z10 = this.f41258b;
                    if (z10) {
                        uyVar.f41286e0[0].f40885a.b1();
                        lx lxVar = uyVar.E0;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                        uyVar.f41347q3 = true;
                        Activity parentActivity = uyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) uyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        uyVar.f41312j0.setVisibility(8);
                        ox oxVar = uyVar.F3;
                        if (oxVar != null) {
                            oxVar.setVisibility(8);
                        }
                    } else {
                        uyVar.f41353r3 = false;
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
                        qy qyVar = uyVar.f41286e0[0].f40885a;
                        if (qyVar.f28237i1) {
                            qyVar.f28237i1 = false;
                            qyVar.J0(false);
                        }
                        uyVar.f41347q3 = false;
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
                    uyVar.f41286e0[0].f40885a.setVerticalScrollBarEnabled(true);
                    ey eyVar3 = uyVar.C0;
                    if (eyVar3 != null) {
                        eyVar3.setBackground(null);
                    }
                    uyVar.f41378w1 = null;
                    return;
                }
                return;
            case 1:
                uy uyVar2 = this.f41259c;
                uyVar2.P3 = null;
                if (!this.f41258b && (v0Var = uyVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                uy uyVar3 = this.f41259c;
                uyVar3.I = null;
                boolean z11 = this.f41258b;
                uyVar3.K = z11;
                if (!z11 && !uyVar3.L) {
                    uyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    uyVar3.C4(0.0f);
                    uyVar3.f41386x3 = AndroidUtilities.dp(81.0f);
                } else {
                    uyVar3.f41386x3 = -AndroidUtilities.dp(81.0f);
                    uyVar3.C4(-uyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    ty[] tyVarArr = uyVar3.f41286e0;
                    if (i11 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i11];
                        if (tyVar != null) {
                            tyVar.f40885a.requestLayout();
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
