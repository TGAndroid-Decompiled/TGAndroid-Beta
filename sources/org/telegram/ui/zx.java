package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class zx extends org.telegram.ui.Components.lo0 {
    public final yf.y Z0;
    public final yf.y f40575a1;
    public final qy f40576b1;

    public zx(qy qyVar, Activity activity, qy qyVar2, int i10, int i11, int i12, long j3, vx vxVar) {
        super(activity, qyVar2, i10, i11, i12, j3, vxVar);
        this.f40576b1 = qyVar;
        this.Z0 = new yf.y(2);
        this.f40575a1 = new yf.y(8);
    }

    public final void S(int i10, int i11) {
        qy qyVar;
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = (qyVar = this.f40576b1).f37055k4) != null) {
            hVar.f(i10, i11);
            qyVar.m3();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        qy qyVar = this.f40576b1;
        if (qyVar.f37000a0 != null || qyVar.X2 != 0) {
            int dp = AndroidUtilities.dp(54.0f);
            kVar = ((org.telegram.ui.ActionBar.m2) qyVar).actionBar;
            int dp2 = (AndroidUtilities.dp(qyVar.f36999a) + kVar.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
            if (qyVar.X2 != 0) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int i12 = dp2 - i10;
            org.telegram.ui.Components.ls lsVar = qyVar.J1;
            if (lsVar != null) {
                i11 = (int) lsVar.c(AndroidUtilities.dp(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int l1 = org.telegram.ui.ActionBar.h6.l1(0.7f, qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
            yf.y yVar = this.Z0;
            yVar.b(l1);
            yVar.c(i13, 0);
            yVar.setBounds(0, 0, getMeasuredWidth(), i13 + dp);
            yVar.draw(canvas);
        }
        if (qyVar.f37031f4 > AndroidUtilities.dp(32.0f)) {
            int l12 = org.telegram.ui.ActionBar.h6.l1(0.9f, qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
            yf.y yVar2 = this.f40575a1;
            yVar2.b(l12);
            yVar2.setBounds(0, getMeasuredHeight() - qyVar.f37031f4, getMeasuredWidth(), getMeasuredHeight());
            yVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.f40576b1.m3();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        m41 m41Var = this.f40576b1.Z;
        if (m41Var != null) {
            m41Var.setTranslationY(f7);
        }
    }

    @Override
    public final void w(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            qy qyVar = this.f40576b1;
            if (qyVar.f37055k4 != null) {
                qyVar.m3();
            }
        }
    }

    @Override
    public final void x(int i10) {
        boolean z10;
        org.telegram.ui.Components.ko0 ko0Var = this.T;
        if (ko0Var != null && ko0Var.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40576b1.c5(z10);
    }
}
