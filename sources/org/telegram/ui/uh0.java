package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.da0 f38112a;

    public uh0(long j3) {
        super(null);
        this.f38112a = new org.telegram.ui.Components.da0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.da0 da0Var = this.f38112a;
        if (da0Var.f45061a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = da0Var.f45065g;
        if (da0Var.f45070m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            da0Var.f45070m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18733a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = da0Var.b();
            da0Var.f45074q = b10;
            da0Var.f45070m.addView(b10, -1, -1);
            org.telegram.ui.Components.xw0 c10 = da0Var.c();
            da0Var.f45072o = c10;
            da0Var.f45070m.addView(c10, -1, -1);
            org.telegram.ui.Components.xw0 a10 = da0Var.a();
            da0Var.f45071n = a10;
            da0Var.f45070m.addView(a10, w7.x5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(n2Var.getParentActivity(), null);
            da0Var.f45073p = ml0Var;
            ml0Var.setAdapter(da0Var.f45064f);
            da0Var.f45073p.p1();
            da0Var.f45073p.setLayoutManager(c0Var);
            da0Var.f45073p.setOnItemClickListener(new ai.g(da0Var, 19));
            da0Var.f45073p.setOnScrollListener(da0Var.D);
            da0Var.f45073p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18878i6, n2Var.getResourceProvider()));
            da0Var.f45070m.addView(da0Var.f45073p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.rr.h);
            jVar.C = false;
            jVar.f42662m = false;
            da0Var.f45073p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = da0Var.f45070m;
        this.actionBar.z(da0Var.f45073p, false);
        da0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f38112a.f45076s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
