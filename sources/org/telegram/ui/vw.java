package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class vw extends g31 {
    public boolean S;
    public dy T;
    public final wx U;
    public final Context V;
    public final ey W;

    public vw(ey eyVar, Context context, wx wxVar, Context context2) {
        super(context);
        this.W = eyVar;
        this.U = wxVar;
        this.V = context2;
        this.e = 0.0f;
        this.f39489n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        dy dyVar = this.T;
        dyVar.f38704c.G = true;
        dyVar.d.P(this.T.f38702a, c());
        dy dyVar2 = this.T;
        dyVar2.d.G = false;
        dyVar2.G.G = false;
        ey eyVar = this.W;
        eyVar.I4(false, true);
        this.T.f38702a.setClipChildren(true);
        this.T.f38702a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f38702a.E1(null, 0.0f, z10);
        eyVar.f39101y = false;
        this.U.requestLayout();
        if (!c()) {
            eyVar.Q = true;
            eyVar.R = true;
            View view = eyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        mx mxVar = eyVar.C0;
        if (mxVar != null) {
            mxVar.S();
        }
        eyVar.e5(false, true);
        eyVar.L3();
        eyVar.c5();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        oi.q qVar;
        int i10;
        ey eyVar = this.W;
        eyVar.f39101y = true;
        eyVar.E = z10;
        this.U.requestLayout();
        dy dyVar = eyVar.f38998e0[0];
        this.T = dyVar;
        if (dyVar.F == null) {
            dyVar.F = new org.telegram.ui.Components.nm0(this.V, null);
            qVar = ((org.telegram.ui.ActionBar.r2) eyVar).glassEngine;
            qVar.b(this.T.F);
            this.T.F.setLayoutManager(new uw(this, this.T));
            dy dyVar2 = this.T;
            int i11 = this.T.f38708s;
            int i12 = eyVar.W2;
            boolean z11 = eyVar.f39035l2;
            ArrayList arrayList = eyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.r2) eyVar).currentAccount;
            dyVar2.G = new ig.n(eyVar, this.V, i11, i12, z11, arrayList, i10, eyVar.G);
            dy dyVar3 = this.T;
            ig.n nVar = dyVar3.G;
            nVar.S = true;
            dyVar3.F.setAdapter(nVar);
            dy dyVar4 = this.T;
            dyVar4.addView(dyVar4.F);
        }
        if (!z10) {
            eyVar.Q = false;
            eyVar.K4(-eyVar.b4());
        }
        this.T.f38702a.C0();
        dy dyVar5 = this.T;
        ig.n nVar2 = dyVar5.G;
        nVar2.h = dyVar5.f38708s;
        nVar2.l();
        dy dyVar6 = this.T;
        dyVar6.d.P(dyVar6.f38702a, false);
        dy dyVar7 = this.T;
        dyVar7.d.G = true;
        dyVar7.G.G = true;
        dyVar7.f38704c.H = false;
        eyVar.I4(true, true);
        eyVar.k4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = eyVar.N;
        } else {
            f7 = -eyVar.N;
        }
        dy dyVar8 = this.T;
        dyVar8.f38702a.E1(dyVar8.F, f7, false);
        this.T.f38702a.setClipChildren(false);
        this.T.f38702a.C0();
        eyVar.L3();
        eyVar.c5();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ey eyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void setOpenProgress(float f7) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        zx zxVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.S != z10) {
            this.S = z10;
        }
        ey eyVar = this.W;
        View view = eyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.r2) eyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (eyVar.W2 != 0 || eyVar.Y2 != 0) {
            Paint paint = eyVar.f39005f1;
            int i10 = org.telegram.ui.ActionBar.y6.f23357d6;
            paint.setColor(i0.a.f(f7, eyVar.getThemedColor(i10), eyVar.getThemedColor(i10)));
        }
        dy dyVar = this.T;
        if (dyVar != null) {
            dyVar.f38702a.setOpenRightFragmentProgress(f7);
        }
        eyVar.K3();
        eyVar.P3();
        eyVar.C3();
        eyVar.M3();
        dy dyVar2 = eyVar.f38998e0[0];
        if (dyVar2 != null && (zxVar = dyVar2.f38702a) != null) {
            zxVar.requestLayout();
        }
        View view2 = eyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
