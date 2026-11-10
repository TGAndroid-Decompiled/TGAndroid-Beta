package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class vv extends az0 {
    public boolean S;
    public yw T;
    public final sw U;
    public final Context V;
    public final zw W;

    public vv(zw zwVar, Context context, sw swVar, Context context2) {
        super(context);
        this.W = zwVar;
        this.U = swVar;
        this.V = context2;
        this.f43847e = 0.0f;
        this.f43849n = new h2.f((int[]) null);
        this.M = true;
    }

    @Override
    public final void d(boolean z9) {
        yw ywVar = this.T;
        ywVar.f52127c.G = true;
        ywVar.d.P(this.T.f52125a, c());
        yw ywVar2 = this.T;
        ywVar2.d.G = false;
        ywVar2.G.G = false;
        zw zwVar = this.W;
        zwVar.M4(false, true);
        this.T.f52125a.setClipChildren(true);
        this.T.f52125a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.f52125a.B1(null, 0.0f, z9);
        zwVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            zwVar.Q = true;
            if (zwVar.N != 0.0f) {
                zwVar.R = true;
            }
            View view = zwVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        iw iwVar = zwVar.C0;
        if (iwVar != null) {
            iwVar.S();
        }
        zwVar.i5(false, true);
        zwVar.P3();
        zwVar.g5();
    }

    @Override
    public final void e(boolean z9) {
        float f10;
        int i7;
        float f11;
        oi.q qVar;
        int i10;
        zw zwVar = this.W;
        zwVar.D = true;
        zwVar.E = z9;
        this.U.requestLayout();
        yw ywVar = zwVar.f52577e0[0];
        this.T = ywVar;
        if (ywVar.F == null) {
            ywVar.F = new org.telegram.ui.Components.pj0(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.f2) zwVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new uv(this, this.T));
            yw ywVar2 = this.T;
            int i11 = this.T.f52132s;
            int i12 = zwVar.X2;
            boolean z10 = zwVar.f52617m2;
            ArrayList arrayList = zwVar.J2;
            i10 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            ywVar2.G = new jg.n(zwVar, this.V, i11, i12, z10, arrayList, i10, zwVar.G);
            yw ywVar3 = this.T;
            jg.n nVar = ywVar3.G;
            nVar.S = true;
            ywVar3.F.setAdapter(nVar);
            yw ywVar4 = this.T;
            ywVar4.addView(ywVar4.F);
        }
        if (!z9) {
            zwVar.Q = false;
            if (zwVar.l4() && this.T.f52132s == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            v4.d1 L = this.T.f52125a.L(i7, false);
            if (L != null && L.f57052a.getTop() >= this.T.f52125a.getPaddingTop()) {
                f11 = 0.0f;
            } else {
                f11 = -zwVar.f4();
            }
            zwVar.O4(f11);
        }
        this.T.f52125a.C0();
        yw ywVar5 = this.T;
        jg.n nVar2 = ywVar5.G;
        nVar2.h = ywVar5.f52132s;
        nVar2.f();
        yw ywVar6 = this.T;
        ywVar6.d.P(ywVar6.f52125a, false);
        yw ywVar7 = this.T;
        ywVar7.d.G = true;
        ywVar7.G.G = true;
        ywVar7.f52127c.H = false;
        zwVar.M4(true, true);
        zwVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        if (!z9) {
            f10 = zwVar.N;
        } else {
            f10 = -zwVar.N;
        }
        yw ywVar8 = this.T;
        ywVar8.f52125a.B1(ywVar8.F, f10, false);
        this.T.f52125a.setClipChildren(false);
        this.T.f52125a.C0();
        zwVar.P3();
        zwVar.g5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        zw zwVar = this.W;
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f10) {
        boolean z9;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        vw vwVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.S != z9) {
            this.S = z9;
        }
        zw zwVar = this.W;
        View view = zwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (lVar.getTitleTextView() != null) {
            lVar4 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            lVar4.getTitleTextView().setAlpha(1.0f - f10);
            lVar5 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            if (lVar5.getTitleTextView().getAlpha() > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
                lVar6.getTitleTextView().setVisibility(0);
            }
        }
        lVar2 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
        if (lVar2.getBackButton() != null) {
            lVar3 = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            ImageView backButton = lVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (zwVar.X2 != 0 || zwVar.Z2 != 0) {
            Paint paint = zwVar.f52589g1;
            int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
            paint.setColor(i0.a.f(f10, zwVar.getThemedColor(i7), zwVar.getThemedColor(i7)));
        }
        yw ywVar = this.T;
        if (ywVar != null) {
            ywVar.f52125a.setOpenRightFragmentProgress(f10);
        }
        zwVar.O3();
        zwVar.T3();
        zwVar.G3();
        zwVar.Q3();
        yw ywVar2 = zwVar.f52577e0[0];
        if (ywVar2 != null && (vwVar = ywVar2.f52125a) != null) {
            vwVar.requestLayout();
        }
        View view2 = zwVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
