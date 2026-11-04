package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class zg implements org.telegram.messenger.d9, uq0, r0.m, org.telegram.ui.ActionBar.p1 {
    public final wm f52672a;

    public zg(wm wmVar) {
        this.f52672a = wmVar;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        wm wmVar = this.f52672a;
        r0.k1 N8 = wmVar.N8(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(N8, false);
        int i3 = I0.f14495a;
        int i10 = I0.f14497c;
        if (wmVar.f51430ob != i3 || wmVar.f51443pb != i10) {
            wmVar.f51430ob = i3;
            wmVar.f51443pb = i10;
            wmVar.m1.requestLayout();
        }
        wmVar.f51520w.j(N8);
        ai.o2 o2Var = wmVar.Z3;
        if (o2Var != null) {
            o2Var.setPadding(i3, 0, i10, 0);
        }
        wmVar.B7();
        wmVar.F7();
        wmVar.L9();
        boolean p10 = N8.f54026a.p(8);
        if (wmVar.f51417nb != p10) {
            wmVar.f51417nb = p10;
            wmVar.m1.R();
        }
        gi.g1 g1Var = wmVar.F1;
        if (g1Var != null) {
            r0.i0.b(g1Var, N8);
        }
        return r0.k1.f54025b;
    }

    @Override
    public void a(float[] fArr) {
        wm wmVar = this.f52672a;
        fArr[1] = wmVar.A0.getBottom() - wmVar.Va;
        fArr[0] = (wmVar.A0.getTop() + wmVar.M9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        wm wmVar = this.f52672a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
            wmVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public boolean run() {
        wm wmVar = this.f52672a;
        if (wmVar.h == null && !wmVar.U9()) {
            return false;
        }
        return true;
    }
}
