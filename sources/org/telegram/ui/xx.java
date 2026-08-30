package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class xx extends org.telegram.ui.Components.do0 {
    public final lf.b0 V0;
    public final lf.b0 W0;
    public final oy X0;

    public xx(oy oyVar, Activity activity, oy oyVar2, int i10, int i11, int i12, long j10, tx txVar) {
        super(activity, oyVar2, i10, i11, i12, j10, txVar);
        this.X0 = oyVar;
        this.V0 = new lf.b0(2);
        this.W0 = new lf.b0(8);
    }

    public final void S(int i10, int i11) {
        oy oyVar;
        ng.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = (oyVar = this.X0).f37049i4) != null) {
            eVar.f(i10, i11);
            oyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        oy oyVar = this.X0;
        if (oyVar.X != null || oyVar.U2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.p2) oyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(oyVar.f37003a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (oyVar.U2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.js jsVar = oyVar.G1;
            if (jsVar != null) {
                i11 = (int) jsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.j6.l1(0.7f, oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
            lf.b0 b0Var = this.V0;
            b0Var.b(l1);
            b0Var.c(i13, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            b0Var.draw(canvas);
        }
        if (oyVar.f37023d4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.j6.l1(0.9f, oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
            lf.b0 b0Var2 = this.W0;
            b0Var2.b(l12);
            b0Var2.setBounds(0, getMeasuredHeight() - oyVar.f37023d4, getMeasuredWidth(), getMeasuredHeight());
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
        a41 a41Var = this.X0.W;
        if (a41Var != null) {
            a41Var.setTranslationY(f10);
        }
    }

    @Override
    public final void w(boolean z4) {
        if (Build.VERSION.SDK_INT >= 31) {
            oy oyVar = this.X0;
            if (oyVar.f37049i4 != null) {
                oyVar.m3();
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
