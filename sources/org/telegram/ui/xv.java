package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class xv extends yy0 {
    public boolean T;
    public bx U;
    public final vw V;
    public final Context W;
    public final cx f53917a0;

    public xv(cx cxVar, Context context, vw vwVar, Context context2) {
        super(context);
        this.f53917a0 = cxVar;
        this.V = vwVar;
        this.W = context2;
        this.f54291e = 0.0f;
        this.f54293n = new h2.f((int[]) null);
        this.N = true;
    }

    @Override
    public final void d(boolean z10) {
        bx bxVar = this.U;
        bxVar.f46300c.G = true;
        bxVar.d.P(this.U.f46298a, c());
        bx bxVar2 = this.U;
        bxVar2.d.H = false;
        bxVar2.H.H = false;
        cx cxVar = this.f53917a0;
        cxVar.U4(false, true);
        this.U.f46298a.setClipChildren(true);
        this.U.f46298a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.f46298a.B1(null, 0.0f, z10);
        cxVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            cxVar.R = true;
            if (cxVar.O != 0.0f) {
                cxVar.S = true;
            }
            View view = cxVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        kw kwVar = cxVar.D0;
        if (kwVar != null) {
            kwVar.O();
        }
        cxVar.q5(false, true);
        cxVar.P3();
        cxVar.o5();
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        int i7;
        float f11;
        ri.q qVar;
        int i10;
        cx cxVar = this.f53917a0;
        cxVar.E = true;
        cxVar.F = z10;
        this.V.requestLayout();
        bx bxVar = cxVar.f46663f0[0];
        this.U = bxVar;
        if (bxVar.G == null) {
            bxVar.G = new org.telegram.ui.Components.ck0(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.h2) cxVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new wv(this, this.U));
            bx bxVar2 = this.U;
            int i11 = this.U.f46305s;
            int i12 = cxVar.Y2;
            boolean z11 = cxVar.f46702n2;
            ArrayList arrayList = cxVar.K2;
            i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
            bxVar2.H = new jg.m(cxVar, this.W, i11, i12, z11, arrayList, i10, cxVar.H);
            bx bxVar3 = this.U;
            jg.m mVar = bxVar3.H;
            mVar.T = true;
            bxVar3.G.setAdapter(mVar);
            bx bxVar4 = this.U;
            bxVar4.addView(bxVar4.G);
        }
        if (!z10) {
            cxVar.R = false;
            if (cxVar.n4() && this.U.f46305s == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            v4.f1 L = this.U.f46298a.L(i7, false);
            if (L != null && L.f59123a.getTop() >= this.U.f46298a.getPaddingTop()) {
                f11 = 0.0f;
            } else {
                f11 = -cxVar.f4();
            }
            cxVar.W4(f11);
        }
        this.U.f46298a.C0();
        bx bxVar5 = this.U;
        jg.m mVar2 = bxVar5.H;
        mVar2.h = bxVar5.f46305s;
        mVar2.f();
        bx bxVar6 = this.U;
        bxVar6.d.P(bxVar6.f46298a, false);
        bx bxVar7 = this.U;
        bxVar7.d.H = true;
        bxVar7.H.H = true;
        bxVar7.f46300c.H = false;
        cxVar.U4(true, true);
        cxVar.q4(this.T);
        this.U.d.f();
        this.U.H.f();
        if (!z10) {
            f10 = cxVar.O;
        } else {
            f10 = -cxVar.O;
        }
        bx bxVar8 = this.U;
        bxVar8.f46298a.B1(bxVar8.G, f10, false);
        this.U.f46298a.setClipChildren(false);
        this.U.f46298a.C0();
        cxVar.P3();
        cxVar.o5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cx cxVar = this.f53917a0;
        kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f10) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.T != z10) {
            this.T = z10;
        }
        cx cxVar = this.f53917a0;
        View view = cxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (cxVar.Y2 != 0 || cxVar.f46638a3 != 0) {
            Paint paint = cxVar.f46674h1;
            int i7 = org.telegram.ui.ActionBar.n6.f29394d6;
            paint.setColor(i0.a.f(f10, cxVar.getThemedColor(i7), cxVar.getThemedColor(i7)));
        }
        bx bxVar = this.U;
        if (bxVar != null) {
            bxVar.f46298a.setOpenRightFragmentProgress(f10);
        }
        cxVar.O3();
        cxVar.T3();
        cxVar.G3();
        cxVar.Q3();
        bx bxVar2 = cxVar.f46663f0[0];
        if (bxVar2 != null && (ywVar = bxVar2.f46298a) != null) {
            ywVar.requestLayout();
        }
        View view2 = cxVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
