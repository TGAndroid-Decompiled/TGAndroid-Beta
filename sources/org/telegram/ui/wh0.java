package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wh0 extends org.telegram.ui.ActionBar.o2 {
    public final org.telegram.ui.Components.pa0 f39346a;

    public wh0(long j3) {
        super(null);
        this.f39346a = new org.telegram.ui.Components.pa0(this, this, getLayoutContainer(), j3);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.Components.pa0 pa0Var = this.f39346a;
        if (pa0Var.f45435a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        lVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.o2 o2Var = pa0Var.f45439g;
        if (pa0Var.f45444m == null) {
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            pa0Var.f45444m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19001a7, o2Var.getResourceProvider()));
            org.telegram.ui.Components.v00 b10 = pa0Var.b();
            pa0Var.f45448q = b10;
            pa0Var.f45444m.addView(b10, -1, -1);
            org.telegram.ui.Components.kx0 c10 = pa0Var.c();
            pa0Var.f45446o = c10;
            pa0Var.f45444m.addView(c10, -1, -1);
            org.telegram.ui.Components.kx0 a10 = pa0Var.a();
            pa0Var.f45445n = a10;
            pa0Var.f45444m.addView(a10, w7.y5.c(-1.0f, -1));
            o2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(o2Var.getParentActivity(), null);
            pa0Var.f45447p = yl0Var;
            yl0Var.setAdapter(pa0Var.f45438f);
            pa0Var.f45447p.q1();
            pa0Var.f45447p.setLayoutManager(c0Var);
            pa0Var.f45447p.setOnItemClickListener(new ai.g(pa0Var, 19));
            pa0Var.f45447p.setOnScrollListener(pa0Var.D);
            pa0Var.f45447p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19147i6, o2Var.getResourceProvider()));
            pa0Var.f45444m.addView(pa0Var.f45447p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.sr.h);
            jVar.C = false;
            jVar.f43040m = false;
            pa0Var.f45447p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = pa0Var.f45444m;
        this.actionBar.A(pa0Var.f45447p, false);
        pa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.f39346a.f45450s;
        if (mVar != null) {
            if (z10) {
                mVar.e(false);
            }
            return false;
        }
        return true;
    }
}
