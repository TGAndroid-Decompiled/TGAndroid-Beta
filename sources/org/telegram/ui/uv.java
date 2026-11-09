package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class uv extends zy0 {
    public boolean S;
    public xw T;
    public final rw U;
    public final Context V;
    public final yw W;

    public uv(yw ywVar, Context context, rw rwVar, Context context2) {
        super(context);
        this.W = ywVar;
        this.U = rwVar;
        this.V = context2;
        this.f52708e = 0.0f;
        this.f52710n = new h2.f((int[]) null);
        this.M = true;
    }

    @Override
    public final void d(boolean z9) {
        xw xwVar = this.T;
        xwVar.f51774c.G = true;
        xwVar.d.P(this.T.f51772a, c());
        xw xwVar2 = this.T;
        xwVar2.d.G = false;
        xwVar2.G.G = false;
        yw ywVar = this.W;
        ywVar.M4(false, true);
        this.T.f51772a.setClipChildren(true);
        this.T.f51772a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.f51772a.B1(null, 0.0f, z9);
        ywVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            ywVar.Q = true;
            if (ywVar.N != 0.0f) {
                ywVar.R = true;
            }
            View view = ywVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        hw hwVar = ywVar.C0;
        if (hwVar != null) {
            hwVar.S();
        }
        ywVar.i5(false, true);
        ywVar.P3();
        ywVar.g5();
    }

    @Override
    public final void e(boolean z9) {
        float f10;
        int i7;
        float f11;
        oi.q qVar;
        int i10;
        yw ywVar = this.W;
        ywVar.D = true;
        ywVar.E = z9;
        this.U.requestLayout();
        xw xwVar = ywVar.f52231e0[0];
        this.T = xwVar;
        if (xwVar.F == null) {
            xwVar.F = new org.telegram.ui.Components.qj0(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.f2) ywVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new tv(this, this.T));
            xw xwVar2 = this.T;
            int i11 = this.T.f51779s;
            int i12 = ywVar.X2;
            boolean z10 = ywVar.f52271m2;
            ArrayList arrayList = ywVar.J2;
            i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            xwVar2.G = new jg.n(ywVar, this.V, i11, i12, z10, arrayList, i10, ywVar.G);
            xw xwVar3 = this.T;
            jg.n nVar = xwVar3.G;
            nVar.S = true;
            xwVar3.F.setAdapter(nVar);
            xw xwVar4 = this.T;
            xwVar4.addView(xwVar4.F);
        }
        if (!z9) {
            ywVar.Q = false;
            if (ywVar.l4() && this.T.f51779s == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            v4.d1 L = this.T.f51772a.L(i7, false);
            if (L != null && L.f57056a.getTop() >= this.T.f51772a.getPaddingTop()) {
                f11 = 0.0f;
            } else {
                f11 = -ywVar.f4();
            }
            ywVar.O4(f11);
        }
        this.T.f51772a.C0();
        xw xwVar5 = this.T;
        jg.n nVar2 = xwVar5.G;
        nVar2.h = xwVar5.f51779s;
        nVar2.f();
        xw xwVar6 = this.T;
        xwVar6.d.P(xwVar6.f51772a, false);
        xw xwVar7 = this.T;
        xwVar7.d.G = true;
        xwVar7.G.G = true;
        xwVar7.f51774c.H = false;
        ywVar.M4(true, true);
        ywVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        if (!z9) {
            f10 = ywVar.N;
        } else {
            f10 = -ywVar.N;
        }
        xw xwVar8 = this.T;
        xwVar8.f51772a.B1(xwVar8.F, f10, false);
        this.T.f51772a.setClipChildren(false);
        this.T.f51772a.C0();
        ywVar.P3();
        ywVar.g5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f10) {
        boolean z9;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        uw uwVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.S != z9) {
            this.S = z9;
        }
        yw ywVar = this.W;
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (ywVar.X2 != 0 || ywVar.Z2 != 0) {
            Paint paint = ywVar.f52243g1;
            int i7 = org.telegram.ui.ActionBar.l6.f27865d6;
            paint.setColor(i0.a.f(f10, ywVar.getThemedColor(i7), ywVar.getThemedColor(i7)));
        }
        xw xwVar = this.T;
        if (xwVar != null) {
            xwVar.f51772a.setOpenRightFragmentProgress(f10);
        }
        ywVar.O3();
        ywVar.T3();
        ywVar.G3();
        ywVar.Q3();
        xw xwVar2 = ywVar.f52231e0[0];
        if (xwVar2 != null && (uwVar = xwVar2.f51772a) != null) {
            uwVar.requestLayout();
        }
        View view2 = ywVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
