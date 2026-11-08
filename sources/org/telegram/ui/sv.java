package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class sv extends wy0 {
    public boolean S;
    public vw T;
    public final pw U;
    public final Context V;
    public final ww W;

    public sv(ww wwVar, Context context, pw pwVar, Context context2) {
        super(context);
        this.W = wwVar;
        this.U = pwVar;
        this.V = context2;
        this.f51687e = 0.0f;
        this.f51689n = new h2.f((int[]) null);
        this.M = true;
    }

    @Override
    public final void d(boolean z9) {
        vw vwVar = this.T;
        vwVar.f50784c.G = true;
        vwVar.d.P(this.T.f50782a, c());
        vw vwVar2 = this.T;
        vwVar2.d.G = false;
        vwVar2.G.G = false;
        ww wwVar = this.W;
        wwVar.M4(false, true);
        this.T.f50782a.setClipChildren(true);
        this.T.f50782a.invalidate();
        this.T.d.f();
        this.T.G.f();
        this.T.f50782a.B1(null, 0.0f, z9);
        wwVar.D = false;
        this.U.requestLayout();
        if (!c()) {
            wwVar.Q = true;
            if (wwVar.N != 0.0f) {
                wwVar.R = true;
            }
            View view = wwVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        fw fwVar = wwVar.C0;
        if (fwVar != null) {
            fwVar.S();
        }
        wwVar.i5(false, true);
        wwVar.P3();
        wwVar.g5();
    }

    @Override
    public final void e(boolean z9) {
        float f10;
        int i7;
        float f11;
        oi.q qVar;
        int i10;
        ww wwVar = this.W;
        wwVar.D = true;
        wwVar.E = z9;
        this.U.requestLayout();
        vw vwVar = wwVar.f51556e0[0];
        this.T = vwVar;
        if (vwVar.F == null) {
            vwVar.F = new org.telegram.ui.Components.pj0(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.f2) wwVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new rv(this, this.T));
            vw vwVar2 = this.T;
            int i11 = this.T.f50789s;
            int i12 = wwVar.W2;
            boolean z10 = wwVar.f51592l2;
            ArrayList arrayList = wwVar.I2;
            i10 = ((org.telegram.ui.ActionBar.f2) wwVar).currentAccount;
            vwVar2.G = new jg.n(wwVar, this.V, i11, i12, z10, arrayList, i10, wwVar.G);
            vw vwVar3 = this.T;
            jg.n nVar = vwVar3.G;
            nVar.S = true;
            vwVar3.F.setAdapter(nVar);
            vw vwVar4 = this.T;
            vwVar4.addView(vwVar4.F);
        }
        if (!z9) {
            wwVar.Q = false;
            if (wwVar.l4() && this.T.f50789s == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            v4.d1 L = this.T.f50782a.L(i7, false);
            if (L != null && L.f57044a.getTop() >= this.T.f50782a.getPaddingTop()) {
                f11 = 0.0f;
            } else {
                f11 = -wwVar.f4();
            }
            wwVar.O4(f11);
        }
        this.T.f50782a.C0();
        vw vwVar5 = this.T;
        jg.n nVar2 = vwVar5.G;
        nVar2.h = vwVar5.f50789s;
        nVar2.f();
        vw vwVar6 = this.T;
        vwVar6.d.P(vwVar6.f50782a, false);
        vw vwVar7 = this.T;
        vwVar7.d.G = true;
        vwVar7.G.G = true;
        vwVar7.f50784c.H = false;
        wwVar.M4(true, true);
        wwVar.o4(this.S);
        this.T.d.f();
        this.T.G.f();
        if (!z9) {
            f10 = wwVar.N;
        } else {
            f10 = -wwVar.N;
        }
        vw vwVar8 = this.T;
        vwVar8.f50782a.B1(vwVar8.F, f10, false);
        this.T.f50782a.setClipChildren(false);
        this.T.f50782a.C0();
        wwVar.P3();
        wwVar.g5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ww wwVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
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
        sw swVar;
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
        ww wwVar = this.W;
        View view = wwVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (wwVar.W2 != 0 || wwVar.Y2 != 0) {
            Paint paint = wwVar.f51563f1;
            int i7 = org.telegram.ui.ActionBar.k6.f27852d6;
            paint.setColor(i0.a.f(f10, wwVar.getThemedColor(i7), wwVar.getThemedColor(i7)));
        }
        vw vwVar = this.T;
        if (vwVar != null) {
            vwVar.f50782a.setOpenRightFragmentProgress(f10);
        }
        wwVar.O3();
        wwVar.T3();
        wwVar.G3();
        wwVar.Q3();
        vw vwVar2 = wwVar.f51556e0[0];
        if (vwVar2 != null && (swVar = vwVar2.f50782a) != null) {
            swVar.requestLayout();
        }
        View view2 = wwVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
