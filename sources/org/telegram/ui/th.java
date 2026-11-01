package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class th implements org.telegram.messenger.k9, os0, r0.m, org.telegram.ui.ActionBar.u1 {
    public final un f41644a;

    public th(un unVar) {
        this.f41644a = unVar;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        un unVar = this.f41644a;
        r0.j1 K8 = unVar.K8(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(K8, false);
        int i10 = I0.f7766a;
        int i11 = I0.f7768c;
        if (unVar.f42163nb != i10 || unVar.f42176ob != i11) {
            unVar.f42163nb = i10;
            unVar.f42176ob = i11;
            unVar.l1.requestLayout();
        }
        unVar.f42264w.j(K8);
        org.telegram.ui.Components.voip.j0 j0Var = unVar.Y3;
        if (j0Var != null) {
            j0Var.setPadding(i10, 0, i11, 0);
        }
        unVar.z7();
        unVar.D7();
        unVar.G9();
        boolean p5 = K8.f46143a.p(8);
        if (unVar.f42149mb != p5) {
            unVar.f42149mb = p5;
            unVar.l1.R();
        }
        hk hkVar = unVar.E1;
        if (hkVar != null) {
            r0.h0.b(hkVar, K8);
        }
        return r0.j1.f46142b;
    }

    @Override
    public void a(float[] fArr) {
        un unVar = this.f41644a;
        fArr[1] = unVar.f42303z0.getBottom() - unVar.Ua;
        fArr[0] = (unVar.f42303z0.getTop() + unVar.L9) - org.telegram.messenger.i0.L(4.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        un unVar = this.f41644a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
            unVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public boolean run() {
        un unVar = this.f41644a;
        if (unVar.h == null && !unVar.P9()) {
            return false;
        }
        return true;
    }
}
