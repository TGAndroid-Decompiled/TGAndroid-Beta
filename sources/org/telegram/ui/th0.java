package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class th0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.pa0 f38122a;

    public th0(long j3) {
        super(null);
        this.f38122a = new org.telegram.ui.Components.pa0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.pa0 pa0Var = this.f38122a;
        if (pa0Var.f45388a) {
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
        org.telegram.ui.ActionBar.m2 m2Var = pa0Var.f45392g;
        if (pa0Var.f45397m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            pa0Var.f45397m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.v00 b10 = pa0Var.b();
            pa0Var.f45401q = b10;
            pa0Var.f45397m.addView(b10, -1, -1);
            org.telegram.ui.Components.jx0 c10 = pa0Var.c();
            pa0Var.f45399o = c10;
            pa0Var.f45397m.addView(c10, -1, -1);
            org.telegram.ui.Components.jx0 a10 = pa0Var.a();
            pa0Var.f45398n = a10;
            pa0Var.f45397m.addView(a10, w7.y5.c(-1.0f, -1));
            m2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(m2Var.getParentActivity(), null);
            pa0Var.f45400p = xl0Var;
            xl0Var.setAdapter(pa0Var.f45391f);
            pa0Var.f45400p.p1();
            pa0Var.f45400p.setLayoutManager(c0Var);
            pa0Var.f45400p.setOnItemClickListener(new ai.g(pa0Var, 19));
            pa0Var.f45400p.setOnScrollListener(pa0Var.D);
            pa0Var.f45400p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19148i6, m2Var.getResourceProvider()));
            pa0Var.f45397m.addView(pa0Var.f45400p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.sr.h);
            jVar.C = false;
            jVar.f42994m = false;
            pa0Var.f45400p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = pa0Var.f45397m;
        this.actionBar.z(pa0Var.f45400p, false);
        pa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f38122a.f45403s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
