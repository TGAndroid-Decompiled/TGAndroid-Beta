package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class th0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.ra0 f38233a;

    public th0(long j3) {
        super(null);
        this.f38233a = new org.telegram.ui.Components.ra0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ra0 ra0Var = this.f38233a;
        if (ra0Var.f45497a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.m2 m2Var = ra0Var.f45501g;
        if (ra0Var.f45506m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            ra0Var.f45506m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19020a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.w00 b10 = ra0Var.b();
            ra0Var.f45510q = b10;
            ra0Var.f45506m.addView(b10, -1, -1);
            org.telegram.ui.Components.lx0 c10 = ra0Var.c();
            ra0Var.f45508o = c10;
            ra0Var.f45506m.addView(c10, -1, -1);
            org.telegram.ui.Components.lx0 a10 = ra0Var.a();
            ra0Var.f45507n = a10;
            ra0Var.f45506m.addView(a10, w7.y5.c(-1.0f, -1));
            m2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(m2Var.getParentActivity(), null);
            ra0Var.f45509p = zl0Var;
            zl0Var.setAdapter(ra0Var.f45500f);
            ra0Var.f45509p.s1();
            ra0Var.f45509p.setLayoutManager(c0Var);
            ra0Var.f45509p.setOnItemClickListener(new ai.g(ra0Var, 19));
            ra0Var.f45509p.setOnScrollListener(ra0Var.D);
            ra0Var.f45509p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19165i6, m2Var.getResourceProvider()));
            ra0Var.f45506m.addView(ra0Var.f45509p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.tr.h);
            jVar.C = false;
            jVar.f43103m = false;
            ra0Var.f45509p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ra0Var.f45506m;
        this.actionBar.z(ra0Var.f45509p, false);
        ra0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f38233a.f45512s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
