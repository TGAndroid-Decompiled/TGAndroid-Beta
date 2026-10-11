package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.eb0 f44701a;

    public zh0(long j3) {
        super(null);
        this.f44701a = new org.telegram.ui.Components.eb0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.eb0 eb0Var = this.f44701a;
        if (eb0Var.f50550a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.m2 m2Var = eb0Var.f50555g;
        if (eb0Var.f50560m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            eb0Var.f50560m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.k10 b10 = eb0Var.b();
            eb0Var.f50564q = b10;
            eb0Var.f50560m.addView(b10, -1, -1);
            org.telegram.ui.Components.by0 c10 = eb0Var.c();
            eb0Var.f50562o = c10;
            eb0Var.f50560m.addView(c10, -1, -1);
            org.telegram.ui.Components.by0 a10 = eb0Var.a();
            eb0Var.f50561n = a10;
            eb0Var.f50560m.addView(a10, w7.x5.d(-1.0f, -1));
            m2Var.getParentActivity();
            s4.d0 d0Var = new s4.d0();
            org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(m2Var.getParentActivity(), null);
            eb0Var.f50563p = rm0Var;
            rm0Var.setAdapter(eb0Var.f50554f);
            eb0Var.f50563p.p1();
            eb0Var.f50563p.setLayoutManager(d0Var);
            eb0Var.f50563p.setOnItemClickListener(new ai.g(eb0Var, 19));
            eb0Var.f50563p.setOnScrollListener(eb0Var.D);
            eb0Var.f50563p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, m2Var.getResourceProvider()));
            eb0Var.f50560m.addView(eb0Var.f50563p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.is.h);
            jVar.C = false;
            jVar.f47822m = false;
            eb0Var.f50563p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = eb0Var.f50560m;
        this.actionBar.B(eb0Var.f50563p, false);
        eb0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.k kVar = this.f44701a.f50566s;
        if (kVar != null) {
            if (z10) {
                kVar.e(false);
            }
            return false;
        }
        return true;
    }
}
