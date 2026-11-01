package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class ww extends k01 {
    public boolean S;
    public yx T;
    public final sx U;
    public final Context V;
    public final zx W;

    public ww(zx zxVar, Context context, sx sxVar, Context context2) {
        super(context);
        this.W = zxVar;
        this.U = sxVar;
        this.V = context2;
        this.e = 0.0f;
        this.f38626n = new e2.f((int[]) null);
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        yx yxVar = this.T;
        yxVar.f43735c.G = true;
        yxVar.d.P(this.T.f43733a, c());
        yx yxVar2 = this.T;
        yxVar2.d.G = false;
        yxVar2.G.G = false;
        zx zxVar = this.W;
        zxVar.M4(false, true);
        this.T.f43733a.setClipChildren(true);
        this.T.f43733a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.f43733a.B1(null, 0.0f, z10);
        zxVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            zxVar.Q = true;
            zxVar.R = true;
            View view = zxVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        jx jxVar = zxVar.C0;
        if (jxVar != null) {
            jxVar.S();
        }
        zxVar.i5(false, true);
        zxVar.P3();
        zxVar.g5();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        float f10;
        ei.r rVar;
        int i11;
        zx zxVar = this.W;
        zxVar.D = true;
        zxVar.E = z10;
        this.U.requestLayout();
        yx yxVar = zxVar.f44137e0[0];
        this.T = yxVar;
        if (yxVar.F == null) {
            yxVar.F = new org.telegram.ui.Components.uk0(this.V, null);
            rVar = ((org.telegram.ui.ActionBar.k2) zxVar).glassEngine;
            rVar.b(this.T.F);
            this.T.F.setLayoutManager(new vw(this, this.T));
            yx yxVar2 = this.T;
            int i12 = this.T.f43739s;
            int i13 = zxVar.W2;
            boolean z11 = zxVar.f44174l2;
            ArrayList arrayList = zxVar.I2;
            i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            yxVar2.G = new zf.m(zxVar, this.V, i12, i13, z11, arrayList, i11, zxVar.G);
            yx yxVar3 = this.T;
            zf.m mVar = yxVar3.G;
            mVar.S = true;
            yxVar3.F.setAdapter(mVar);
            yx yxVar4 = this.T;
            yxVar4.addView(yxVar4.F);
        }
        if (!z10) {
            zxVar.Q = false;
            if (zxVar.l4() && this.T.f43739s == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            s4.c1 L = this.T.f43733a.L(i10, false);
            if (L != null && L.f47909a.getTop() >= this.T.f43733a.getPaddingTop()) {
                f10 = 0.0f;
            } else {
                f10 = -zxVar.f4();
            }
            zxVar.O4(f10);
        }
        this.T.f43733a.C0();
        yx yxVar5 = this.T;
        zf.m mVar2 = yxVar5.G;
        mVar2.h = yxVar5.f43739s;
        mVar2.f();
        yx yxVar6 = this.T;
        yxVar6.d.P(yxVar6.f43733a, false);
        yx yxVar7 = this.T;
        yxVar7.d.G = true;
        yxVar7.G.G = true;
        yxVar7.f43735c.H = false;
        zxVar.M4(true, true);
        zxVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        if (!z10) {
            f7 = zxVar.N;
        } else {
            f7 = -zxVar.N;
        }
        yx yxVar8 = this.T;
        yxVar8.f43733a.B1(yxVar8.F, f7, false);
        this.T.f43733a.setClipChildren(false);
        this.T.f43733a.C0();
        zxVar.P3();
        zxVar.g5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        zx zxVar = this.W;
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f7) {
        boolean z10;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        vx vxVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.S != z10) {
            this.S = z10;
        }
        zx zxVar = this.W;
        View view = zxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f7);
            lVar5 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
            ImageView backButton = lVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (zxVar.W2 != 0 || zxVar.Y2 != 0) {
            Paint paint = zxVar.f44144f1;
            int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
            paint.setColor(i0.b.f(f7, zxVar.getThemedColor(i10), zxVar.getThemedColor(i10)));
        }
        yx yxVar = this.T;
        if (yxVar != null) {
            yxVar.f43733a.setOpenRightFragmentProgress(f7);
        }
        zxVar.O3();
        zxVar.T3();
        zxVar.G3();
        zxVar.Q3();
        yx yxVar2 = zxVar.f44137e0[0];
        if (yxVar2 != null && (vxVar = yxVar2.f43733a) != null) {
            vxVar.requestLayout();
        }
        View view2 = zxVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
