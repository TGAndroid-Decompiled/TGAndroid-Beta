package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class sx extends AnimatorListenerAdapter {
    public final int f41911a;
    public final boolean f41912b;
    public final sy f41913c;

    public sx(sy syVar, boolean z10, int i10) {
        this.f41911a = i10;
        this.f41913c = syVar;
        this.f41912b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41911a) {
            case 0:
                sy syVar = this.f41913c;
                syVar.f41992o3.unlock();
                if (syVar.f42033w1 == animator) {
                    if (this.f41912b) {
                        syVar.f41941e0[0].f41564a.c1();
                    } else {
                        oy oyVar = syVar.f41941e0[0].f41564a;
                        if (oyVar.f30556g1) {
                            oyVar.f30556g1 = false;
                            oyVar.K0(false);
                        }
                    }
                    syVar.f42033w1 = null;
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
        switch (this.f41911a) {
            case 0:
                sy syVar = this.f41913c;
                syVar.f41992o3.unlock();
                if (syVar.f42033w1 == animator) {
                    syVar.x4(false, true);
                    boolean z10 = this.f41912b;
                    if (z10) {
                        syVar.f41941e0[0].f41564a.c1();
                        jx jxVar = syVar.E0;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                        syVar.f42002q3 = true;
                        Activity parentActivity = syVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) syVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        syVar.f41967j0.setVisibility(8);
                        mx mxVar = syVar.F3;
                        if (mxVar != null) {
                            mxVar.setVisibility(8);
                        }
                    } else {
                        syVar.f42008r3 = false;
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
                        oy oyVar = syVar.f41941e0[0].f41564a;
                        if (oyVar.f30556g1) {
                            oyVar.f30556g1 = false;
                            oyVar.K0(false);
                        }
                        syVar.f42002q3 = false;
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
                    syVar.f41941e0[0].f41564a.setVerticalScrollBarEnabled(true);
                    cy cyVar3 = syVar.C0;
                    if (cyVar3 != null) {
                        cyVar3.setBackground(null);
                    }
                    syVar.f42033w1 = null;
                    return;
                }
                return;
            case 1:
                sy syVar2 = this.f41913c;
                syVar2.O3 = null;
                if (!this.f41912b && (u0Var = syVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                sy syVar3 = this.f41913c;
                syVar3.I = null;
                boolean z11 = this.f41912b;
                syVar3.K = z11;
                if (!z11 && !syVar3.L) {
                    syVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    syVar3.z4(0.0f);
                    syVar3.f42040x3 = AndroidUtilities.dp(81.0f);
                } else {
                    syVar3.f42040x3 = -AndroidUtilities.dp(81.0f);
                    syVar3.z4(-syVar3.R3());
                }
                int i11 = 0;
                while (true) {
                    ry[] ryVarArr = syVar3.f41941e0;
                    if (i11 < ryVarArr.length) {
                        ry ryVar = ryVarArr[i11];
                        if (ryVar != null) {
                            ryVar.f41564a.requestLayout();
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
