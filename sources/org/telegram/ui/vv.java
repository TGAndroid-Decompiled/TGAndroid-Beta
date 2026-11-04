package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
public final class vv extends AnimatorListenerAdapter {
    public final int f50617a;
    public final boolean f50618b;
    public final uw f50619c;

    public vv(uw uwVar, boolean z10, int i3) {
        this.f50617a = i3;
        this.f50619c = uwVar;
        this.f50618b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50617a) {
            case 0:
                uw uwVar = this.f50619c;
                uwVar.f50284q3.e();
                if (uwVar.f50321x1 == animator) {
                    if (this.f50618b) {
                        uwVar.f50230f0[0].f49897a.c1();
                    } else {
                        pw pwVar = uwVar.f50230f0[0].f49897a;
                        if (pwVar.f38447h1) {
                            pwVar.f38447h1 = false;
                            pwVar.K0(false);
                        }
                    }
                    uwVar.f50321x1 = null;
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
        int i3;
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.f50617a) {
            case 0:
                uw uwVar = this.f50619c;
                uwVar.f50284q3.e();
                if (uwVar.f50321x1 == animator) {
                    uwVar.M4(false, true);
                    boolean z10 = this.f50618b;
                    if (z10) {
                        uwVar.f50230f0[0].f49897a.c1();
                        mv mvVar = uwVar.F0;
                        if (mvVar != null) {
                            mvVar.setVisibility(8);
                        }
                        uwVar.f50296s3 = true;
                        Activity parentActivity = uwVar.getParentActivity();
                        i3 = ((org.telegram.ui.ActionBar.d2) uwVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i3);
                        uwVar.f50254k0.setVisibility(8);
                        pv pvVar = uwVar.G3;
                        if (pvVar != null) {
                            pvVar.setVisibility(8);
                        }
                    } else {
                        uwVar.f50301t3 = false;
                        cw cwVar = uwVar.D0;
                        if (cwVar != null) {
                            cwVar.setVisibility(8);
                        }
                        iw iwVar = uwVar.Y;
                        if (iwVar != null) {
                            iwVar.c();
                        }
                        cw cwVar2 = uwVar.D0;
                        if (cwVar2 != null) {
                            cwVar2.D0.clear();
                            cwVar2.L();
                        }
                        pw pwVar = uwVar.f50230f0[0].f49897a;
                        if (pwVar.f38447h1) {
                            pwVar.f38447h1 = false;
                            pwVar.K0(false);
                        }
                        uwVar.f50296s3 = false;
                        pv pvVar2 = uwVar.G3;
                        if (pvVar2 != null) {
                            pvVar2.setVisibility(0);
                        }
                    }
                    View view = uwVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    uwVar.P4(f10);
                    uwVar.f50230f0[0].f49897a.setVerticalScrollBarEnabled(true);
                    cw cwVar3 = uwVar.D0;
                    if (cwVar3 != null) {
                        cwVar3.setBackground(null);
                    }
                    uwVar.f50321x1 = null;
                    return;
                }
                return;
            case 1:
                uw uwVar2 = this.f50619c;
                uwVar2.P3 = null;
                if (!this.f50618b && (q0Var = uwVar2.f50267n0) != null) {
                    q0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                uw uwVar3 = this.f50619c;
                uwVar3.J = null;
                boolean z11 = this.f50618b;
                uwVar3.L = z11;
                if (!z11 && !uwVar3.M) {
                    uwVar3.F0.setVisibility(8);
                }
                if (!z11) {
                    uwVar3.O4(0.0f);
                    uwVar3.f50333z3 = org.telegram.messenger.g0.L(81.0f);
                } else {
                    uwVar3.f50333z3 = -org.telegram.messenger.g0.L(81.0f);
                    uwVar3.O4(-uwVar3.g4());
                }
                int i10 = 0;
                while (true) {
                    tw[] twVarArr = uwVar3.f50230f0;
                    if (i10 < twVarArr.length) {
                        tw twVar = twVarArr[i10];
                        if (twVar != null) {
                            twVar.f49897a.requestLayout();
                        }
                        i10++;
                    } else {
                        View view2 = uwVar3.fragmentView;
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
