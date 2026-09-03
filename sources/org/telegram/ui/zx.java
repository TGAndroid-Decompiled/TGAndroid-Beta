package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class zx extends org.telegram.ui.Components.co0 {
    public final kf.b0 V0;
    public final kf.b0 W0;
    public final qy X0;

    public zx(qy qyVar, Activity activity, qy qyVar2, int i10, int i11, int i12, long j10, vx vxVar) {
        super(activity, qyVar2, i10, i11, i12, j10, vxVar);
        this.X0 = qyVar;
        this.V0 = new kf.b0(2);
        this.W0 = new kf.b0(8);
    }

    public final void S(int i10, int i11) {
        qy qyVar;
        ng.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (qyVar = this.X0).f37567i4) != null) {
            eVar.f(i10, i11);
            qyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        qy qyVar = this.X0;
        if (qyVar.X != null || qyVar.U2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.p2) qyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(qyVar.f37521a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (qyVar.U2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.is isVar = qyVar.G1;
            if (isVar != null) {
                i11 = (int) isVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
            kf.b0 b0Var = this.V0;
            b0Var.b(l1);
            b0Var.c(i13, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            b0Var.draw(canvas);
        }
        if (qyVar.f37541d4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
            kf.b0 b0Var2 = this.W0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - qyVar.f37541d4, getMeasuredWidth(), getMeasuredHeight());
            b0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.X0.m3();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        h41 h41Var = this.X0.W;
        if (h41Var != null) {
            h41Var.setTranslationY(f10);
        }
    }

    @Override
    public final void w(boolean z4) {
        if (Build.VERSION.SDK_INT >= 31) {
            qy qyVar = this.X0;
            if (qyVar.f37567i4 != null) {
                qyVar.m3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z4;
        org.telegram.ui.Components.bo0 bo0Var = this.Q;
        if (bo0Var != null && bo0Var.h(i10) == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.X0.c5(z4);
    }
}
