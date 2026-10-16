package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yx extends AnimatorListenerAdapter {
    public final int f41972a;
    public final boolean f41973b;
    public final yy f41974c;

    public yx(yy yyVar, boolean z10, int i10) {
        this.f41972a = i10;
        this.f41974c = yyVar;
        this.f41973b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41972a) {
            case 0:
                yy yyVar = this.f41974c;
                yyVar.f42061p3.unlock();
                if (yyVar.f42097w1 == animator) {
                    if (this.f41973b) {
                        yyVar.f42004e0[0].f41679a.c1();
                    } else {
                        uy uyVar = yyVar.f42004e0[0].f41679a;
                        if (uyVar.f27134g1) {
                            uyVar.f27134g1 = false;
                            uyVar.K0(false);
                        }
                    }
                    yyVar.f42097w1 = null;
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
        switch (this.f41972a) {
            case 0:
                yy yyVar = this.f41974c;
                yyVar.f42061p3.unlock();
                if (yyVar.f42097w1 == animator) {
                    yyVar.y4(false, true);
                    boolean z10 = this.f41973b;
                    if (z10) {
                        yyVar.f42004e0[0].f41679a.c1();
                        px pxVar = yyVar.E0;
                        if (pxVar != null) {
                            pxVar.setVisibility(8);
                        }
                        yyVar.f42072r3 = true;
                        Activity parentActivity = yyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) yyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        yyVar.f42030j0.setVisibility(8);
                        sx sxVar = yyVar.G3;
                        if (sxVar != null) {
                            sxVar.setVisibility(8);
                        }
                    } else {
                        yyVar.f42078s3 = false;
                        iy iyVar = yyVar.C0;
                        if (iyVar != null) {
                            iyVar.setVisibility(8);
                        }
                        oy oyVar = yyVar.X;
                        if (oyVar != null) {
                            oyVar.c();
                        }
                        iy iyVar2 = yyVar.C0;
                        if (iyVar2 != null) {
                            iyVar2.A0.clear();
                            iyVar2.J();
                        }
                        uy uyVar = yyVar.f42004e0[0].f41679a;
                        if (uyVar.f27134g1) {
                            uyVar.f27134g1 = false;
                            uyVar.K0(false);
                        }
                        yyVar.f42072r3 = false;
                        sx sxVar2 = yyVar.G3;
                        if (sxVar2 != null) {
                            sxVar2.setVisibility(0);
                        }
                    }
                    View view = yyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    yyVar.B4(f7);
                    yyVar.f42004e0[0].f41679a.setVerticalScrollBarEnabled(true);
                    iy iyVar3 = yyVar.C0;
                    if (iyVar3 != null) {
                        iyVar3.setBackground(null);
                    }
                    yyVar.f42097w1 = null;
                    return;
                }
                return;
            case 1:
                yy yyVar2 = this.f41974c;
                yyVar2.P3 = null;
                if (!this.f41973b && (u0Var = yyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                yy yyVar3 = this.f41974c;
                yyVar3.I = null;
                boolean z11 = this.f41973b;
                yyVar3.K = z11;
                if (!z11 && !yyVar3.L) {
                    yyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    yyVar3.A4(0.0f);
                    yyVar3.y3 = AndroidUtilities.dp(81.0f);
                } else {
                    yyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    yyVar3.A4(-yyVar3.S3());
                }
                int i11 = 0;
                while (true) {
                    xy[] xyVarArr = yyVar3.f42004e0;
                    if (i11 < xyVarArr.length) {
                        xy xyVar = xyVarArr[i11];
                        if (xyVar != null) {
                            xyVar.f41679a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = yyVar3.fragmentView;
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
