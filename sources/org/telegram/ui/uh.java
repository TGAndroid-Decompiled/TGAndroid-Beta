package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class uh implements r0.o, kf.d0, org.telegram.ui.ActionBar.c2 {
    public final zn f38814a;

    public uh(zn znVar) {
        this.f38814a = znVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7196a;
        int i11 = defaultWindowInsets.f7198c;
        zn znVar = this.f38814a;
        if (znVar.Ra != i10 || znVar.Sa != i11) {
            znVar.Ra = i10;
            znVar.Sa = i11;
            znVar.U0.requestLayout();
        }
        znVar.v.i(m1Var);
        ug.e eVar = znVar.H3;
        if (eVar != null) {
            eVar.setPadding(i10, 0, i11, 0);
        }
        znVar.n7();
        znVar.r7();
        znVar.p9();
        boolean p10 = m1Var.f43154a.p(8);
        if (znVar.Qa != p10) {
            znVar.Qa = p10;
            znVar.U0.S();
        }
        gk gkVar = znVar.f40675n1;
        if (gkVar != null) {
            r0.j0.b(gkVar, m1Var);
        }
        return r0.m1.f43153b;
    }

    @Override
    public void a(int i10) {
        zn.S0(this.f38814a, i10);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        zn znVar = this.f38814a;
        znVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            znVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
