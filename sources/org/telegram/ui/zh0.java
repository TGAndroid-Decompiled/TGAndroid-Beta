package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.ca0 f40217a;

    public zh0(long j3) {
        super(null);
        this.f40217a = new org.telegram.ui.Components.ca0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ca0 ca0Var = this.f40217a;
        if (ca0Var.f45111a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = ca0Var.f45115g;
        if (ca0Var.f45120m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            ca0Var.f45120m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18780a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = ca0Var.b();
            ca0Var.f45124q = b10;
            ca0Var.f45120m.addView(b10, -1, -1);
            org.telegram.ui.Components.yw0 c10 = ca0Var.c();
            ca0Var.f45122o = c10;
            ca0Var.f45120m.addView(c10, -1, -1);
            org.telegram.ui.Components.yw0 a10 = ca0Var.a();
            ca0Var.f45121n = a10;
            ca0Var.f45120m.addView(a10, w7.x5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(n2Var.getParentActivity(), null);
            ca0Var.f45123p = ll0Var;
            ll0Var.setAdapter(ca0Var.f45114f);
            ca0Var.f45123p.p1();
            ca0Var.f45123p.setLayoutManager(c0Var);
            ca0Var.f45123p.setOnItemClickListener(new ai.g(ca0Var, 19));
            ca0Var.f45123p.setOnScrollListener(ca0Var.D);
            ca0Var.f45123p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18926i6, n2Var.getResourceProvider()));
            ca0Var.f45120m.addView(ca0Var.f45123p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.f42710m = false;
            ca0Var.f45123p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ca0Var.f45120m;
        this.actionBar.z(ca0Var.f45123p, false);
        ca0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f40217a.f45126s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
