package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sh0 extends org.telegram.ui.ActionBar.p2 {
    public final org.telegram.ui.Components.fa0 f38229a;

    public sh0(long j10) {
        super(null);
        this.f38229a = new org.telegram.ui.Components.fa0(this, this, getLayoutContainer(), j10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 25));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.fa0 fa0Var = this.f38229a;
        if (fa0Var.f9460a) {
            i10 = R.string.SubscribeRequests;
        } else {
            i10 = R.string.MemberRequests;
        }
        kVar.setTitle(LocaleController.getString(i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new hb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.p2 p2Var = fa0Var.f9464g;
        if (fa0Var.f9469m == null) {
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            fa0Var.f9469m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, p2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = fa0Var.b();
            fa0Var.f9473q = b10;
            fa0Var.f9469m.addView(b10, -1, -1);
            org.telegram.ui.Components.zw0 c3 = fa0Var.c();
            fa0Var.f9471o = c3;
            fa0Var.f9469m.addView(c3, -1, -1);
            org.telegram.ui.Components.zw0 a10 = fa0Var.a();
            fa0Var.f9470n = a10;
            fa0Var.f9469m.addView(a10, k7.b6.c(-1.0f, -1));
            p2Var.getParentActivity();
            f2.i0 i0Var = new f2.i0();
            org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(p2Var.getParentActivity(), null);
            fa0Var.f9472p = rl0Var;
            rl0Var.setAdapter(fa0Var.f9463f);
            fa0Var.f9472p.o1();
            fa0Var.f9472p.setLayoutManager(i0Var);
            fa0Var.f9472p.setOnItemClickListener(new dg.n(fa0Var, 5));
            fa0Var.f9472p.setOnScrollListener(fa0Var.D);
            fa0Var.f9472p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, p2Var.getResourceProvider()));
            fa0Var.f9469m.addView(fa0Var.f9472p, -1, -1);
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.mr.h);
            lVar.C = false;
            lVar.f5807m = false;
            fa0Var.f9472p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = fa0Var.f9469m;
        this.actionBar.A(fa0Var.f9472p, false);
        fa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        jh.u uVar = this.f38229a.f9475s;
        if (uVar != null) {
            if (z4) {
                uVar.e(false);
            }
            return false;
        }
        return true;
    }
}
