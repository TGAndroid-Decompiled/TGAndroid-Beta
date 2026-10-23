package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class yw extends b31 {
    public boolean S;
    public dy T;
    public final wx U;
    public final Context V;
    public final ey W;

    public yw(ey eyVar, Context context, wx wxVar, Context context2) {
        super(context);
        this.W = eyVar;
        this.U = wxVar;
        this.V = context2;
        this.e = 0.0f;
        this.f35841n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        dy dyVar = this.T;
        dyVar.f36752c.G = true;
        dyVar.d.P(this.T.f36750a, c());
        dy dyVar2 = this.T;
        dyVar2.d.G = false;
        dyVar2.G.G = false;
        ey eyVar = this.W;
        eyVar.y4(false, true);
        this.T.f36750a.setClipChildren(true);
        this.T.f36750a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f36750a.E1(null, 0.0f, z10);
        eyVar.f37162y = false;
        this.U.requestLayout();
        if (!c()) {
            eyVar.Q = true;
            eyVar.R = true;
            View view = eyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        nx nxVar = eyVar.C0;
        if (nxVar != null) {
            nxVar.Q();
        }
        eyVar.U4(false, true);
        eyVar.B3();
        eyVar.S4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        ey eyVar = this.W;
        eyVar.f37162y = true;
        eyVar.E = z10;
        this.U.requestLayout();
        dy dyVar = eyVar.f37059e0[0];
        this.T = dyVar;
        if (dyVar.F == null) {
            dyVar.F = new org.telegram.ui.Components.mm0(this.V, null);
            this.T.F.setLayoutManager(new xw(this, this.T));
            dy dyVar2 = this.T;
            int i11 = this.T.f36756s;
            int i12 = eyVar.W2;
            boolean z11 = eyVar.f37096l2;
            ArrayList arrayList = eyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
            dyVar2.G = new hg.m(eyVar, this.V, i11, i12, z11, arrayList, i10, eyVar.G);
            dy dyVar3 = this.T;
            hg.m mVar = dyVar3.G;
            mVar.S = true;
            dyVar3.F.setAdapter(mVar);
            dy dyVar4 = this.T;
            dyVar4.addView(dyVar4.F);
        }
        if (!z10) {
            eyVar.Q = false;
            eyVar.A4(-eyVar.R3());
        }
        this.T.f36750a.B0();
        dy dyVar5 = this.T;
        hg.m mVar2 = dyVar5.G;
        mVar2.h = dyVar5.f36756s;
        mVar2.l();
        dy dyVar6 = this.T;
        dyVar6.d.P(dyVar6.f36750a, false);
        dy dyVar7 = this.T;
        dyVar7.d.G = true;
        dyVar7.G.G = true;
        dyVar7.f36752c.H = false;
        eyVar.y4(true, true);
        eyVar.a4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = eyVar.N;
        } else {
            f7 = -eyVar.N;
        }
        dy dyVar8 = this.T;
        dyVar8.f36750a.E1(dyVar8.F, f7, false);
        this.T.f36750a.setClipChildren(false);
        this.T.f36750a.B0();
        eyVar.B3();
        eyVar.S4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        ey eyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
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
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (eyVar.W2 != 0 || eyVar.Y2 != 0) {
            Paint paint = eyVar.f37066f1;
            int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
            paint.setColor(i0.a.f(f7, eyVar.getThemedColor(i10), eyVar.getThemedColor(i10)));
        }
        dy dyVar = this.T;
        if (dyVar != null) {
            dyVar.f36750a.setOpenRightFragmentProgress(f7);
        }
        eyVar.A3();
        eyVar.F3();
        eyVar.s3();
        eyVar.C3();
        dy dyVar2 = eyVar.f37059e0[0];
        if (dyVar2 != null && (zxVar = dyVar2.f36750a) != null) {
            zxVar.requestLayout();
        }
        View view2 = eyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
