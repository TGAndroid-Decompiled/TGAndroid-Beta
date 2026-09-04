package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public final class yh implements r0.n, yf.b0, org.telegram.ui.ActionBar.a2 {
    public final co f43118a;

    public yh(co coVar) {
        this.f43118a = coVar;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.f11425a;
        int i11 = defaultWindowInsets.f11427c;
        co coVar = this.f43118a;
        if (coVar.Ua != i10 || coVar.Va != i11) {
            coVar.Ua = i10;
            coVar.Va = i11;
            coVar.X0.requestLayout();
        }
        coVar.v.i(l1Var);
        ih.f fVar = coVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        coVar.n7();
        coVar.r7();
        coVar.p9();
        boolean p5 = l1Var.f44711a.p(8);
        if (coVar.Ta != p5) {
            coVar.Ta = p5;
            coVar.X0.S();
        }
        di.i1 i1Var = coVar.f35383q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.f44710b;
    }

    @Override
    public void a(int i10) {
        co.S0(this.f43118a, i10);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        co coVar = this.f43118a;
        coVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            coVar.getParentActivity().startActivity(intent);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
