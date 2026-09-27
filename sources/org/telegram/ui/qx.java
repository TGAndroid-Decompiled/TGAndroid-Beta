package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qx extends AnimatorListenerAdapter {
    public final int f36918a;
    public final boolean f36919b;
    public final ty f36920c;

    public qx(ty tyVar, boolean z10, int i10) {
        this.f36918a = i10;
        this.f36920c = tyVar;
        this.f36919b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36918a) {
            case 0:
                ty tyVar = this.f36920c;
                tyVar.f38027o3.unlock();
                if (tyVar.f38067w1 == animator) {
                    if (this.f36919b) {
                        tyVar.f37976e0[0].f37593a.d1();
                    } else {
                        py pyVar = tyVar.f37976e0[0].f37593a;
                        if (pyVar.f30695i1) {
                            pyVar.f30695i1 = false;
                            pyVar.L0(false);
                        }
                    }
                    tyVar.f38067w1 = null;
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
        switch (this.f36918a) {
            case 0:
                ty tyVar = this.f36920c;
                tyVar.f38027o3.unlock();
                if (tyVar.f38067w1 == animator) {
                    tyVar.J4(false, true);
                    boolean z10 = this.f36919b;
                    if (z10) {
                        tyVar.f37976e0[0].f37593a.d1();
                        hx hxVar = tyVar.E0;
                        if (hxVar != null) {
                            hxVar.setVisibility(8);
                        }
                        tyVar.f38037q3 = true;
                        Activity parentActivity = tyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) tyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        tyVar.f38002j0.setVisibility(8);
                        kx kxVar = tyVar.F3;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                    } else {
                        tyVar.f38043r3 = false;
                        ay ayVar = tyVar.C0;
                        if (ayVar != null) {
                            ayVar.setVisibility(8);
                        }
                        gy gyVar = tyVar.X;
                        if (gyVar != null) {
                            gyVar.c();
                        }
                        ay ayVar2 = tyVar.C0;
                        if (ayVar2 != null) {
                            ayVar2.B0.clear();
                            ayVar2.K();
                        }
                        py pyVar = tyVar.f37976e0[0].f37593a;
                        if (pyVar.f30695i1) {
                            pyVar.f30695i1 = false;
                            pyVar.L0(false);
                        }
                        tyVar.f38037q3 = false;
                        kx kxVar2 = tyVar.F3;
                        if (kxVar2 != null) {
                            kxVar2.setVisibility(0);
                        }
                    }
                    View view = tyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    tyVar.M4(f7);
                    tyVar.f37976e0[0].f37593a.setVerticalScrollBarEnabled(true);
                    ay ayVar3 = tyVar.C0;
                    if (ayVar3 != null) {
                        ayVar3.setBackground(null);
                    }
                    tyVar.f38067w1 = null;
                    return;
                }
                return;
            case 1:
                ty tyVar2 = this.f36920c;
                tyVar2.O3 = null;
                if (!this.f36919b && (w0Var = tyVar2.m0) != null) {
                    w0Var.setVisibility(8);
                    return;
                }
                return;
            default:
                ty tyVar3 = this.f36920c;
                tyVar3.I = null;
                boolean z11 = this.f36919b;
                tyVar3.K = z11;
                if (!z11 && !tyVar3.L) {
                    tyVar3.E0.setVisibility(8);
                }
                if (!z11) {
                    tyVar3.L4(0.0f);
                    tyVar3.f38074x3 = AndroidUtilities.dp(81.0f);
                } else {
                    tyVar3.f38074x3 = -AndroidUtilities.dp(81.0f);
                    tyVar3.L4(-tyVar3.d4());
                }
                int i11 = 0;
                while (true) {
                    sy[] syVarArr = tyVar3.f37976e0;
                    if (i11 < syVarArr.length) {
                        sy syVar = syVarArr[i11];
                        if (syVar != null) {
                            syVar.f37593a.requestLayout();
                        }
                        i11++;
                    } else {
                        View view2 = tyVar3.fragmentView;
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
