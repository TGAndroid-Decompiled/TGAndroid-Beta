package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class yv extends AnimatorListenerAdapter {
    public final int f52333a;
    public final boolean f52334b;
    public final ww f52335c;

    public yv(ww wwVar, boolean z9, int i7) {
        this.f52333a = i7;
        this.f52335c = wwVar;
        this.f52334b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f52333a) {
            case 0:
                ww wwVar = this.f52335c;
                wwVar.f51589p3.e();
                if (wwVar.f51625w1 == animator) {
                    if (this.f52334b) {
                        wwVar.f51534e0[0].f50833a.c1();
                    } else {
                        sw swVar = wwVar.f51534e0[0].f50833a;
                        if (swVar.f37047g1) {
                            swVar.f37047g1 = false;
                            swVar.K0(false);
                        }
                    }
                    wwVar.f51625w1 = null;
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
        float f10;
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.f52333a) {
            case 0:
                ww wwVar = this.f52335c;
                wwVar.f51589p3.e();
                if (wwVar.f51625w1 == animator) {
                    wwVar.M4(false, true);
                    boolean z9 = this.f52334b;
                    if (z9) {
                        wwVar.f51534e0[0].f50833a.c1();
                        pv pvVar = wwVar.E0;
                        if (pvVar != null) {
                            pvVar.setVisibility(8);
                        }
                        wwVar.f51600r3 = true;
                        Activity parentActivity = wwVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) wwVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        wwVar.f51560j0.setVisibility(8);
                        sv svVar = wwVar.F3;
                        if (svVar != null) {
                            svVar.setVisibility(8);
                        }
                    } else {
                        wwVar.f51606s3 = false;
                        fw fwVar = wwVar.C0;
                        if (fwVar != null) {
                            fwVar.setVisibility(8);
                        }
                        lw lwVar = wwVar.X;
                        if (lwVar != null) {
                            lwVar.c();
                        }
                        fw fwVar2 = wwVar.C0;
                        if (fwVar2 != null) {
                            fwVar2.C0.clear();
                            fwVar2.L();
                        }
                        sw swVar = wwVar.f51534e0[0].f50833a;
                        if (swVar.f37047g1) {
                            swVar.f37047g1 = false;
                            swVar.K0(false);
                        }
                        wwVar.f51600r3 = false;
                        sv svVar2 = wwVar.F3;
                        if (svVar2 != null) {
                            svVar2.setVisibility(0);
                        }
                    }
                    View view = wwVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    wwVar.P4(f10);
                    wwVar.f51534e0[0].f50833a.setVerticalScrollBarEnabled(true);
                    fw fwVar3 = wwVar.C0;
                    if (fwVar3 != null) {
                        fwVar3.setBackground(null);
                    }
                    wwVar.f51625w1 = null;
                    return;
                }
                return;
            case 1:
                ww wwVar2 = this.f52335c;
                wwVar2.O3 = null;
                if (!this.f52334b && (r0Var = wwVar2.m0) != null) {
                    r0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                ww wwVar3 = this.f52335c;
                wwVar3.I = null;
                boolean z10 = this.f52334b;
                wwVar3.K = z10;
                if (!z10 && !wwVar3.L) {
                    wwVar3.E0.setVisibility(8);
                }
                if (!z10) {
                    wwVar3.O4(0.0f);
                    wwVar3.f51638y3 = org.telegram.messenger.g0.L(81.0f);
                } else {
                    wwVar3.f51638y3 = -org.telegram.messenger.g0.L(81.0f);
                    wwVar3.O4(-wwVar3.g4());
                }
                int i10 = 0;
                while (true) {
                    vw[] vwVarArr = wwVar3.f51534e0;
                    if (i10 < vwVarArr.length) {
                        vw vwVar = vwVarArr[i10];
                        if (vwVar != null) {
                            vwVar.f50833a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = wwVar3.fragmentView;
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
