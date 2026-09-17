package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class wx extends AnimatorListenerAdapter {
    public final int f39185a;
    public final boolean f39186b;
    public final wy f39187c;

    public wx(wy wyVar, boolean z10, int i10) {
        this.f39185a = i10;
        this.f39187c = wyVar;
        this.f39186b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39185a) {
            case 0:
                wy wyVar = this.f39187c;
                wyVar.f39266o3.unlock();
                if (wyVar.f39307w1 == animator) {
                    if (this.f39186b) {
                        wyVar.f39215e0[0].f38522a.d1();
                    } else {
                        sy syVar = wyVar.f39215e0[0].f38522a;
                        if (syVar.f26177i1) {
                            syVar.f26177i1 = false;
                            syVar.L0(false);
                        }
                    }
                    wyVar.f39307w1 = null;
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
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.f39185a) {
            case 0:
                wy wyVar = this.f39187c;
                wyVar.f39266o3.unlock();
                if (wyVar.f39307w1 == animator) {
                    wyVar.A4(false, true);
                    boolean z10 = this.f39186b;
                    if (z10) {
                        wyVar.f39215e0[0].f38522a.d1();
                        nx nxVar = wyVar.E0;
                        if (nxVar != null) {
                            nxVar.setVisibility(8);
                        }
                        wyVar.f39276q3 = true;
                        Activity parentActivity = wyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) wyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        wyVar.f39241j0.setVisibility(8);
                        qx qxVar = wyVar.F3;
                        if (qxVar != null) {
                            qxVar.setVisibility(8);
                        }
                    } else {
                        wyVar.f39282r3 = false;
                        gy gyVar = wyVar.C0;
                        if (gyVar != null) {
                            gyVar.setVisibility(8);
                        }
                        my myVar = wyVar.X;
                        if (myVar != null) {
                            myVar.c();
                        }
                        gy gyVar2 = wyVar.C0;
                        if (gyVar2 != null) {
                            gyVar2.B0.clear();
                            gyVar2.K();
                        }
                        sy syVar = wyVar.f39215e0[0].f38522a;
                        if (syVar.f26177i1) {
                            syVar.f26177i1 = false;
                            syVar.L0(false);
                        }
                        wyVar.f39276q3 = false;
                        qx qxVar2 = wyVar.F3;
                        if (qxVar2 != null) {
                            qxVar2.setVisibility(0);
                        }
                    }
                    View view = wyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    wyVar.D4(f7);
                    wyVar.f39215e0[0].f38522a.setVerticalScrollBarEnabled(true);
                    gy gyVar3 = wyVar.C0;
                    if (gyVar3 != null) {
                        gyVar3.setBackground(null);
                    }
                    wyVar.f39307w1 = null;
                    return;
                }
                return;
            case 1:
                wy wyVar2 = this.f39187c;
                wyVar2.P3 = null;
                if (!this.f39186b && (w0Var = wyVar2.m0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                wy wyVar3 = this.f39187c;
                wyVar3.I = null;
                boolean z11 = this.f39186b;
                wyVar3.K = z11;
                if (!z11 && !wyVar3.L) {
                    wyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    wyVar3.C4(0.0f);
                    wyVar3.f39315x3 = AndroidUtilities.dp(81.0f);
                } else {
                    wyVar3.f39315x3 = -AndroidUtilities.dp(81.0f);
                    wyVar3.C4(-wyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    vy[] vyVarArr = wyVar3.f39215e0;
                    if (i11 < vyVarArr.length) {
                        vy vyVar = vyVarArr[i11];
                        if (vyVar != null) {
                            vyVar.f38522a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = wyVar3.fragmentView;
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
