package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qx extends AnimatorListenerAdapter {
    public final int f37004a;
    public final boolean f37005b;
    public final qy f37006c;

    public qx(qy qyVar, boolean z10, int i10) {
        this.f37004a = i10;
        this.f37006c = qyVar;
        this.f37005b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37004a) {
            case 0:
                qy qyVar = this.f37006c;
                qyVar.f37085o3.unlock();
                if (qyVar.f37126w1 == animator) {
                    if (this.f37005b) {
                        qyVar.f37034e0[0].f36695a.c1();
                    } else {
                        my myVar = qyVar.f37034e0[0].f36695a;
                        if (myVar.f30101i1) {
                            myVar.f30101i1 = false;
                            myVar.K0(false);
                        }
                    }
                    qyVar.f37126w1 = null;
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
        switch (this.f37004a) {
            case 0:
                qy qyVar = this.f37006c;
                qyVar.f37085o3.unlock();
                if (qyVar.f37126w1 == animator) {
                    qyVar.A4(false, true);
                    boolean z10 = this.f37005b;
                    if (z10) {
                        qyVar.f37034e0[0].f36695a.c1();
                        hx hxVar = qyVar.E0;
                        if (hxVar != null) {
                            hxVar.setVisibility(8);
                        }
                        qyVar.f37095q3 = true;
                        Activity parentActivity = qyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) qyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        qyVar.f37060j0.setVisibility(8);
                        kx kxVar = qyVar.F3;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                    } else {
                        qyVar.f37101r3 = false;
                        zx zxVar = qyVar.C0;
                        if (zxVar != null) {
                            zxVar.setVisibility(8);
                        }
                        gy gyVar = qyVar.X;
                        if (gyVar != null) {
                            gyVar.c();
                        }
                        zx zxVar2 = qyVar.C0;
                        if (zxVar2 != null) {
                            zxVar2.A0.clear();
                            zxVar2.J();
                        }
                        my myVar = qyVar.f37034e0[0].f36695a;
                        if (myVar.f30101i1) {
                            myVar.f30101i1 = false;
                            myVar.K0(false);
                        }
                        qyVar.f37095q3 = false;
                        kx kxVar2 = qyVar.F3;
                        if (kxVar2 != null) {
                            kxVar2.setVisibility(0);
                        }
                    }
                    View view = qyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    qyVar.D4(f7);
                    qyVar.f37034e0[0].f36695a.setVerticalScrollBarEnabled(true);
                    zx zxVar3 = qyVar.C0;
                    if (zxVar3 != null) {
                        zxVar3.setBackground(null);
                    }
                    qyVar.f37126w1 = null;
                    return;
                }
                return;
            case 1:
                qy qyVar2 = this.f37006c;
                qyVar2.O3 = null;
                if (!this.f37005b && (u0Var = qyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                qy qyVar3 = this.f37006c;
                qyVar3.I = null;
                boolean z11 = this.f37005b;
                qyVar3.K = z11;
                if (!z11 && !qyVar3.L) {
                    qyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    qyVar3.C4(0.0f);
                    qyVar3.f37133x3 = AndroidUtilities.dp(81.0f);
                } else {
                    qyVar3.f37133x3 = -AndroidUtilities.dp(81.0f);
                    qyVar3.C4(-qyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    py[] pyVarArr = qyVar3.f37034e0;
                    if (i11 < pyVarArr.length) {
                        py pyVar = pyVarArr[i11];
                        if (pyVar != null) {
                            pyVar.f36695a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = qyVar3.fragmentView;
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
