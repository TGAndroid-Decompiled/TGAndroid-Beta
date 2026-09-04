package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.da0 f43437a;

    public zh0(long j3) {
        super(null);
        this.f43437a = new org.telegram.ui.Components.da0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 9));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.da0 da0Var = this.f43437a;
        if (da0Var.f49442a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = da0Var.f49447g;
        if (da0Var.f49452m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            da0Var.f49452m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = da0Var.b();
            da0Var.f49456q = b10;
            da0Var.f49452m.addView(b10, -1, -1);
            org.telegram.ui.Components.xw0 c10 = da0Var.c();
            da0Var.f49454o = c10;
            da0Var.f49452m.addView(c10, -1, -1);
            org.telegram.ui.Components.xw0 a10 = da0Var.a();
            da0Var.f49453n = a10;
            da0Var.f49452m.addView(a10, w7.x5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(n2Var.getParentActivity(), null);
            da0Var.f49455p = ll0Var;
            ll0Var.setAdapter(da0Var.f49446f);
            da0Var.f49455p.o1();
            da0Var.f49455p.setLayoutManager(c0Var);
            da0Var.f49455p.setOnItemClickListener(new bi.d(da0Var, 19));
            da0Var.f49455p.setOnScrollListener(da0Var.D);
            da0Var.f49455p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20753i6, n2Var.getResourceProvider()));
            da0Var.f49452m.addView(da0Var.f49455p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.pr.h);
            jVar.C = false;
            jVar.f45777m = false;
            da0Var.f49455p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = da0Var.f49452m;
        this.actionBar.A(da0Var.f49455p, false);
        da0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xh.m mVar = this.f43437a.f49458s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
