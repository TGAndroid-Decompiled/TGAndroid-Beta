package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class xw extends k01 {
    public boolean S;
    public zx T;
    public final tx U;
    public final Context V;
    public final ay W;

    public xw(ay ayVar, Context context, tx txVar, Context context2) {
        super(context);
        this.W = ayVar;
        this.U = txVar;
        this.V = context2;
        this.e = 0.0f;
        this.f38660n = new e2.f(null);
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        zx zxVar = this.T;
        zxVar.f44241c.G = true;
        zxVar.d.P(this.T.f44239a, c());
        zx zxVar2 = this.T;
        zxVar2.d.G = false;
        zxVar2.G.G = false;
        ay ayVar = this.W;
        ayVar.L4(false, true);
        this.T.f44239a.setClipChildren(true);
        this.T.f44239a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.f44239a.B1(null, 0.0f, z10);
        ayVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            ayVar.Q = true;
            ayVar.R = true;
            View view = ayVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        kx kxVar = ayVar.C0;
        if (kxVar != null) {
            kxVar.S();
        }
        ayVar.h5(false, true);
        ayVar.O3();
        ayVar.f5();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        float f10;
        ei.r rVar;
        int i11;
        ay ayVar = this.W;
        ayVar.D = true;
        ayVar.E = z10;
        this.U.requestLayout();
        zx zxVar = ayVar.f35794e0[0];
        this.T = zxVar;
        if (zxVar.F == null) {
            zxVar.F = new org.telegram.ui.Components.tk0(this.V, null);
            rVar = ((org.telegram.ui.ActionBar.k2) ayVar).glassEngine;
            rVar.b(this.T.F);
            this.T.F.setLayoutManager(new ww(this, this.T));
            zx zxVar2 = this.T;
            int i12 = this.T.f44245s;
            int i13 = ayVar.W2;
            boolean z11 = ayVar.f35831l2;
            ArrayList arrayList = ayVar.I2;
            i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            zxVar2.G = new zf.m(ayVar, this.V, i12, i13, z11, arrayList, i11, ayVar.G);
            zx zxVar3 = this.T;
            zf.m mVar = zxVar3.G;
            mVar.S = true;
            zxVar3.F.setAdapter(mVar);
            zx zxVar4 = this.T;
            zxVar4.addView(zxVar4.F);
        }
        if (!z10) {
            ayVar.Q = false;
            if (ayVar.k4() && this.T.f44245s == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            s4.c1 L = this.T.f44239a.L(i10, false);
            if (L != null && L.f47898a.getTop() >= this.T.f44239a.getPaddingTop()) {
                f10 = 0.0f;
            } else {
                f10 = -ayVar.e4();
            }
            ayVar.N4(f10);
        }
        this.T.f44239a.C0();
        zx zxVar5 = this.T;
        zf.m mVar2 = zxVar5.G;
        mVar2.h = zxVar5.f44245s;
        mVar2.f();
        zx zxVar6 = this.T;
        zxVar6.d.P(zxVar6.f44239a, false);
        zx zxVar7 = this.T;
        zxVar7.d.G = true;
        zxVar7.G.G = true;
        zxVar7.f44241c.H = false;
        ayVar.L4(true, true);
        ayVar.n4(this.S);
        this.T.d.f();
        this.T.G.f();
        if (!z10) {
            f7 = ayVar.N;
        } else {
            f7 = -ayVar.N;
        }
        zx zxVar8 = this.T;
        zxVar8.f44239a.B1(zxVar8.F, f7, false);
        this.T.f44239a.setClipChildren(false);
        this.T.f44239a.C0();
        ayVar.O3();
        ayVar.f5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        ay ayVar = this.W;
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
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
        wx wxVar;
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
        ay ayVar = this.W;
        View view = ayVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f7);
            lVar5 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            ImageView backButton = lVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (ayVar.W2 != 0 || ayVar.Y2 != 0) {
            Paint paint = ayVar.f35801f1;
            int i10 = org.telegram.ui.ActionBar.t6.f20929d6;
            paint.setColor(i0.b.f(f7, ayVar.getThemedColor(i10), ayVar.getThemedColor(i10)));
        }
        zx zxVar = this.T;
        if (zxVar != null) {
            zxVar.f44239a.setOpenRightFragmentProgress(f7);
        }
        ayVar.N3();
        ayVar.S3();
        ayVar.F3();
        ayVar.P3();
        zx zxVar2 = ayVar.f35794e0[0];
        if (zxVar2 != null && (wxVar = zxVar2.f44239a) != null) {
            wxVar.requestLayout();
        }
        View view2 = ayVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
