package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class yw extends h31 {
    public boolean O;
    public cy P;
    public final vx Q;
    public final Context R;
    public final dy S;

    public yw(dy dyVar, Context context, vx vxVar, Context context2) {
        super(context);
        this.S = dyVar;
        this.Q = vxVar;
        this.R = context2;
        this.f38664e = 0.0f;
        this.f38666n = new AnimationNotificationsLocker();
        this.I = true;
    }

    @Override
    public final void d(boolean z10) {
        cy cyVar = this.P;
        cyVar.f37352c.G = true;
        cyVar.d.O(this.P.f37350a, c());
        cy cyVar2 = this.P;
        cyVar2.d.C = false;
        cyVar2.C.C = false;
        dy dyVar = this.S;
        dyVar.A4(false, true);
        this.P.f37350a.setClipChildren(true);
        this.P.f37350a.invalidate();
        this.P.d.l();
        this.P.C.l();
        this.P.f37350a.y1(null, 0.0f, z10);
        dyVar.f37749y = false;
        this.Q.requestLayout();
        if (!c()) {
            dyVar.M = true;
            dyVar.N = true;
            View view = dyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        mx mxVar = dyVar.f37750y0;
        if (mxVar != null) {
            mxVar.R();
        }
        dyVar.V4(false, true);
        dyVar.D3();
        dyVar.U4();
    }

    @Override
    public final void e(boolean z10) {
        float f10;
        int i9;
        dy dyVar = this.S;
        dyVar.f37749y = true;
        dyVar.A = z10;
        this.Q.requestLayout();
        cy cyVar = dyVar.f37629a0[0];
        this.P = cyVar;
        if (cyVar.B == null) {
            cyVar.B = new org.telegram.ui.Components.wk0(this.R, null);
            this.P.B.setLayoutManager(new xw(this, this.P));
            cy cyVar2 = this.P;
            int i10 = this.P.f37357s;
            int i11 = dyVar.R2;
            boolean z11 = dyVar.f37668h2;
            ArrayList arrayList = dyVar.E2;
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
            cyVar2.C = new of.m(dyVar, this.R, i10, i11, z11, arrayList, i9, dyVar.C);
            cy cyVar3 = this.P;
            of.m mVar = cyVar3.C;
            mVar.O = true;
            cyVar3.B.setAdapter(mVar);
            cy cyVar4 = this.P;
            cyVar4.addView(cyVar4.B);
        }
        if (!z10) {
            dyVar.M = false;
            dyVar.C4(-dyVar.T3());
        }
        this.P.f37350a.B0();
        cy cyVar5 = this.P;
        of.m mVar2 = cyVar5.C;
        mVar2.h = cyVar5.f37357s;
        mVar2.l();
        cy cyVar6 = this.P;
        cyVar6.d.O(cyVar6.f37350a, false);
        cy cyVar7 = this.P;
        cyVar7.d.C = true;
        cyVar7.C.C = true;
        cyVar7.f37352c.H = false;
        dyVar.A4(true, true);
        dyVar.c4(this.O);
        this.P.d.l();
        this.P.C.l();
        if (!z10) {
            f10 = dyVar.J;
        } else {
            f10 = -dyVar.J;
        }
        cy cyVar8 = this.P;
        cyVar8.f37350a.y1(cyVar8.B, f10, false);
        this.P.f37350a.setClipChildren(false);
        this.P.f37350a.B0();
        dyVar.D3();
        dyVar.U4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        dy dyVar = this.S;
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
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
        yx yxVar;
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
        if (this.O != z10) {
            this.O = z10;
        }
        dy dyVar = this.S;
        View view = dyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f10);
            kVar5 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f10 != 1.0f) {
                f11 = 1.0f;
            }
            backButton.setAlpha(f11);
        }
        if (dyVar.R2 != 0 || dyVar.T2 != 0) {
            Paint paint = dyVar.f37634b1;
            int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
            paint.setColor(i0.a.d(f10, dyVar.getThemedColor(i9), dyVar.getThemedColor(i9)));
        }
        cy cyVar = this.P;
        if (cyVar != null) {
            cyVar.f37350a.setOpenRightFragmentProgress(f10);
        }
        dyVar.C3();
        dyVar.H3();
        dyVar.u3();
        dyVar.E3();
        cy cyVar2 = dyVar.f37629a0[0];
        if (cyVar2 != null && (yxVar = cyVar2.f37350a) != null) {
            yxVar.requestLayout();
        }
        View view2 = dyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
