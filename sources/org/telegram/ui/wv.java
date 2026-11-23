package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
public final class wv extends xy0 {
    public boolean T;
    public ax U;
    public final uw V;
    public final Context W;
    public final bx f53771a0;

    public wv(bx bxVar, Context context, uw uwVar, Context context2) {
        super(context);
        this.f53771a0 = bxVar;
        this.V = uwVar;
        this.W = context2;
        this.f54122e = 0.0f;
        this.f54124n = new h2.f((int[]) null);
        this.N = true;
    }

    @Override
    public final void d(boolean z10) {
        ax axVar = this.U;
        axVar.f45824c.G = true;
        axVar.d.P(this.U.f45822a, c());
        ax axVar2 = this.U;
        axVar2.d.H = false;
        axVar2.H.H = false;
        bx bxVar = this.f53771a0;
        bxVar.U4(false, true);
        this.U.f45822a.setClipChildren(true);
        this.U.f45822a.invalidate();
        this.U.d.f();
        this.U.H.f();
        this.U.f45822a.B1(null, 0.0f, z10);
        bxVar.E = false;
        this.V.requestLayout();
        if (!c()) {
            bxVar.R = true;
            if (bxVar.O != 0.0f) {
                bxVar.S = true;
            }
            View view = bxVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        jw jwVar = bxVar.D0;
        if (jwVar != null) {
            jwVar.Q();
        }
        bxVar.q5(false, true);
        bxVar.P3();
        bxVar.o5();
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        int i7;
        float f11;
        ri.q qVar;
        int i10;
        bx bxVar = this.f53771a0;
        bxVar.E = true;
        bxVar.F = z10;
        this.V.requestLayout();
        ax axVar = bxVar.f46549f0[0];
        this.U = axVar;
        if (axVar.G == null) {
            axVar.G = new org.telegram.ui.Components.ek0(this.W, null);
            qVar = ((org.telegram.ui.ActionBar.g2) bxVar).glassEngine;
            qVar.b(this.U.G);
            this.U.G.setLayoutManager(new vv(this, this.U));
            ax axVar2 = this.U;
            int i11 = this.U.f45829s;
            int i12 = bxVar.Y2;
            boolean z11 = bxVar.f46588n2;
            ArrayList arrayList = bxVar.K2;
            i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            axVar2.H = new jg.m(bxVar, this.W, i11, i12, z11, arrayList, i10, bxVar.H);
            ax axVar3 = this.U;
            jg.m mVar = axVar3.H;
            mVar.T = true;
            axVar3.G.setAdapter(mVar);
            ax axVar4 = this.U;
            axVar4.addView(axVar4.G);
        }
        if (!z10) {
            bxVar.R = false;
            if (bxVar.n4() && this.U.f45829s == 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            v4.f1 L = this.U.f45822a.L(i7, false);
            if (L != null && L.f59245a.getTop() >= this.U.f45822a.getPaddingTop()) {
                f11 = 0.0f;
            } else {
                f11 = -bxVar.f4();
            }
            bxVar.W4(f11);
        }
        this.U.f45822a.C0();
        ax axVar5 = this.U;
        jg.m mVar2 = axVar5.H;
        mVar2.h = axVar5.f45829s;
        mVar2.f();
        ax axVar6 = this.U;
        axVar6.d.P(axVar6.f45822a, false);
        ax axVar7 = this.U;
        axVar7.d.H = true;
        axVar7.H.H = true;
        axVar7.f45824c.H = false;
        bxVar.U4(true, true);
        bxVar.q4(this.T);
        this.U.d.f();
        this.U.H.f();
        if (!z10) {
            f10 = bxVar.O;
        } else {
            f10 = -bxVar.O;
        }
        ax axVar8 = this.U;
        axVar8.f45822a.B1(axVar8.G, f10, false);
        this.U.f45822a.setClipChildren(false);
        this.U.f45822a.C0();
        bxVar.P3();
        bxVar.o5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        bx bxVar = this.f53771a0;
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
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
        xw xwVar;
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
        bx bxVar = this.f53771a0;
        View view = bxVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (bxVar.Y2 != 0 || bxVar.f46524a3 != 0) {
            Paint paint = bxVar.f46560h1;
            int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
            paint.setColor(i0.a.f(f10, bxVar.getThemedColor(i7), bxVar.getThemedColor(i7)));
        }
        ax axVar = this.U;
        if (axVar != null) {
            axVar.f45822a.setOpenRightFragmentProgress(f10);
        }
        bxVar.O3();
        bxVar.T3();
        bxVar.G3();
        bxVar.Q3();
        ax axVar2 = bxVar.f46549f0[0];
        if (axVar2 != null && (xwVar = axVar2.f45822a) != null) {
            xwVar.requestLayout();
        }
        View view2 = bxVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
