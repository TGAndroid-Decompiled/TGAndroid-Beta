package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sx extends AnimatorListenerAdapter {
    public final int f41877a;
    public final boolean f41878b;
    public final sy f41879c;

    public sx(sy syVar, boolean z10, int i10) {
        this.f41877a = i10;
        this.f41879c = syVar;
        this.f41878b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41877a) {
            case 0:
                sy syVar = this.f41879c;
                syVar.f41958o3.unlock();
                if (syVar.f41999w1 == animator) {
                    if (this.f41878b) {
                        syVar.f41907e0[0].f41530a.c1();
                    } else {
                        oy oyVar = syVar.f41907e0[0].f41530a;
                        if (oyVar.f30793g1) {
                            oyVar.f30793g1 = false;
                            oyVar.K0(false);
                        }
                    }
                    syVar.f41999w1 = null;
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
        org.telegram.ui.ActionBar.u0 u0Var;
        switch (this.f41877a) {
            case 0:
                sy syVar = this.f41879c;
                syVar.f41958o3.unlock();
                if (syVar.f41999w1 == animator) {
                    syVar.x4(false, true);
                    boolean z10 = this.f41878b;
                    if (z10) {
                        syVar.f41907e0[0].f41530a.c1();
                        jx jxVar = syVar.E0;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                        syVar.f41968q3 = true;
                        Activity parentActivity = syVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) syVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        syVar.f41933j0.setVisibility(8);
                        mx mxVar = syVar.F3;
                        if (mxVar != null) {
                            mxVar.setVisibility(8);
                        }
                    } else {
                        syVar.f41974r3 = false;
                        cy cyVar = syVar.C0;
                        if (cyVar != null) {
                            cyVar.setVisibility(8);
                        }
                        iy iyVar = syVar.X;
                        if (iyVar != null) {
                            iyVar.c();
                        }
                        cy cyVar2 = syVar.C0;
                        if (cyVar2 != null) {
                            cyVar2.A0.clear();
                            cyVar2.J();
                        }
                        oy oyVar = syVar.f41907e0[0].f41530a;
                        if (oyVar.f30793g1) {
                            oyVar.f30793g1 = false;
                            oyVar.K0(false);
                        }
                        syVar.f41968q3 = false;
                        mx mxVar2 = syVar.F3;
                        if (mxVar2 != null) {
                            mxVar2.setVisibility(0);
                        }
                    }
                    View view = syVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    syVar.A4(f7);
                    syVar.f41907e0[0].f41530a.setVerticalScrollBarEnabled(true);
                    cy cyVar3 = syVar.C0;
                    if (cyVar3 != null) {
                        cyVar3.setBackground(null);
                    }
                    syVar.f41999w1 = null;
                    return;
                }
                return;
            case 1:
                sy syVar2 = this.f41879c;
                syVar2.O3 = null;
                if (!this.f41878b && (u0Var = syVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                sy syVar3 = this.f41879c;
                syVar3.I = null;
                boolean z11 = this.f41878b;
                syVar3.K = z11;
                if (!z11 && !syVar3.L) {
                    syVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    syVar3.z4(0.0f);
                    syVar3.f42006x3 = AndroidUtilities.dp(81.0f);
                } else {
                    syVar3.f42006x3 = -AndroidUtilities.dp(81.0f);
                    syVar3.z4(-syVar3.R3());
                }
                int i11 = 0;
                while (true) {
                    ry[] ryVarArr = syVar3.f41907e0;
                    if (i11 < ryVarArr.length) {
                        ry ryVar = ryVarArr[i11];
                        if (ryVar != null) {
                            ryVar.f41530a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = syVar3.fragmentView;
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
