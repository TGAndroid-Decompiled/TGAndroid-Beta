package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vx extends AnimatorListenerAdapter {
    public final int f42875a;
    public final boolean f42876b;
    public final vy f42877c;

    public vx(vy vyVar, boolean z10, int i10) {
        this.f42875a = i10;
        this.f42877c = vyVar;
        this.f42876b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42875a) {
            case 0:
                vy vyVar = this.f42877c;
                vyVar.f42956o3.unlock();
                if (vyVar.f42997w1 == animator) {
                    if (this.f42876b) {
                        vyVar.f42905e0[0].f42613a.c1();
                    } else {
                        ry ryVar = vyVar.f42905e0[0].f42613a;
                        if (ryVar.f32453g1) {
                            ryVar.f32453g1 = false;
                            ryVar.K0(false);
                        }
                    }
                    vyVar.f42997w1 = null;
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
        switch (this.f42875a) {
            case 0:
                vy vyVar = this.f42877c;
                vyVar.f42956o3.unlock();
                if (vyVar.f42997w1 == animator) {
                    vyVar.x4(false, true);
                    boolean z10 = this.f42876b;
                    if (z10) {
                        vyVar.f42905e0[0].f42613a.c1();
                        mx mxVar = vyVar.E0;
                        if (mxVar != null) {
                            mxVar.setVisibility(8);
                        }
                        vyVar.f42966q3 = true;
                        Activity parentActivity = vyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.m2) vyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        vyVar.f42931j0.setVisibility(8);
                        px pxVar = vyVar.F3;
                        if (pxVar != null) {
                            pxVar.setVisibility(8);
                        }
                    } else {
                        vyVar.f42972r3 = false;
                        fy fyVar = vyVar.C0;
                        if (fyVar != null) {
                            fyVar.setVisibility(8);
                        }
                        ly lyVar = vyVar.X;
                        if (lyVar != null) {
                            lyVar.c();
                        }
                        fy fyVar2 = vyVar.C0;
                        if (fyVar2 != null) {
                            fyVar2.A0.clear();
                            fyVar2.J();
                        }
                        ry ryVar = vyVar.f42905e0[0].f42613a;
                        if (ryVar.f32453g1) {
                            ryVar.f32453g1 = false;
                            ryVar.K0(false);
                        }
                        vyVar.f42966q3 = false;
                        px pxVar2 = vyVar.F3;
                        if (pxVar2 != null) {
                            pxVar2.setVisibility(0);
                        }
                    }
                    View view = vyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    vyVar.A4(f7);
                    vyVar.f42905e0[0].f42613a.setVerticalScrollBarEnabled(true);
                    fy fyVar3 = vyVar.C0;
                    if (fyVar3 != null) {
                        fyVar3.setBackground(null);
                    }
                    vyVar.f42997w1 = null;
                    return;
                }
                return;
            case 1:
                vy vyVar2 = this.f42877c;
                vyVar2.O3 = null;
                if (!this.f42876b && (u0Var = vyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                vy vyVar3 = this.f42877c;
                vyVar3.I = null;
                boolean z11 = this.f42876b;
                vyVar3.K = z11;
                if (!z11 && !vyVar3.L) {
                    vyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    vyVar3.z4(0.0f);
                    vyVar3.f43004x3 = AndroidUtilities.dp(81.0f);
                } else {
                    vyVar3.f43004x3 = -AndroidUtilities.dp(81.0f);
                    vyVar3.z4(-vyVar3.R3());
                }
                int i11 = 0;
                while (true) {
                    uy[] uyVarArr = vyVar3.f42905e0;
                    if (i11 < uyVarArr.length) {
                        uy uyVar = uyVarArr[i11];
                        if (uyVar != null) {
                            uyVar.f42613a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = vyVar3.fragmentView;
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
