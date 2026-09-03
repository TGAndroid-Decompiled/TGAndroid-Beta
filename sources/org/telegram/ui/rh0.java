package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rh0 extends org.telegram.ui.ActionBar.p2 {
    public final org.telegram.ui.Components.ga0 f40851a;

    public rh0(long j10) {
        super(null);
        this.f40851a = new org.telegram.ui.Components.ga0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 25));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ga0 ga0Var = this.f40851a;
        if (ga0Var.f11304a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.p2 p2Var = ga0Var.f11309g;
        if (ga0Var.f11314m == null) {
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            ga0Var.f11314m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, p2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = ga0Var.b();
            ga0Var.f11318q = b10;
            ga0Var.f11314m.addView(b10, -1, -1);
            org.telegram.ui.Components.zw0 c3 = ga0Var.c();
            ga0Var.f11316o = c3;
            ga0Var.f11314m.addView(c3, -1, -1);
            org.telegram.ui.Components.zw0 a10 = ga0Var.a();
            ga0Var.f11315n = a10;
            ga0Var.f11314m.addView(a10, k7.c6.c(-1.0f, -1));
            p2Var.getParentActivity();
            f2.j0 j0Var = new f2.j0();
            org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(p2Var.getParentActivity(), null);
            ga0Var.f11317p = sl0Var;
            sl0Var.setAdapter(ga0Var.f11308f);
            ga0Var.f11317p.o1();
            ga0Var.f11317p.setLayoutManager(j0Var);
            ga0Var.f11317p.setOnItemClickListener(new ag.h(ga0Var, 6));
            ga0Var.f11317p.setOnScrollListener(ga0Var.D);
            ga0Var.f11317p.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, p2Var.getResourceProvider()));
            ga0Var.f11314m.addView(ga0Var.f11317p, -1, -1);
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.pr.h);
            lVar.C = false;
            lVar.f5910m = false;
            ga0Var.f11317p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = ga0Var.f11314m;
        this.actionBar.A(ga0Var.f11317p, false);
        ga0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        kh.u uVar = this.f40851a.f11320s;
        if (uVar != null) {
            if (z4) {
                uVar.e(false);
            }
            return false;
        }
        return true;
    }
}
