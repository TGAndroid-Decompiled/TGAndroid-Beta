package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class uv extends uy0 {
    public boolean T;
    public xw U;
    public final rw V;
    public final Context W;
    public final yw f52033a0;

    public uv(yw ywVar, Context context, rw rwVar, Context context2) {
        super(context);
        this.f52033a0 = ywVar;
        this.V = rwVar;
        this.W = context2;
        this.f52060e = 0.0f;
        this.f52062n = new h2.f((int[]) null);
        this.N = true;
    }

    @Override
    public final void d(boolean z10) {
        xw xwVar = this.U;
        xwVar.f53333c.G = true;
        xwVar.d.P(this.U.f53331a, c());
        xw xwVar2 = this.U;
        xwVar2.d.H = false;
        xwVar2.H.H = false;
        yw ywVar = this.f52033a0;
        ywVar.M4(false, true);
        this.U.f53331a.setClipChildren(true);
        this.U.f53331a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.f53331a.B1(null, 0.0f, z10);
        ywVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            ywVar.R = true;
            if (ywVar.O != 0.0f) {
                ywVar.S = true;
            }
            View view = ywVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        hw hwVar = ywVar.D0;
        if (hwVar != null) {
            hwVar.R();
        }
        ywVar.i5(false, true);
        ywVar.P3();
        ywVar.g5();
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        int i7;
        float f11;
        ri.q qVar;
        int i10;
        yw ywVar = this.f52033a0;
        ywVar.E = true;
        ywVar.F = z10;
        this.V.requestLayout();
        xw xwVar = ywVar.f53673f0[0];
        this.U = xwVar;
        if (xwVar.G == null) {
            xwVar.G = new org.telegram.ui.Components.uj0(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.e2) ywVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new tv(this, this.U));
            xw xwVar2 = this.U;
            int i11 = this.U.f53338s;
            int i12 = ywVar.Y2;
            boolean z11 = ywVar.f53712n2;
            ArrayList arrayList = ywVar.K2;
            i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
            xwVar2.H = new jg.m(ywVar, this.W, i11, i12, z11, arrayList, i10, ywVar.H);
            xw xwVar3 = this.U;
            jg.m mVar = xwVar3.H;
            mVar.T = true;
            xwVar3.G.setAdapter(mVar);
            xw xwVar4 = this.U;
            xwVar4.addView(xwVar4.G);
        }
        if (!z10) {
            ywVar.R = false;
            if (ywVar.l4() && this.U.f53338s == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            v4.e1 L = this.U.f53331a.L(i7, false);
            if (L != null && L.f58535a.getTop() >= this.U.f53331a.getPaddingTop()) {
                f11 = 0.0f;
            } else {
                f11 = -ywVar.f4();
            }
            ywVar.O4(f11);
        }
        this.U.f53331a.C0();
        xw xwVar5 = this.U;
        jg.m mVar2 = xwVar5.H;
        mVar2.h = xwVar5.f53338s;
        mVar2.f();
        xw xwVar6 = this.U;
        xwVar6.d.P(xwVar6.f53331a, false);
        xw xwVar7 = this.U;
        xwVar7.d.H = true;
        xwVar7.H.H = true;
        xwVar7.f53333c.H = false;
        ywVar.M4(true, true);
        ywVar.o4(this.T);
        this.U.d.f();
        this.U.H.f();
        if (!z10) {
            f10 = ywVar.O;
        } else {
            f10 = -ywVar.O;
        }
        xw xwVar8 = this.U;
        xwVar8.f53331a.B1(xwVar8.G, f10, false);
        this.U.f53331a.setClipChildren(false);
        this.U.f53331a.C0();
        ywVar.P3();
        ywVar.g5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yw ywVar = this.f52033a0;
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
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
        uw uwVar;
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
        yw ywVar = this.f52033a0;
        View view = ywVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (ywVar.Y2 != 0 || ywVar.f53648a3 != 0) {
            Paint paint = ywVar.f53684h1;
            int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
            paint.setColor(i0.a.f(f10, ywVar.getThemedColor(i7), ywVar.getThemedColor(i7)));
        }
        xw xwVar = this.U;
        if (xwVar != null) {
            xwVar.f53331a.setOpenRightFragmentProgress(f10);
        }
        ywVar.O3();
        ywVar.T3();
        ywVar.G3();
        ywVar.Q3();
        xw xwVar2 = ywVar.f53673f0[0];
        if (xwVar2 != null && (uwVar = xwVar2.f53331a) != null) {
            uwVar.requestLayout();
        }
        View view2 = ywVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
