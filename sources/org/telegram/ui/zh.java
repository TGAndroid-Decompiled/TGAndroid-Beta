package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
public final class zh implements FlagSecureReason.FlagSecureCondition, mv0, r0.n, yf.b0, org.telegram.ui.ActionBar.a2 {
    public final zn f40145a;

    public zh(zn znVar) {
        this.f40145a = znVar;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.f10591a;
        int i11 = defaultWindowInsets.f10593c;
        zn znVar = this.f40145a;
        if (znVar.Ta != i10 || znVar.Ua != i11) {
            znVar.Ta = i10;
            znVar.Ua = i11;
            znVar.X0.requestLayout();
        }
        znVar.v.i(m1Var);
        hh.f fVar = znVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        znVar.n7();
        znVar.r7();
        znVar.p9();
        boolean p5 = m1Var.f42109a.p(8);
        if (znVar.Sa != p5) {
            znVar.Sa = p5;
            znVar.X0.S();
        }
        ci.i1 i1Var = znVar.f40398q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, m1Var);
        }
        return r0.m1.f42108b;
    }

    @Override
    public void a(int i10) {
        zn.V0(this.f40145a, i10);
    }

    @Override
    public void b(float[] fArr) {
        zn znVar = this.f40145a;
        fArr[1] = znVar.f40488x0.getBottom() - znVar.Aa;
        fArr[0] = (znVar.f40488x0.getTop() + znVar.f40433s9) - AndroidUtilities.dp(4.0f);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        zn znVar = this.f40145a;
        znVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            znVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean run() {
        zn znVar = this.f40145a;
        if (znVar.h == null && !znVar.y9()) {
            return false;
        }
        return true;
    }
}
