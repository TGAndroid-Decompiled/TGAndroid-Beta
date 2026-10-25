package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zw extends AnimatorListenerAdapter {
    public final int f46372a;
    public final boolean f46373b;
    public final cy f46374c;

    public zw(cy cyVar, boolean z10, int i10) {
        this.f46372a = i10;
        this.f46374c = cyVar;
        this.f46373b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f46372a) {
            case 0:
                cy cyVar = this.f46374c;
                cyVar.f38640p3.unlock();
                if (cyVar.f38676w1 == animator) {
                    if (this.f46373b) {
                        cyVar.f38583e0[0].f37910a.c1();
                    } else {
                        wx wxVar = cyVar.f38583e0[0].f37910a;
                        if (wxVar.f30630g1) {
                            wxVar.f30630g1 = false;
                            wxVar.K0(false);
                        }
                    }
                    cyVar.f38676w1 = null;
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
        switch (this.f46372a) {
            case 0:
                cy cyVar = this.f46374c;
                cyVar.f38640p3.unlock();
                if (cyVar.f38676w1 == animator) {
                    cyVar.I4(false, true);
                    boolean z10 = this.f46373b;
                    if (z10) {
                        cyVar.f38583e0[0].f37910a.c1();
                        qw qwVar = cyVar.E0;
                        if (qwVar != null) {
                            qwVar.setVisibility(8);
                        }
                        cyVar.f38651r3 = true;
                        Activity parentActivity = cyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.r2) cyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        cyVar.f38609j0.setVisibility(8);
                        tw twVar = cyVar.G3;
                        if (twVar != null) {
                            twVar.setVisibility(8);
                        }
                    } else {
                        cyVar.f38657s3 = false;
                        jx jxVar = cyVar.C0;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                        ox oxVar = cyVar.X;
                        if (oxVar != null) {
                            oxVar.c();
                        }
                        jx jxVar2 = cyVar.C0;
                        if (jxVar2 != null) {
                            jxVar2.C0.clear();
                            jxVar2.L();
                        }
                        wx wxVar = cyVar.f38583e0[0].f37910a;
                        if (wxVar.f30630g1) {
                            wxVar.f30630g1 = false;
                            wxVar.K0(false);
                        }
                        cyVar.f38651r3 = false;
                        tw twVar2 = cyVar.G3;
                        if (twVar2 != null) {
                            twVar2.setVisibility(0);
                        }
                    }
                    View view = cyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    cyVar.L4(f7);
                    cyVar.f38583e0[0].f37910a.setVerticalScrollBarEnabled(true);
                    jx jxVar3 = cyVar.C0;
                    if (jxVar3 != null) {
                        jxVar3.setBackground(null);
                    }
                    cyVar.f38676w1 = null;
                    return;
                }
                return;
            case 1:
                cy cyVar2 = this.f46374c;
                cyVar2.P3 = null;
                if (!this.f46373b && (w0Var = cyVar2.m0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                cy cyVar3 = this.f46374c;
                cyVar3.I = null;
                boolean z11 = this.f46373b;
                cyVar3.K = z11;
                if (!z11 && !cyVar3.L) {
                    cyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    cyVar3.K4(0.0f);
                    cyVar3.y3 = AndroidUtilities.dp(81.0f);
                } else {
                    cyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    cyVar3.K4(-cyVar3.c4());
                }
                int i11 = 0;
                while (true) {
                    ay[] ayVarArr = cyVar3.f38583e0;
                    if (i11 < ayVarArr.length) {
                        ay ayVar = ayVarArr[i11];
                        if (ayVar != null) {
                            ayVar.f37910a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = cyVar3.fragmentView;
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
