package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class ww extends x21 {
    public boolean S;
    public ay T;
    public final ux U;
    public final Context V;
    public final cy W;

    public ww(cy cyVar, Context context, ux uxVar, Context context2) {
        super(context);
        this.W = cyVar;
        this.U = uxVar;
        this.V = context2;
        this.e = 0.0f;
        this.f43007n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        ay ayVar = this.T;
        ayVar.f35449c.G = true;
        ayVar.d.O(this.T.f35447a, c());
        ay ayVar2 = this.T;
        ayVar2.d.G = false;
        ayVar2.G.G = false;
        cy cyVar = this.W;
        cyVar.y4(false, true);
        this.T.f35447a.setClipChildren(true);
        this.T.f35447a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f35447a.z1(null, 0.0f, z10);
        cyVar.f36198y = false;
        this.U.requestLayout();
        if (!c()) {
            cyVar.Q = true;
            cyVar.R = true;
            View view = cyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        lx lxVar = cyVar.C0;
        if (lxVar != null) {
            lxVar.R();
        }
        cyVar.T4(false, true);
        cyVar.B3();
        cyVar.S4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        cy cyVar = this.W;
        cyVar.f36198y = true;
        cyVar.E = z10;
        this.U.requestLayout();
        ay ayVar = cyVar.f36096e0[0];
        this.T = ayVar;
        if (ayVar.F == null) {
            ayVar.F = new org.telegram.ui.Components.jm0(this.V, null);
            this.T.F.setLayoutManager(new vw(this, this.T));
            ay ayVar2 = this.T;
            int i11 = this.T.f35453s;
            int i12 = cyVar.W2;
            boolean z11 = cyVar.f36133l2;
            ArrayList arrayList = cyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.n2) cyVar).currentAccount;
            ayVar2.G = new hg.m(cyVar, this.V, i11, i12, z11, arrayList, i10, cyVar.G);
            ay ayVar3 = this.T;
            hg.m mVar = ayVar3.G;
            mVar.S = true;
            ayVar3.F.setAdapter(mVar);
            ay ayVar4 = this.T;
            ayVar4.addView(ayVar4.F);
        }
        if (!z10) {
            cyVar.Q = false;
            cyVar.A4(-cyVar.R3());
        }
        this.T.f35447a.B0();
        ay ayVar5 = this.T;
        hg.m mVar2 = ayVar5.G;
        mVar2.h = ayVar5.f35453s;
        mVar2.l();
        ay ayVar6 = this.T;
        ayVar6.d.O(ayVar6.f35447a, false);
        ay ayVar7 = this.T;
        ayVar7.d.G = true;
        ayVar7.G.G = true;
        ayVar7.f35449c.H = false;
        cyVar.y4(true, true);
        cyVar.a4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = cyVar.N;
        } else {
            f7 = -cyVar.N;
        }
        ay ayVar8 = this.T;
        ayVar8.f35447a.z1(ayVar8.F, f7, false);
        this.T.f35447a.setClipChildren(false);
        this.T.f35447a.B0();
        cyVar.B3();
        cyVar.S4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        cy cyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
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
        xx xxVar;
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
        cy cyVar = this.W;
        View view = cyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.n2) cyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (cyVar.W2 != 0 || cyVar.Y2 != 0) {
            Paint paint = cyVar.f36103f1;
            int i10 = org.telegram.ui.ActionBar.h6.f20994d6;
            paint.setColor(i0.a.f(f7, cyVar.getThemedColor(i10), cyVar.getThemedColor(i10)));
        }
        ay ayVar = this.T;
        if (ayVar != null) {
            ayVar.f35447a.setOpenRightFragmentProgress(f7);
        }
        cyVar.A3();
        cyVar.F3();
        cyVar.s3();
        cyVar.C3();
        ay ayVar2 = cyVar.f36096e0[0];
        if (ayVar2 != null && (xxVar = ayVar2.f35447a) != null) {
            xxVar.requestLayout();
        }
        View view2 = cyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
