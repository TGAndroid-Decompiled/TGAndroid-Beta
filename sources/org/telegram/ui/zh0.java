package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.fb0 f44667a;

    public zh0(long j3) {
        super(null);
        this.f44667a = new org.telegram.ui.Components.fb0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.fb0 fb0Var = this.f44667a;
        if (fb0Var.f50516a) {
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
        org.telegram.ui.ActionBar.m2 m2Var = fb0Var.f50521g;
        if (fb0Var.f50526m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            fb0Var.f50526m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20730a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.k10 b10 = fb0Var.b();
            fb0Var.f50530q = b10;
            fb0Var.f50526m.addView(b10, -1, -1);
            org.telegram.ui.Components.cy0 c10 = fb0Var.c();
            fb0Var.f50528o = c10;
            fb0Var.f50526m.addView(c10, -1, -1);
            org.telegram.ui.Components.cy0 a10 = fb0Var.a();
            fb0Var.f50527n = a10;
            fb0Var.f50526m.addView(a10, w7.x5.d(-1.0f, -1));
            m2Var.getParentActivity();
            s4.d0 d0Var = new s4.d0();
            org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(m2Var.getParentActivity(), null);
            fb0Var.f50529p = sm0Var;
            sm0Var.setAdapter(fb0Var.f50520f);
            fb0Var.f50529p.p1();
            fb0Var.f50529p.setLayoutManager(d0Var);
            fb0Var.f50529p.setOnItemClickListener(new ai.g(fb0Var, 19));
            fb0Var.f50529p.setOnScrollListener(fb0Var.D);
            fb0Var.f50529p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, m2Var.getResourceProvider()));
            fb0Var.f50526m.addView(fb0Var.f50529p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.is.h);
            jVar.C = false;
            jVar.f47788m = false;
            fb0Var.f50529p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = fb0Var.f50526m;
        this.actionBar.B(fb0Var.f50529p, false);
        fb0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.k kVar = this.f44667a.f50532s;
        if (kVar != null) {
            if (z10) {
                kVar.e(false);
            }
            return false;
        }
        return true;
    }
}
