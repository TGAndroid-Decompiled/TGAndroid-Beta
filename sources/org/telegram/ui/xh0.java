package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.qa0 f42888a;

    public xh0(long j3) {
        super(null);
        this.f42888a = new org.telegram.ui.Components.qa0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.qa0 qa0Var = this.f42888a;
        if (qa0Var.f49134a) {
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
        org.telegram.ui.ActionBar.n2 n2Var = qa0Var.f49139g;
        if (qa0Var.f49144m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            qa0Var.f49144m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20761a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.w00 b10 = qa0Var.b();
            qa0Var.f49148q = b10;
            qa0Var.f49144m.addView(b10, -1, -1);
            org.telegram.ui.Components.tx0 c10 = qa0Var.c();
            qa0Var.f49146o = c10;
            qa0Var.f49144m.addView(c10, -1, -1);
            org.telegram.ui.Components.tx0 a10 = qa0Var.a();
            qa0Var.f49145n = a10;
            qa0Var.f49144m.addView(a10, w7.z5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(n2Var.getParentActivity(), null);
            qa0Var.f49147p = zl0Var;
            zl0Var.setAdapter(qa0Var.f49138f);
            qa0Var.f49147p.s1();
            qa0Var.f49147p.setLayoutManager(c0Var);
            qa0Var.f49147p.setOnItemClickListener(new ai.g(qa0Var, 19));
            qa0Var.f49147p.setOnScrollListener(qa0Var.D);
            qa0Var.f49147p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20908i6, n2Var.getResourceProvider()));
            qa0Var.f49144m.addView(qa0Var.f49147p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.tr.h);
            jVar.C = false;
            jVar.f46562m = false;
            qa0Var.f49147p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = qa0Var.f49144m;
        this.actionBar.z(qa0Var.f49147p, false);
        qa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f42888a.f49150s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
