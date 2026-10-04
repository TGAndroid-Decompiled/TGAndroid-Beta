package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.qa0 f42896a;

    public xh0(long j3) {
        super(null);
        this.f42896a = new org.telegram.ui.Components.qa0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.qa0 qa0Var = this.f42896a;
        if (qa0Var.f49143a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = qa0Var.f49148g;
        if (qa0Var.f49153m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            qa0Var.f49153m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20766a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.w00 b10 = qa0Var.b();
            qa0Var.f49157q = b10;
            qa0Var.f49153m.addView(b10, -1, -1);
            org.telegram.ui.Components.tx0 c10 = qa0Var.c();
            qa0Var.f49155o = c10;
            qa0Var.f49153m.addView(c10, -1, -1);
            org.telegram.ui.Components.tx0 a10 = qa0Var.a();
            qa0Var.f49154n = a10;
            qa0Var.f49153m.addView(a10, w7.z5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(n2Var.getParentActivity(), null);
            qa0Var.f49156p = zl0Var;
            zl0Var.setAdapter(qa0Var.f49147f);
            qa0Var.f49156p.s1();
            qa0Var.f49156p.setLayoutManager(c0Var);
            qa0Var.f49156p.setOnItemClickListener(new ai.g(qa0Var, 19));
            qa0Var.f49156p.setOnScrollListener(qa0Var.D);
            qa0Var.f49156p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20913i6, n2Var.getResourceProvider()));
            qa0Var.f49153m.addView(qa0Var.f49156p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.tr.h);
            jVar.C = false;
            jVar.f46570m = false;
            qa0Var.f49156p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = qa0Var.f49153m;
        this.actionBar.z(qa0Var.f49156p, false);
        qa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f42896a.f49159s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
