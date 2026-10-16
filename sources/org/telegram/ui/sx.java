package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AnimationNotificationsLocker;
public final class sx extends r41 {
    public boolean S;
    public xy T;
    public final ry U;
    public final Context V;
    public final yy W;

    public sx(yy yyVar, Context context, ry ryVar, Context context2) {
        super(context);
        this.W = yyVar;
        this.U = ryVar;
        this.V = context2;
        this.e = 0.0f;
        this.f39278n = new AnimationNotificationsLocker();
        this.M = true;
    }

    @Override
    public final void d(boolean z10) {
        xy xyVar = this.T;
        xyVar.f41681c.G = true;
        xyVar.d.O(this.T.f41679a, c());
        xy xyVar2 = this.T;
        xyVar2.d.G = false;
        xyVar2.G.G = false;
        yy yyVar = this.W;
        yyVar.y4(false, true);
        this.T.f41679a.setClipChildren(true);
        this.T.f41679a.invalidate();
        this.T.d.l();
        this.T.G.l();
        this.T.f41679a.z1(null, 0.0f, z10);
        yyVar.f42106y = false;
        this.U.requestLayout();
        if (!c()) {
            yyVar.Q = true;
            yyVar.R = true;
            View view = yyVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
        iy iyVar = yyVar.C0;
        if (iyVar != null) {
            iyVar.R();
        }
        yyVar.T4(false, true);
        yyVar.B3();
        yyVar.S4();
    }

    @Override
    public final void e(boolean z10) {
        float f7;
        int i10;
        yy yyVar = this.W;
        yyVar.f42106y = true;
        yyVar.E = z10;
        this.U.requestLayout();
        xy xyVar = yyVar.f42004e0[0];
        this.T = xyVar;
        if (xyVar.F == null) {
            xyVar.F = new org.telegram.ui.Components.mm0(this.V, null);
            this.T.F.setLayoutManager(new rx(this, this.T));
            xy xyVar2 = this.T;
            int i11 = this.T.f41685s;
            int i12 = yyVar.W2;
            boolean z11 = yyVar.f42041l2;
            ArrayList arrayList = yyVar.I2;
            i10 = ((org.telegram.ui.ActionBar.m2) yyVar).currentAccount;
            xyVar2.G = new hg.m(yyVar, this.V, i11, i12, z11, arrayList, i10, yyVar.G);
            xy xyVar3 = this.T;
            hg.m mVar = xyVar3.G;
            mVar.S = true;
            xyVar3.F.setAdapter(mVar);
            xy xyVar4 = this.T;
            xyVar4.addView(xyVar4.F);
        }
        if (!z10) {
            yyVar.Q = false;
            yyVar.A4(-yyVar.R3());
        }
        this.T.f41679a.B0();
        xy xyVar5 = this.T;
        hg.m mVar2 = xyVar5.G;
        mVar2.h = xyVar5.f41685s;
        mVar2.l();
        xy xyVar6 = this.T;
        xyVar6.d.O(xyVar6.f41679a, false);
        xy xyVar7 = this.T;
        xyVar7.d.G = true;
        xyVar7.G.G = true;
        xyVar7.f41681c.H = false;
        yyVar.y4(true, true);
        yyVar.a4(this.S);
        this.T.d.l();
        this.T.G.l();
        if (!z10) {
            f7 = yyVar.N;
        } else {
            f7 = -yyVar.N;
        }
        xy xyVar8 = this.T;
        xyVar8.f41679a.z1(xyVar8.F, f7, false);
        this.T.f41679a.setClipChildren(false);
        this.T.f41679a.B0();
        yyVar.B3();
        yyVar.S4();
    }

    @Override
    public final boolean getOccupyStatusbar() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        yy yyVar = this.W;
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
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
        uy uyVar;
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
        yy yyVar = this.W;
        View view = yyVar.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        kVar = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (kVar.getTitleTextView() != null) {
            kVar4 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            kVar4.getTitleTextView().setAlpha(1.0f - f7);
            kVar5 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            if (kVar5.getTitleTextView().getAlpha() > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
                kVar6.getTitleTextView().setVisibility(0);
            }
        }
        kVar2 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
        if (kVar2.getBackButton() != null) {
            kVar3 = ((org.telegram.ui.ActionBar.m2) yyVar).actionBar;
            ImageView backButton = kVar3.getBackButton();
            if (f7 != 1.0f) {
                f10 = 1.0f;
            }
            backButton.setAlpha(f10);
        }
        if (yyVar.W2 != 0 || yyVar.Y2 != 0) {
            Paint paint = yyVar.f42011f1;
            int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
            paint.setColor(i0.a.d(f7, yyVar.getThemedColor(i10), yyVar.getThemedColor(i10)));
        }
        xy xyVar = this.T;
        if (xyVar != null) {
            xyVar.f41679a.setOpenRightFragmentProgress(f7);
        }
        yyVar.A3();
        yyVar.F3();
        yyVar.s3();
        yyVar.C3();
        xy xyVar2 = yyVar.f42004e0[0];
        if (xyVar2 != null && (uyVar = xyVar2.f41679a) != null) {
            uyVar.requestLayout();
        }
        View view2 = yyVar.fragmentView;
        if (view2 != null) {
            view2.invalidate();
        }
    }
}
