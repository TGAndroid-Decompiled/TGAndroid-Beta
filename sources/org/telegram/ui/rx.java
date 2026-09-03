package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rx extends AnimatorListenerAdapter {
    public final int f38066a;
    public final boolean f38067b;
    public final qy f38068c;

    public rx(qy qyVar, boolean z4, int i10) {
        this.f38066a = i10;
        this.f38068c = qyVar;
        this.f38067b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38066a) {
            case 0:
                qy qyVar = this.f38068c;
                qyVar.f37580l3.unlock();
                if (qyVar.f37620t1 == animator) {
                    if (this.f38067b) {
                        qyVar.f37527b0[0].f37246a.b1();
                    } else {
                        my myVar = qyVar.f37527b0[0].f37246a;
                        if (myVar.f28497f1) {
                            myVar.f28497f1 = false;
                            myVar.J0(false);
                        }
                    }
                    qyVar.f37620t1 = null;
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
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.f38066a) {
            case 0:
                qy qyVar = this.f38068c;
                qyVar.f37580l3.unlock();
                if (qyVar.f37620t1 == animator) {
                    qyVar.A4(false, true);
                    boolean z4 = this.f38067b;
                    if (z4) {
                        qyVar.f37527b0[0].f37246a.b1();
                        ix ixVar = qyVar.B0;
                        if (ixVar != null) {
                            ixVar.setVisibility(8);
                        }
                        qyVar.f37590n3 = true;
                        Activity parentActivity = qyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) qyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        qyVar.f37553g0.setVisibility(8);
                        lx lxVar = qyVar.C3;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                    } else {
                        qyVar.f37595o3 = false;
                        zx zxVar = qyVar.f37647z0;
                        if (zxVar != null) {
                            zxVar.setVisibility(8);
                        }
                        gy gyVar = qyVar.U;
                        if (gyVar != null) {
                            gyVar.c();
                        }
                        zx zxVar2 = qyVar.f37647z0;
                        if (zxVar2 != null) {
                            zxVar2.f24005x0.clear();
                            zxVar2.J();
                        }
                        my myVar = qyVar.f37527b0[0].f37246a;
                        if (myVar.f28497f1) {
                            myVar.f28497f1 = false;
                            myVar.J0(false);
                        }
                        qyVar.f37590n3 = false;
                        lx lxVar2 = qyVar.C3;
                        if (lxVar2 != null) {
                            lxVar2.setVisibility(0);
                        }
                    }
                    View view = qyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    qyVar.D4(f10);
                    qyVar.f37527b0[0].f37246a.setVerticalScrollBarEnabled(true);
                    zx zxVar3 = qyVar.f37647z0;
                    if (zxVar3 != null) {
                        zxVar3.setBackground(null);
                    }
                    qyVar.f37620t1 = null;
                    return;
                }
                return;
            case 1:
                qy qyVar2 = this.f38068c;
                qyVar2.M3 = null;
                if (!this.f38067b && (w0Var = qyVar2.f37568j0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                qy qyVar3 = this.f38068c;
                qyVar3.F = null;
                boolean z10 = this.f38067b;
                qyVar3.H = z10;
                if (!z10 && !qyVar3.I) {
                    qyVar3.B0.setVisibility(8);
                }
                if (!z10) {
                    qyVar3.C4(0.0f);
                    qyVar3.f37627u3 = AndroidUtilities.dp(81.0f);
                } else {
                    qyVar3.f37627u3 = -AndroidUtilities.dp(81.0f);
                    qyVar3.C4(-qyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    py[] pyVarArr = qyVar3.f37527b0;
                    if (i11 < pyVarArr.length) {
                        py pyVar = pyVarArr[i11];
                        if (pyVar != null) {
                            pyVar.f37246a.requestLayout();
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
