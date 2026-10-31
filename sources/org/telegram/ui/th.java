package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
public final class th implements org.telegram.messenger.j9, ps0, r0.m, org.telegram.ui.ActionBar.u1 {
    public final un f41843a;

    public th(un unVar) {
        this.f41843a = unVar;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        un unVar = this.f41843a;
        r0.j1 G8 = unVar.G8(j1Var);
        i0.c I0 = org.telegram.messenger.i0.I0(G8, false);
        int i10 = I0.f7765a;
        int i11 = I0.f7767c;
        if (unVar.f42352nb != i10 || unVar.f42365ob != i11) {
            unVar.f42352nb = i10;
            unVar.f42365ob = i11;
            unVar.l1.requestLayout();
        }
        unVar.f42453w.j(G8);
        org.telegram.ui.Components.voip.i0 i0Var = unVar.Y3;
        if (i0Var != null) {
            i0Var.setPadding(i10, 0, i11, 0);
        }
        unVar.v7();
        unVar.z7();
        unVar.B9();
        boolean p5 = G8.f46132a.p(8);
        if (unVar.f42338mb != p5) {
            unVar.f42338mb = p5;
            unVar.l1.R();
        }
        hk hkVar = unVar.E1;
        if (hkVar != null) {
            r0.h0.b(hkVar, G8);
        }
        return r0.j1.f46131b;
    }

    @Override
    public void a(float[] fArr) {
        un unVar = this.f41843a;
        fArr[1] = unVar.f42492z0.getBottom() - unVar.Ua;
        fArr[0] = (unVar.f42492z0.getTop() + unVar.L9) - org.telegram.messenger.i0.L(4.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        un unVar = this.f41843a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
            unVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public boolean run() {
        un unVar = this.f41843a;
        if (unVar.h == null && !unVar.K9()) {
            return false;
        }
        return true;
    }
}
