package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class yh implements r0.n, yf.a0, org.telegram.ui.ActionBar.a2 {
    public final bo f39881a;

    public yh(bo boVar) {
        this.f39881a = boVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f10588a;
        int i11 = defaultWindowInsets.f10590c;
        bo boVar = this.f39881a;
        if (boVar.Ua != i10 || boVar.Va != i11) {
            boVar.Ua = i10;
            boVar.Va = i11;
            boVar.X0.requestLayout();
        }
        boVar.v.i(l1Var);
        hh.f fVar = boVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        boVar.n7();
        boVar.r7();
        boVar.p9();
        boolean p5 = l1Var.f41855a.p(8);
        if (boVar.Ta != p5) {
            boVar.Ta = p5;
            boVar.X0.S();
        }
        ci.i1 i1Var = boVar.f32434q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.f41854b;
    }

    @Override
    public void a(int i10) {
        bo.S0(this.f39881a, i10);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        bo boVar = this.f39881a;
        boVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            boVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
