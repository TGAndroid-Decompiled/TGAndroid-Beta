package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class yx extends org.telegram.ui.Components.do0 {
    public final lf.b0 V0;
    public final lf.b0 W0;
    public final py X0;

    public yx(py pyVar, Activity activity, py pyVar2, int i10, int i11, int i12, long j10, ux uxVar) {
        super(activity, pyVar2, i10, i11, i12, j10, uxVar);
        this.X0 = pyVar;
        this.V0 = new lf.b0(2);
        this.W0 = new lf.b0(8);
    }

    public final void S(int i10, int i11) {
        py pyVar;
        og.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (pyVar = this.X0).f40196i4) != null) {
            eVar.f(i10, i11);
            pyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        py pyVar = this.X0;
        if (pyVar.X != null || pyVar.U2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.p2) pyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(pyVar.f40149a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (pyVar.U2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ls lsVar = pyVar.G1;
            if (lsVar != null) {
                i11 = (int) lsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.k6.l1(0.7f, pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
            lf.b0 b0Var = this.V0;
            b0Var.b(l1);
            b0Var.c(i13, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            b0Var.draw(canvas);
        }
        if (pyVar.f40169d4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.k6.l1(0.9f, pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
            lf.b0 b0Var2 = this.W0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - pyVar.f40169d4, getMeasuredWidth(), getMeasuredHeight());
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
            py pyVar = this.X0;
            if (pyVar.f40196i4 != null) {
                pyVar.m3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z4;
        org.telegram.ui.Components.co0 co0Var = this.Q;
        if (co0Var != null && co0Var.h(i10) == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.X0.c5(z4);
    }
}
