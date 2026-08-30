package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class sh implements r0.o, lf.d0, org.telegram.ui.ActionBar.c2 {
    public final xn f38340a;

    public sh(xn xnVar) {
        this.f38340a = xnVar;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f7213a;
        int i11 = defaultWindowInsets.f7215c;
        xn xnVar = this.f38340a;
        if (xnVar.Ra != i10 || xnVar.Sa != i11) {
            xnVar.Ra = i10;
            xnVar.Sa = i11;
            xnVar.U0.requestLayout();
        }
        xnVar.v.i(m1Var);
        ug.e eVar = xnVar.H3;
        if (eVar != null) {
            eVar.setPadding(i10, 0, i11, 0);
        }
        xnVar.n7();
        xnVar.r7();
        xnVar.p9();
        boolean p10 = m1Var.f43130a.p(8);
        if (xnVar.Qa != p10) {
            xnVar.Qa = p10;
            xnVar.U0.S();
        }
        ek ekVar = xnVar.f40109n1;
        if (ekVar != null) {
            r0.j0.b(ekVar, m1Var);
        }
        return r0.m1.f43129b;
    }

    @Override
    public void a(int i10) {
        xn.S0(this.f38340a, i10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        xn xnVar = this.f38340a;
        xnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            xnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
