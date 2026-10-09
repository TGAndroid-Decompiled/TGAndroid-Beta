package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends AnimatorListenerAdapter {
    public final int f42142a;
    public final boolean f42143b;
    public final ty f42144c;

    public tx(ty tyVar, boolean z10, int i10) {
        this.f42142a = i10;
        this.f42144c = tyVar;
        this.f42143b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42142a) {
            case 0:
                ty tyVar = this.f42144c;
                tyVar.f42223o3.unlock();
                if (tyVar.f42264w1 == animator) {
                    if (this.f42143b) {
                        tyVar.f42172e0[0].f41788a.c1();
                    } else {
                        py pyVar = tyVar.f42172e0[0].f41788a;
                        if (pyVar.f30202g1) {
                            pyVar.f30202g1 = false;
                            pyVar.K0(false);
                        }
                    }
                    tyVar.f42264w1 = null;
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
        switch (this.f42142a) {
            case 0:
                ty tyVar = this.f42144c;
                tyVar.f42223o3.unlock();
                if (tyVar.f42264w1 == animator) {
                    tyVar.x4(false, true);
                    boolean z10 = this.f42143b;
                    if (z10) {
                        tyVar.f42172e0[0].f41788a.c1();
                        kx kxVar = tyVar.E0;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                        tyVar.f42233q3 = true;
                        Activity parentActivity = tyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) tyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        tyVar.f42198j0.setVisibility(8);
                        nx nxVar = tyVar.F3;
                        if (nxVar != null) {
                            nxVar.setVisibility(8);
                        }
                    } else {
                        tyVar.f42239r3 = false;
                        dy dyVar = tyVar.C0;
                        if (dyVar != null) {
                            dyVar.setVisibility(8);
                        }
                        jy jyVar = tyVar.X;
                        if (jyVar != null) {
                            jyVar.c();
                        }
                        dy dyVar2 = tyVar.C0;
                        if (dyVar2 != null) {
                            dyVar2.A0.clear();
                            dyVar2.J();
                        }
                        py pyVar = tyVar.f42172e0[0].f41788a;
                        if (pyVar.f30202g1) {
                            pyVar.f30202g1 = false;
                            pyVar.K0(false);
                        }
                        tyVar.f42233q3 = false;
                        nx nxVar2 = tyVar.F3;
                        if (nxVar2 != null) {
                            nxVar2.setVisibility(0);
                        }
                    }
                    View view = tyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    tyVar.A4(f7);
                    tyVar.f42172e0[0].f41788a.setVerticalScrollBarEnabled(true);
                    dy dyVar3 = tyVar.C0;
                    if (dyVar3 != null) {
                        dyVar3.setBackground(null);
                    }
                    tyVar.f42264w1 = null;
                    return;
                }
                return;
            case 1:
                ty tyVar2 = this.f42144c;
                tyVar2.O3 = null;
                if (!this.f42143b && (v0Var = tyVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                ty tyVar3 = this.f42144c;
                tyVar3.I = null;
                boolean z11 = this.f42143b;
                tyVar3.K = z11;
                if (!z11 && !tyVar3.L) {
                    tyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    tyVar3.z4(0.0f);
                    tyVar3.f42271x3 = AndroidUtilities.dp(81.0f);
                } else {
                    tyVar3.f42271x3 = -AndroidUtilities.dp(81.0f);
                    tyVar3.z4(-tyVar3.R3());
                }
                int i11 = 0;
                while (true) {
                    sy[] syVarArr = tyVar3.f42172e0;
                    if (i11 < syVarArr.length) {
                        sy syVar = syVarArr[i11];
                        if (syVar != null) {
                            syVar.f41788a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = tyVar3.fragmentView;
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
