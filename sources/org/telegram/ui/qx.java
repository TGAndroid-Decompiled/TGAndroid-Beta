package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qx extends AnimatorListenerAdapter {
    public final int f40707a;
    public final boolean f40708b;
    public final py f40709c;

    public qx(py pyVar, boolean z4, int i10) {
        this.f40707a = i10;
        this.f40709c = pyVar;
        this.f40708b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40707a) {
            case 0:
                py pyVar = this.f40709c;
                pyVar.f40209l3.unlock();
                if (pyVar.f40249t1 == animator) {
                    if (this.f40708b) {
                        pyVar.f40155b0[0].f39822a.b1();
                    } else {
                        ly lyVar = pyVar.f40155b0[0].f39822a;
                        if (lyVar.f31092f1) {
                            lyVar.f31092f1 = false;
                            lyVar.J0(false);
                        }
                    }
                    pyVar.f40249t1 = null;
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
        switch (this.f40707a) {
            case 0:
                py pyVar = this.f40709c;
                pyVar.f40209l3.unlock();
                if (pyVar.f40249t1 == animator) {
                    pyVar.A4(false, true);
                    boolean z4 = this.f40708b;
                    if (z4) {
                        pyVar.f40155b0[0].f39822a.b1();
                        hx hxVar = pyVar.B0;
                        if (hxVar != null) {
                            hxVar.setVisibility(8);
                        }
                        pyVar.f40219n3 = true;
                        Activity parentActivity = pyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) pyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        pyVar.f40182g0.setVisibility(8);
                        kx kxVar = pyVar.C3;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                    } else {
                        pyVar.f40224o3 = false;
                        yx yxVar = pyVar.f40276z0;
                        if (yxVar != null) {
                            yxVar.setVisibility(8);
                        }
                        fy fyVar = pyVar.U;
                        if (fyVar != null) {
                            fyVar.c();
                        }
                        yx yxVar2 = pyVar.f40276z0;
                        if (yxVar2 != null) {
                            yxVar2.f26342x0.clear();
                            yxVar2.J();
                        }
                        ly lyVar = pyVar.f40155b0[0].f39822a;
                        if (lyVar.f31092f1) {
                            lyVar.f31092f1 = false;
                            lyVar.J0(false);
                        }
                        pyVar.f40219n3 = false;
                        kx kxVar2 = pyVar.C3;
                        if (kxVar2 != null) {
                            kxVar2.setVisibility(0);
                        }
                    }
                    View view = pyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z4) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    pyVar.D4(f10);
                    pyVar.f40155b0[0].f39822a.setVerticalScrollBarEnabled(true);
                    yx yxVar3 = pyVar.f40276z0;
                    if (yxVar3 != null) {
                        yxVar3.setBackground(null);
                    }
                    pyVar.f40249t1 = null;
                    return;
                }
                return;
            case 1:
                py pyVar2 = this.f40709c;
                pyVar2.M3 = null;
                if (!this.f40708b && (w0Var = pyVar2.f40197j0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                py pyVar3 = this.f40709c;
                pyVar3.F = null;
                boolean z10 = this.f40708b;
                pyVar3.H = z10;
                if (!z10 && !pyVar3.I) {
                    pyVar3.B0.setVisibility(8);
                }
                if (!z10) {
                    pyVar3.C4(0.0f);
                    pyVar3.f40256u3 = AndroidUtilities.dp(81.0f);
                } else {
                    pyVar3.f40256u3 = -AndroidUtilities.dp(81.0f);
                    pyVar3.C4(-pyVar3.U3());
                }
                int i11 = 0;
                while (true) {
                    oy[] oyVarArr = pyVar3.f40155b0;
                    if (i11 < oyVarArr.length) {
                        oy oyVar = oyVarArr[i11];
                        if (oyVar != null) {
                            oyVar.f39822a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = pyVar3.fragmentView;
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
