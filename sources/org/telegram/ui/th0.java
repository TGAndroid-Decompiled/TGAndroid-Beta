package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class th0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.oa0 f38106a;

    public th0(long j3) {
        super(null);
        this.f38106a = new org.telegram.ui.Components.oa0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.oa0 oa0Var = this.f38106a;
        if (oa0Var.f45375a) {
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
        org.telegram.ui.ActionBar.m2 m2Var = oa0Var.f45379g;
        if (oa0Var.f45384m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            oa0Var.f45384m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18989a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = oa0Var.b();
            oa0Var.f45388q = b10;
            oa0Var.f45384m.addView(b10, -1, -1);
            org.telegram.ui.Components.ix0 c10 = oa0Var.c();
            oa0Var.f45386o = c10;
            oa0Var.f45384m.addView(c10, -1, -1);
            org.telegram.ui.Components.ix0 a10 = oa0Var.a();
            oa0Var.f45385n = a10;
            oa0Var.f45384m.addView(a10, w7.y5.c(-1.0f, -1));
            m2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(m2Var.getParentActivity(), null);
            oa0Var.f45387p = wl0Var;
            wl0Var.setAdapter(oa0Var.f45378f);
            oa0Var.f45387p.p1();
            oa0Var.f45387p.setLayoutManager(c0Var);
            oa0Var.f45387p.setOnItemClickListener(new ai.g(oa0Var, 19));
            oa0Var.f45387p.setOnScrollListener(oa0Var.D);
            oa0Var.f45387p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19134i6, m2Var.getResourceProvider()));
            oa0Var.f45384m.addView(oa0Var.f45387p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.rr.h);
            jVar.C = false;
            jVar.f42981m = false;
            oa0Var.f45387p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = oa0Var.f45384m;
        this.actionBar.z(oa0Var.f45387p, false);
        oa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f38106a.f45390s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
