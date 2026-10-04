package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sx extends AnimatorListenerAdapter {
    public final int f40625a;
    public final boolean f40626b;
    public final uy f40627c;

    public sx(uy uyVar, boolean z10, int i10) {
        this.f40625a = i10;
        this.f40627c = uyVar;
        this.f40626b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40625a) {
            case 0:
                uy uyVar = this.f40627c;
                uyVar.f41443o3.unlock();
                if (uyVar.f41483w1 == animator) {
                    if (this.f40626b) {
                        uyVar.f41392e0[0].f40983a.d1();
                    } else {
                        qy qyVar = uyVar.f41392e0[0].f40983a;
                        if (qyVar.f33531i1) {
                            qyVar.f33531i1 = false;
                            qyVar.L0(false);
                        }
                    }
                    uyVar.f41483w1 = null;
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
        switch (this.f40625a) {
            case 0:
                uy uyVar = this.f40627c;
                uyVar.f41443o3.unlock();
                if (uyVar.f41483w1 == animator) {
                    uyVar.J4(false, true);
                    boolean z10 = this.f40626b;
                    if (z10) {
                        uyVar.f41392e0[0].f40983a.d1();
                        jx jxVar = uyVar.E0;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                        uyVar.f41453q3 = true;
                        Activity parentActivity = uyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) uyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        uyVar.f41418j0.setVisibility(8);
                        mx mxVar = uyVar.F3;
                        if (mxVar != null) {
                            mxVar.setVisibility(8);
                        }
                    } else {
                        uyVar.f41459r3 = false;
                        dy dyVar = uyVar.C0;
                        if (dyVar != null) {
                            dyVar.setVisibility(8);
                        }
                        iy iyVar = uyVar.X;
                        if (iyVar != null) {
                            iyVar.c();
                        }
                        dy dyVar2 = uyVar.C0;
                        if (dyVar2 != null) {
                            dyVar2.B0.clear();
                            dyVar2.L();
                        }
                        qy qyVar = uyVar.f41392e0[0].f40983a;
                        if (qyVar.f33531i1) {
                            qyVar.f33531i1 = false;
                            qyVar.L0(false);
                        }
                        uyVar.f41453q3 = false;
                        mx mxVar2 = uyVar.F3;
                        if (mxVar2 != null) {
                            mxVar2.setVisibility(0);
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
                    uyVar.M4(f7);
                    uyVar.f41392e0[0].f40983a.setVerticalScrollBarEnabled(true);
                    dy dyVar3 = uyVar.C0;
                    if (dyVar3 != null) {
                        dyVar3.setBackground(null);
                    }
                    uyVar.f41483w1 = null;
                    return;
                }
                return;
            case 1:
                uy uyVar2 = this.f40627c;
                uyVar2.O3 = null;
                if (!this.f40626b && (v0Var = uyVar2.m0) != null) {
                    v0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                uy uyVar3 = this.f40627c;
                uyVar3.I = null;
                boolean z11 = this.f40626b;
                uyVar3.K = z11;
                if (!z11 && !uyVar3.L) {
                    uyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    uyVar3.L4(0.0f);
                    uyVar3.f41490x3 = AndroidUtilities.dp(81.0f);
                } else {
                    uyVar3.f41490x3 = -AndroidUtilities.dp(81.0f);
                    uyVar3.L4(-uyVar3.d4());
                }
                int i11 = 0;
                while (true) {
                    ty[] tyVarArr = uyVar3.f41392e0;
                    if (i11 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i11];
                        if (tyVar != null) {
                            tyVar.f40983a.requestLayout();
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
